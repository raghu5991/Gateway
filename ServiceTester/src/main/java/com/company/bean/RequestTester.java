package com.company.bean;

public class RequestTester {
	private String toname;
	private String fromname;
	private String code;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getToname() {
		return toname;
	}
	public void setToname(String toname) {
		this.toname = toname;
	}
	public String getFromname() {
		return fromname;
	}
	public void setFromname(String fromname) {
		this.fromname = fromname;
	}
	@Override
	public String toString() {
		return "RequestTester [toname=" + toname + ", fromname=" + fromname + "]";
	}
	
}
