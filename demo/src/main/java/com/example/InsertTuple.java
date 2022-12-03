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
	
	public void InsertCustomerAddress(String address_1, String address_2, String customer_id, String country_region,
			String town_city, String province_territory, int zip, long pccc, int building_pwd){
	    StringBuilder sb = new StringBuilder();
	    table = "customer_address";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + address_1 + "',")
	                .append("'" + address_2 + "',")
	                .append("'" + customer_id + "',")
	                .append("'" + country_region + "',")
	                .append("'" + town_city + "',")
	                .append("'" + province_territory + "',")
	                .append(zip + ",")
	                .append(pccc + ",")
	                .append(building_pwd )
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	 
	public void InsertCustomerOrganization(String name, String customer_id, String phone){
	    StringBuilder sb = new StringBuilder();
	    table = "customer_organization";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + name + "',")
	                .append("'" + customer_id + "',")
	                .append("'" + phone + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertPayment(String card_number, String customer_id, String card_type, String cvc, String expiration_year,
			String expiration_month){
	    StringBuilder sb = new StringBuilder();
	    table = "payment";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + card_number + "',")
	                .append("'" + customer_id + "',")
	                .append("'" + card_type + "',")
	                .append("'" + cvc + "',")
	                .append("'" + expiration_year + "',")
	                .append("'" + expiration_month + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertWorker(String worker_id, String area_id, String first_name, String middle_name, String last_name,
			String house_phone, String cell_phone, String doe){
	    StringBuilder sb = new StringBuilder();
	    table = "worker";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + worker_id + "',")
	                .append("'" + area_id + "',")
	                .append("'" + first_name + "',")
	                .append("'" + middle_name + "',")
	                .append("'" + last_name + "',")
	                .append("'" + house_phone + "',")
	                .append("'" + cell_phone + "',")
	                .append("'" + doe + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertSalaryLog(String date, String worker_id, String monthly_pay, String incentive){
	    StringBuilder sb = new StringBuilder();
	    table = "salary_log";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + date + "',")
	                .append("'" + worker_id + "',")
	                .append("'" + monthly_pay + "',")
	                .append("'" + incentive + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertDriverInfo(String worker_id, String vehicle_id, int license_type){
	    StringBuilder sb = new StringBuilder();
	    table = "driver_info";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + worker_id + "',")
	                .append("'" + vehicle_id + "',")
	                .append(license_type)
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
