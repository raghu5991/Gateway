package com.company.bean;

public class TrainFromTo {
	private String source;
	private String destination;
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
		return "TrainFromTo [source=" + source + ", destination=" + destination + "]";
	}
	

}
