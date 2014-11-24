package com.jaspersoft.studio.community.utils;

/**
 * Custom exception suitable to notify errors during operations with the
 * Community tracker.
 * <p>
 * 
 * An HTTP status code ({@link #getHttpStatusCode()}) and the response body (
 * {@link #getResponseBodyAsString()}) could be set if more error details are
 * needed.
 * 
 * @author Massimo Rabbi (mrabbi@users.sourceforge.net)
 * 
 */
public class CommunityAPIException extends Exception {

	private static final long serialVersionUID = 1L;

	private int httpStatusCode = -1;
	private String responseBodyAsString = null;

	public CommunityAPIException() {
		super();
	}

	public CommunityAPIException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}
	
	public CommunityAPIException(String arg0) {
		super(arg0);
	}
	
	public CommunityAPIException(Throwable arg0) {
		super(arg0);
	}

	public int getHttpStatusCode() {
		return httpStatusCode;
	}

	public void setHttpStatusCode(int httpStatusCode) {
		this.httpStatusCode = httpStatusCode;
	}

	public String getResponseBodyAsString() {
		return responseBodyAsString;
	}

	public void setResponseBodyAsString(String responseBodyAsString) {
		this.responseBodyAsString = responseBodyAsString;
	}
	
}
