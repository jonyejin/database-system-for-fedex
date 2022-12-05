package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CSDepartment implements DataClass{
	private String cs_department_id;
	private String area_id;
	
	public CSDepartment(String cs_department_id, String area_id) {
		super();
		this.cs_department_id = cs_department_id;
		this.area_id = area_id;
	}
	public String getCs_department_id() {
		return cs_department_id;
	}
	public void setCs_department_id(String cs_department_id) {
		this.cs_department_id = cs_department_id;
	}
	public String getArea_id() {
		return area_id;
	}
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}
	
	@Override
	public String toString() {
		return "CSDepartment [cs_department_id=" + cs_department_id + ", area_id=" + area_id + "]";
	}
	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()) {
				this.cs_department_id = rs.getString("cs_department_id");
				this.area_id = rs.getString("area_id");
				toString();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
