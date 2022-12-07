package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class RegulatedBasePay implements DataClass {
	private int year;
	private int base_pay;

	public RegulatedBasePay(){
		
	}
	
	public RegulatedBasePay(int year, int base_pay) {
		super();
		this.year = year;
		this.base_pay = base_pay;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getBase_pay() {
		return base_pay;
	}
	public void setBase_pay(int base_pay) {
		this.base_pay = base_pay;
	}

	@Override
	public String toString() {
		return "RegulatedBasePay [year=" + year + ", base_pay=" + base_pay + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			year  = rs.getInt("year");
			base_pay = rs.getInt("base_pay");
			System.out.println(toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
