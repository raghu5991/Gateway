package com.company.bean;

public class RequestBa {
	private String name;
	private String client_name;
	@Override
	public String toString() {
		return "RequestBa [name=" + name + ", client_name=" + client_name + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClient_name() {
		return client_name;
	}
	public void setClient_name(String client_name) {
		this.client_name = client_name;
	}

}
