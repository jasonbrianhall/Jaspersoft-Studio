package com.jaspersoft.studio.server.model.server;

import net.sf.jasperreports.repo.Resource;

public class ServerProfile implements Resource, Cloneable {
	private String name;
	private String url;
	private String user;
	private String pass;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
