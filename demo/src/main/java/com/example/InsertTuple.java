package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class InsertTuple {
	private Connection conn = null;
	private Statement stmt = null;
	private String table;
	private Connection Conn;
	private String sql;
	
	public InsertTuple(DBConnection dBConnection) {
		//assert("error");
		conn = dBConnection.getConn();
	
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void InsertDummy(int id, String name, int grade) {
	    StringBuilder sb = new StringBuilder();
	    table = "dummy";
		 String sql = sb.append("insert into " + table + " values(")
	                .append(id + ",")
	                .append("'" + name + "',")
	                .append(grade)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertCustomerInfo(String customer_id, String first_name, String middle_name, String last_name, String house_phone,
			String cell_phone){
	    StringBuilder sb = new StringBuilder();
	    table = "customer_info";
		 String sql = sb.append("insert into " + table + " values(")
	                .append(customer_id + ",")
	                .append("'" + first_name + "',")
	                .append("'" + middle_name + "',")
	                .append("'" + last_name + "',")
	                .append("'" + house_phone + "',")
	                .append("'" + cell_phone + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
}
