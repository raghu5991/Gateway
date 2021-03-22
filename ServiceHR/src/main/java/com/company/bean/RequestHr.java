package com.company.bean;

public class RequestHr {
	private int holidays;
	private int leaves;
	private String typeleave;
	private double exp;
	public int getHolidays() {
		return holidays;
	}
	public void setHolidays(int holidays) {
		this.holidays = holidays;
	}
	public int getLeaves() {
		return leaves;
	}
	public void setLeaves(int leaves) {
		this.leaves = leaves;
	}
	public String getTypeleave() {
		return typeleave;
	}
	public void setTypeleave(String typeleave) {
		this.typeleave = typeleave;
	}
	public double getExp() {
		return exp;
	}
	public void setExp(double exp) {
		this.exp = exp;
	}
	@Override
	public String toString() {
		return "RequestHr [holidays=" + holidays + ", leaves=" + leaves + ", typeleave=" + typeleave + ", exp=" + exp
				+ "]";
	}
	
	

}
