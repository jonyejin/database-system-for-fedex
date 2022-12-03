package com.example;

public class RequestMinimumCharge {
	private int year;
	private int minimum_charge;
	
	public RequestMinimumCharge(int year, int minimum_charge) {
		super();
		this.year = year;
		this.minimum_charge = minimum_charge;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMinimum_charge() {
		return minimum_charge;
	}
	public void setMinimum_charge(int minimum_charge) {
		this.minimum_charge = minimum_charge;
	}

	@Override
	public String toString() {
		return "RequestMinimumCharge [year=" + year + ", minimum_charge=" + minimum_charge + "]";
	}
}
