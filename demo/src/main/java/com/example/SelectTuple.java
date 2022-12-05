package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.example.dataclass.DataClass;

public class SelectTuple {
	private Connection conn = null;
	private Statement stmt = null;
	private String table;
	private String sql;
	
	public SelectTuple(DBConnection dBConnection) {
		conn = dBConnection.getConn();
	
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void SelectDummy (DataClass DC) {
	    List<Dummy> list = new ArrayList<>();
	    table = "dummy";
	    sql = "SELECT * FROM "+table;
	    
	    try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
			try(ResultSet rs = ps.executeQuery()) {
				while(rs.next()) {
					int id = rs.getInt("ID");
					String name = rs.getString("name");
					int grade = rs.getInt("grade");
					Dummy data = new Dummy(id, name, grade);
					list.add(data);
				}
				
				//print tuple
				System.out.println("--Select "+table+" Table Result------------");
				for(Dummy data: list) {
		    		System.out.println(data);
		    	}
				System.out.println("---------------------------------------");
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
	    
	}
	
}
