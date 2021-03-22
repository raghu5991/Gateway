package com.company.bean;

public class ResponseDev {
	private String name;
	private String role;
	private double exp;
	private String address;
	@Override
	public String toString() {
		return "ResponseDev [name=" + name + ", role=" + role + ", exp=" + exp + ", address=" + address + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
