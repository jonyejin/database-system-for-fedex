package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SalaryLog implements DataClass {
	private String date;
	private String worker_id;
	private String monthly_pay;
	private String incentive;

	public SalaryLog(){
		
	}
	
	public SalaryLog(String date, String worker_id, String monthly_pay, String incentive) {
		super();
		this.date = date;
		this.worker_id = worker_id;
		this.monthly_pay = monthly_pay;
		this.incentive = incentive;
	}
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(String worker_id) {
		this.worker_id = worker_id;
	}
	public String getMonthly_pay() {
		return monthly_pay;
	}
	public void setMonthly_pay(String monthly_pay) {
		this.monthly_pay = monthly_pay;
	}
	public String getIncentive() {
		return incentive;
	}
	public void setIncentive(String incentive) {
		this.incentive = incentive;
	}
	
	@Override
	public String toString() {
		return "SalaryLog [date=" + date + ", worker_id=" + worker_id + ", monthly_pay=" + monthly_pay + ", incentive="
				+ incentive + "]";
	}


	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub

		try {
			date = rs.getString("date");
			worker_id = rs.getString("worker_id");
			monthly_pay = rs.getString("monthly_pay");
			incentive = rs.getString("incentive");
			System.out.println(toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
