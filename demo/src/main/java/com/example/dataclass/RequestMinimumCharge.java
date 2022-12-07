package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RequestMinimumCharge implements DataClass {
	private int year;
	private int minimum_charge;

	public RequestMinimumCharge(){
		
	}
	
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

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			year  = rs.getInt("year");
			minimum_charge = rs.getInt("minimum_charge");
			System.out.println(toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
