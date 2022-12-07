package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DriverLicense  implements DataClass{
	private String license_type;
	private String nation_type;
	
	public DriverLicense() {}
	public DriverLicense(String license_type, String nation_type) {
		super();
		this.license_type = license_type;
		this.nation_type = nation_type;
	}
	public String getLicense_type() {
		return license_type;
	}
	public void setLicense_type(String license_type) {
		this.license_type = license_type;
	}
	public String getNation_type() {
		return nation_type;
	}
	public void setNation_type(String nation_type) {
		this.nation_type = nation_type;
	}
	
	@Override
	public String toString() {
		return "DriverLicense [license_type=" + license_type + ", nation_type=" + nation_type + "]";
	}
	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()) {
				this.license_type = rs.getString("license_type");
				this.nation_type = rs.getString("nation_type");
				System.out.println(toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
