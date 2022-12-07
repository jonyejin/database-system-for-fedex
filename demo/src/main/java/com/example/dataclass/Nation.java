package com.example.dataclass;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Nation implements DataClass{
	private String nation_type;

	public Nation(){
		
	}

	public Nation(String nation_type) {
		super();
		this.nation_type = nation_type;
	}

	public String getNation_type() {
		return nation_type;
	}
	public void setNation_type(String nation_type) {
		this.nation_type = nation_type;
	}

	@Override
	public String toString() {
		return "Nation [nation_type=" + nation_type + "]";
	}

	@Override
	public void SelectTuple(ResultSet rs) {
		// TODO Auto-generated method stub
		try {
			while(rs.next()) {
				this.nation_type = rs.getString("nation_type");
				System.out.println(toString());
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
