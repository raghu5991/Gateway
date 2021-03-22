package com.company.dao;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hr {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int holidays;
	private int leaves;
	private String typeleave;
	private double exp;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
		return "Hr [id=" + id + ", holidays=" + holidays + ", leaves=" + leaves + ", typeleave=" + typeleave + ", exp="
				+ exp + "]";
	}
	

}
