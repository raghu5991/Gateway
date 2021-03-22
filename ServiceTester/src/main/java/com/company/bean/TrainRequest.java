package com.company.bean;

public class TrainRequest {
	private String name;
	private String source;
	private String destination;
		public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "TrainRequest [name=" + name + ", source=" + source + ", destination=" + destination + "]";
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
}
