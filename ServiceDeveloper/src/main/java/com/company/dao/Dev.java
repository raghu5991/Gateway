package com.company.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Dev {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long dev_id;
	private String dev_name;
	private String dev_role;
	private double dev_exp;
	private String dev_address;
	public long getDev_id() {
		return dev_id;
	}
	public void setDev_id(long dev_id) {
		this.dev_id = dev_id;
	}
	public String getDev_name() {
		return dev_name;
	}
	public void setDev_name(String dev_name) {
		this.dev_name = dev_name;
	}
	public String getDev_role() {
		return dev_role;
	}
	public void setDev_role(String dev_role) {
		this.dev_role = dev_role;
	}
	public double getDev_exp() {
		return dev_exp;
	}
	public void setDev_exp(double dev_exp) {
		this.dev_exp = dev_exp;
	}
	public String getDev_address() {
		return dev_address;
	}
	public void setDev_address(String dev_address) {
		this.dev_address = dev_address;
	}
	@Override
	public String toString() {
		return "Dev [dev_id=" + dev_id + ", dev_name=" + dev_name + ", dev_role=" + dev_role + ", dev_exp=" + dev_exp
				+ ", dev_address=" + dev_address + "]";
	}
	
	

}
