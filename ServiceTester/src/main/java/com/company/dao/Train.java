package com.company.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long trianid;
	private String name;
	private String source;
	private String destination;
	public long getTrianid() {
		return trianid;
	}
	public void setTrianid(long trianid) {
		this.trianid = trianid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "Train [trianid=" + trianid + ", name=" + name + ", source=" + source + ", destination=" + destination
				+ "]";
	}
	

}
