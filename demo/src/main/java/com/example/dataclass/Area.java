package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Area implements DataClass {
	private String area_id;
	
	public Area(){

	}

	public Area(String area_id) {
		super();
		this.area_id = area_id;
	}

	public String getArea_id() {
		return area_id;
	}
	public void setArea_id(String area_id) {
		this.area_id = area_id;
	}

	@Override
	public String toString() {
		return "Area [area_id=" + area_id + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		try {
			while(rs.next()) {
				this.area_id = rs.getString("area_id");
				System.out.println(toString());
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}
