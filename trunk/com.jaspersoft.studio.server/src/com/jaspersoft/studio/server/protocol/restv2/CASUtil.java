/*******************************************************************************
 * Copyright (C) 2010 - 2016. TIBCO Software Inc. 
 * All Rights Reserved. Confidential & Proprietary.
 ******************************************************************************/
package com.jaspersoft.studio.server.protocol.restv2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.IOUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.ProtocolException;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpResponseException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.fluent.Executor;
import org.apache.http.client.fluent.Form;
import org.apache.http.client.fluent.Request;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultRedirectStrategy;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.protocol.HttpContext;
import org.eclipse.core.runtime.IProgressMonitor;

import com.jaspersoft.studio.server.model.server.ServerProfile;
import com.jaspersoft.studio.server.preferences.CASListFieldEditor;
import com.jaspersoft.studio.server.preferences.CASPreferencePage;
import com.jaspersoft.studio.server.preferences.SSOServer;
import com.jaspersoft.studio.server.protocol.ConnectionManager;
import com.jaspersoft.studio.server.utils.HttpUtils;
import com.jaspersoft.studio.server.utils.Pass;
import com.jaspersoft.studio.utils.jasper.JasperReportsConfiguration;

import net.sf.jasperreports.eclipse.util.CastorHelper;
import net.sf.jasperreports.eclipse.util.FileUtils;

public class CASUtil {
	public static String getToken(ServerProfile sp, IProgressMonitor monitor)
			throws Exception {
		String v = null;
		v = JasperReportsConfiguration.getDefaultInstance().getPrefStore()
				.getString(CASPreferencePage.CAS);
		for (String line : v.split("\n")) {
			if (line.isEmpty())
				continue;
			SSOServer srv = null;
			try {
				srv = (SSOServer) CastorHelper.read(new ByteArrayInputStream(
						Base64.decodeBase64(line)), CASListFieldEditor
						.getMapping());
			} catch (Exception e) {
				e.printStackTrace();
				continue;
			}
			if (srv.getUuid().equals(sp.getSsoUuid()))
				return doGetTocken(sp, srv, monitor);
		}
		throw new Exception("Could not find SSO Server in the list.");
	}

	public static String doGetTocken(ServerProfile sp, SSOServer srv,
			IProgressMonitor monitor) throws Exception {
		SSLContext sslContext = SSLContext.getInstance("SSL");

		// set up a TrustManager that trusts everything
		sslContext.init(null, new TrustManager[] { new X509TrustManager() {
			public X509Certificate[] getAcceptedIssuers() {
				// System.out.println("getAcceptedIssuers =============");
				return null;
			}

			public void checkClientTrusted(X509Certificate[] certs,
					String authType) {
				// System.out.println("checkClientTrusted =============");
			}

			public void checkServerTrusted(X509Certificate[] certs,
					String authType) {
				// System.out.println("checkServerTrusted =============");
			}
		} }, new SecureRandom());

		// Allow TLSv1 protocol only
		SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(
				sslContext, new String[] { "TLSv1" }, null,
				SSLConnectionSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);

		CloseableHttpClient httpclient = HttpClients
				.custom()
				.setSSLSocketFactory(sslsf)
				.setRedirectStrategy(new DefaultRedirectStrategy() {
					@Override
					protected boolean isRedirectable(String arg0) {
						// TODO Auto-generated method stub
						return super.isRedirectable(arg0);
					}

					@Override
					public boolean isRedirected(HttpRequest request,
							HttpResponse response, HttpContext context)
							throws ProtocolException {
						// TODO Auto-generated method stub
						return super.isRedirected(request, response, context);
					}
				})
				.setDefaultCookieStore(new BasicCookieStore())
				.setUserAgent(
						"Mozilla/5.0 (X11; Ubuntu; Linux x86_64; rv:31.0) Gecko/20100101 Firefox/31.0")
				.build();

		Executor exec = Executor.newInstance(httpclient);

		URIBuilder ub = new URIBuilder(sp.getUrl() + "index.html");

		String fullURL = ub.build().toASCIIString();
		Request req = HttpUtils.get(fullURL, sp);
		HttpHost proxy = net.sf.jasperreports.eclipse.util.HttpUtils
				.getUnauthProxy(exec, new URI(fullURL));
		if (proxy != null)
			req.viaProxy(proxy);
		String tgtID = readData(exec, req, monitor);
		String action = getFormAction(tgtID);
		if (action != null) {
			action = action.replaceFirst("/", "");
			int indx = action.indexOf(";jsession");
			if (indx >= 0)
				action = action.substring(0, indx);
		} else
			action = "cas/login";
		String url = srv.getUrl();
		if (!url.endsWith("/"))
			url += "/";
		ub = new URIBuilder(url + action);
		//
		fullURL = ub.build().toASCIIString();
		req = HttpUtils.get(fullURL, sp);
		proxy = net.sf.jasperreports.eclipse.util.HttpUtils.getUnauthProxy(
				exec, new URI(fullURL));
		if (proxy != null)
			req.viaProxy(proxy);
		tgtID = readData(exec, req, monitor);
		action = getFormAction(tgtID);
		action = action.replaceFirst("/", "");

		ub = new URIBuilder(url + action);
		Map<String, String> map = getInputs(tgtID);
		Form form = Form.form();
		for (String key : map.keySet()) {
			if (key.equals("btn-reset"))
				continue;
			else if (key.equals("username")) {
				form.add(key, srv.getUser());
				continue;
			} else if (key.equals("password")) {
				form.add(key, Pass.getPass(srv.getPassword()));
				continue;
			}
			form.add(key, map.get(key));
		}
		//
		req = HttpUtils.post(ub.build().toASCIIString(), form, sp);
		if (proxy != null)
			req.viaProxy(proxy);
		// Header header = null;
		readData(exec, req, monitor);
		// for (Header h : headers) {
		// for (HeaderElement he : h.getElements()) {
		// if (he.getName().equals("CASTGC")) {
		// header = new BasicHeader("Cookie", h.getValue());
		// break;
		// }
		// }
		// }
		ub = new URIBuilder(url + action);
		url = sp.getUrl();
		if (!url.endsWith("/"))
			url += "/";
		ub.addParameter("service", url + "j_spring_security_check");

		req = HttpUtils.get(ub.build().toASCIIString(), sp);
		if (proxy != null)
			req.viaProxy(proxy);
		// req.addHeader("Accept",
		// "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8, value");
		req.addHeader("Referrer", sp.getUrl());
		// req.addHeader(header);
		String html = readData(exec, req, monitor);
		Matcher matcher = ahrefPattern.matcher(html);
		while (matcher.find()) {
			Map<String, String> attributes = parseAttributes(matcher.group(1));
			String v = attributes.get("href");
			int ind = v.indexOf("ticket=");
			if (ind > 0) {
				return v.substring(ind + "ticket=".length());
			}
		}
		return null;
	}

	private static Map<String, String> getInputs(String html) {
		Map<String, String> map = new HashMap<String, String>();
		Matcher matcher = inputPattern.matcher(html);
		while (matcher.find()) {
			Map<String, String> attributes = parseAttributes(matcher.group(1));
			map.put(attributes.get("name"), attributes.get("value"));
		}
		return map;
	}

	private static String getFormAction(String html) {
		Matcher matcher = formPattern.matcher(html);
		while (matcher.find()) {
			Map<String, String> attributes = parseAttributes(matcher.group(1));
			return attributes.get("action");
		}
		return null;
	}

	private static final Pattern formPattern = Pattern.compile("<form(.*?)>",
			Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	private static final Pattern inputPattern = Pattern.compile("<input(.*?)>",
			Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	private static final Pattern ahrefPattern = Pattern.compile("<a(.*?)>",
			Pattern.CASE_INSENSITIVE | Pattern.DOTALL);
	private static final Pattern attributePattern = Pattern
			.compile("(\\w+)=\"(.*?)\"");

	private static Map<String, String> parseAttributes(String attributesStr) {
		Map<String, String> attributes = new HashMap<String, String>();
		Matcher matcher = attributePattern.matcher(attributesStr);
		while (matcher.find()) {
			String key = matcher.group(1);
			String value = "";
			String g = matcher.group(2).trim();
			if (g != null)
				value = g;
			attributes.put(key, value.trim());
		}
		return attributes;
	}

	private static String readData(Executor exec, Request req,
			IProgressMonitor monitor) throws IOException {
		String obj = null;
		ConnectionManager.register(monitor, req);
		try {
			obj = exec.execute(req).handleResponse(
					new ResponseHandler<String>() {

						public String handleResponse(final HttpResponse response)
								throws IOException {
							HttpEntity entity = response.getEntity();
							InputStream in = null;
							String res = null;
							try {
								StatusLine statusLine = response
										.getStatusLine();
								// System.out
								// .println("---------------------------------------------------------------------------");
								// System.out.println(response.toString());
								// for (Header h : response.getAllHeaders()) {
								// System.out.println(h.toString());
								// }

								switch (statusLine.getStatusCode()) {
								case 200:
									in = getContent(entity);
									res = IOUtils.toString(in);
									break;
								default:
									throw new HttpResponseException(statusLine
											.getStatusCode(), statusLine
											.getReasonPhrase());
								}
							} finally {
								FileUtils.closeStream(in);
							}
							return res;
						}

						protected InputStream getContent(HttpEntity entity)
								throws ClientProtocolException, IOException {
							if (entity == null)
								throw new ClientProtocolException(
										"Response contains no content");
							return entity.getContent();
						}
					});
		} catch (IOException e) {
			e.printStackTrace();
			throw e;
		} finally {
			ConnectionManager.unregister(req);
		}
		return obj;
	}

}
