package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;

public class WorkerBasePay implements DataClass {
	private int seniority;
	private int plus_amount;
	
	public WorkerBasePay(){
		
	}

	public WorkerBasePay(int seniority, int plus_amount) {
		super();
		this.seniority = seniority;
		this.plus_amount = plus_amount;
	}
	
	public int getSeniority() {
		return seniority;
	}
	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}
	public int getPlus_amount() {
		return plus_amount;
	}
	public void setPlus_amount(int plus_amount) {
		this.plus_amount = plus_amount;
	}
	@Override
	public String toString() {
		return "WorkerBasePay [seniority=" + seniority + ", plus_amount=" + plus_amount + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try{
			seniority = rs.getInt("seniority");
			plus_amount = rs.getInt("plus_amount");
			System.out.println(toString());
		}catch(SQLException e){
			e.getStackTrace();
		}
		
	}
}
