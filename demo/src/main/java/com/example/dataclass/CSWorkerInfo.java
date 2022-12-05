package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CSWorkerInfo implements DataClass{
	private String worker_id;
	private String cs_department_id;
	private int seat_no;
	
	public CSWorkerInfo(String worker_id, String cs_department_id, int seat_no) {
		super();
		this.worker_id = worker_id;
		this.cs_department_id = cs_department_id;
		this.seat_no = seat_no;
	}
	public String getWorker_id() {
		return worker_id;
	}
	public void setWorker_id(String worker_id) {
		this.worker_id = worker_id;
	}
	public String getCs_department_id() {
		return cs_department_id;
	}
	public void setCs_department_id(String cs_department_id) {
		this.cs_department_id = cs_department_id;
	}
	public int getSeat_no() {
		return seat_no;
	}
	public void setSeat_no(int seat_no) {
		this.seat_no = seat_no;
	}
	
	@Override
	public String toString() {
		return "CSWorkerInfo [worker_id=" + worker_id + ", cs_department_id=" + cs_department_id + ", seat_no="
				+ seat_no + "]";
	}
	@Override
	public void SelectTuple(ResultSet rs) {
		try {
			while(rs.next()) {
				this.worker_id = rs.getString("worker_id");
				this.cs_department_id = rs.getString("cs_department_id");
				this.seat_no = rs.getInt("seat_no");
				toString();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
