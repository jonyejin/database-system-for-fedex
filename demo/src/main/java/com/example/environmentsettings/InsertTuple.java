package com.example.environmentsettings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.example.DBConnection;

public class InsertTuple {
	private Connection conn = null;
	private Statement stmt = null;
	private String table;
	private String sql;
	
	public InsertTuple(DBConnection dBConnection) {
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
	
	public void InsertWarehouseWorkerInfo(String worker_id, String warehouse_id){
	    StringBuilder sb = new StringBuilder();
	    table = "warehouse_worker_info";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + worker_id + "',")
	                .append("'" + warehouse_id + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}

	public void InsertArea(String area_id){
	    StringBuilder sb = new StringBuilder();
	    table = "area";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'"+area_id+"'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertWholeRequest(String id, String sender_address_id, String customer_id, String parcel_id, String time_stamp,
			int departure_area_id, int arrival_area_id, String receiver_address_id, String receiver_id){
	    StringBuilder sb = new StringBuilder();
	    table = "whole_request";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + id + "',")
	                .append("'" + sender_address_id + "',")
	                .append("'" + customer_id + "',")
	                .append("'" + parcel_id + "',")
	                .append("'" + time_stamp + "',")
	                .append(departure_area_id+",")
	                .append(arrival_area_id+",")
	                .append("'" + receiver_address_id + "',")
	                .append("'" + receiver_id + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertWarehouse(String warehouse_id, String warehouse_area, String warehouse_name) {
	    StringBuilder sb = new StringBuilder();
	    table = "warehouse";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + warehouse_id + "',")
	                .append("'" + warehouse_area + "',")
	                .append("'" + warehouse_name + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertWarehouseConnection(String start_warehouse_area, String dest_warehouse_area, int edge_weight)  {
	    StringBuilder sb = new StringBuilder();
	    table = "warehouse_connection";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + start_warehouse_area + "',")
	                .append("'" + dest_warehouse_area + "',")
	                .append(edge_weight)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertA2ARequest(String a2a_id, String whole_request_id, String worker_id, String plate_number, int is_done,
			int departure, int arrival, String done_time_stamp)  {
	    StringBuilder sb = new StringBuilder();
	    table = "a2a_request";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + a2a_id + "',")
	                .append("'" + whole_request_id + "',")
	                .append("'" + worker_id + "',")
	                .append("'" + plate_number + "',")
	                .append(is_done)
	                .append(departure)
	                .append(arrival)
	                .append("'" + done_time_stamp + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertVehicle(String plate_number, int nation_type, int type, int width, int height, int depth) {
	    StringBuilder sb = new StringBuilder();
	    table = "vehicle";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + plate_number + "',")
	                .append(nation_type)
	                .append(type)
	                .append(width)
	                .append(height)
	                .append(depth)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertNation(String nation_type) {
	    StringBuilder sb = new StringBuilder();
	    table = "nation";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'"+nation_type+"'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertDriverLicense(int license_type, int nation_type) {
	    StringBuilder sb = new StringBuilder();
	    table = "driver_license";
		 String sql = sb.append("insert into " + table + " values(")
	                .append(license_type)
	                .append(nation_type)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertD2ARequest(String customer_id, String whole_request_id, String worker_id, String plate_number,
			String warehouse_id, int from_d, int is_done, String done_time_stamp) {
	    StringBuilder sb = new StringBuilder();
	    table = "d2a_request";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + customer_id + "',")
	                .append("'" + whole_request_id + "',")
	                .append("'" + worker_id + "',")
	                .append("'" + plate_number + "',")
	                .append("'" + warehouse_id + "',")
	                .append(from_d)
	                .append(is_done)
	                .append("'" + done_time_stamp + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertCSDepartment(String cs_department_id, String area_id) {
	    StringBuilder sb = new StringBuilder();
	    table = "cs_department";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + cs_department_id + "',")
	                .append("'" + area_id + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertCSWorkerInfo(String worker_id, String cs_department_id, int seat_no) {
	    StringBuilder sb = new StringBuilder();
	    table = "cs_worker_info";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + worker_id + "',")
	                .append("'" + cs_department_id + "',")
	                .append(seat_no)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertBoard(String complaint_id, String whole_request_id, int question_type, String title, String body,
			int is_answered){
	    StringBuilder sb = new StringBuilder();
	    table = "board";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + complaint_id + "',")
	                .append("'" + whole_request_id + "',")
	                .append(question_type)
	                .append("'" + title + "',")
	                .append("'" + body + "',")
	                .append(is_answered)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertBoardAnswer(String complaint_id, String cs_worker_id, String title, String body){
	    StringBuilder sb = new StringBuilder();
	    table = "board_answer";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + complaint_id + "',")
	                .append("'" + cs_worker_id + "',")
	                .append("'" + title + "',")
	                .append("'" + body + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertParcel(String parcel_id, String customer_id, int unit_measure_size_type, int unit_measure_weight_type,
			float weight, float width, float depth, int is_fragile){
	    StringBuilder sb = new StringBuilder();
	    table = "parcel";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + parcel_id + "',")
	                .append("'" + customer_id + "',")
	                .append(unit_measure_size_type)
	                .append(unit_measure_weight_type)
	                .append(weight)
	                .append(width)
	                .append(depth)
	                .append(is_fragile)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertUnitMeasureWeight(String parcel_id, String customer_id, int unit_measure_size_type, int unit_measure_weight_type,
			float weight, float width, float depth, int is_fragile){
	    StringBuilder sb = new StringBuilder();
	    table = "unit_measure_weight";
		 String sql = sb.append("insert into " + table + " values(")
	                .append(unit_measure_weight_type)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertUnitMeasureSize(int unit_measure_size_type){
	    StringBuilder sb = new StringBuilder();
	    table = "unit_measure_size";
		 String sql = sb.append("insert into " + table + " values(")
	                .append(unit_measure_size_type)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertFedexMarket(String item_code, int unit_measure_size_type, int unit_measure_weight_type, String item_name,
			int item_price, String item_type, float weight, float width, float height, float depth) {
	    StringBuilder sb = new StringBuilder();
	    table = "fedex_market";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + item_code + "',")
	                .append(unit_measure_size_type)
	                .append(unit_measure_weight_type)
	                .append("'" + item_name + "',")
	                .append(item_price)
	                .append(weight)
	                .append(width)
	                .append(height)
	                .append(depth)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertFedexInventory(String item_code, String area_id, int count){
	    StringBuilder sb = new StringBuilder();
	    table = "fedex_inventory";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + item_code + "',")
	                .append("'" + area_id + "',")
	                .append(count)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertPickUp(String id, int is_delegate, int is_untact, String message){
	    StringBuilder sb = new StringBuilder();
	    table = "pick_up";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + id + "',")
	                .append(is_delegate)
	                .append(is_untact)
	                .append("'" + message + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertDelegateInfo(String id, String message, String nickname, String cell_phone, String relationship) {
	    StringBuilder sb = new StringBuilder();
	    table = "delegate_info";
		 String sql = sb.append("insert into " + table + " values(")
	                .append("'" + id + "',")
	                .append("'" + message + "',")
	                .append("'" + nickname + "',")
	                .append("'" + cell_phone + "',")
	                .append("'" + relationship + "'")
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertWorkerBasePay(int seniority, int plus_amount) {
	    StringBuilder sb = new StringBuilder();
	    table = "worker_base_pay";
		 String sql = sb.append("insert into " + table + " values(")
	                .append(seniority)
	                .append(plus_amount)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertRegulatedBasePay(int year, int base_pay) {
	    StringBuilder sb = new StringBuilder();
	    table = "regulated_base_pay";
		 String sql = sb.append("insert into " + table + " values(")
	                .append(year)
	                .append(base_pay)
	                .append(");")
	                .toString();
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("insert "+table+ " tuple");
	     } catch (SQLException e) {
	            e.printStackTrace();
	     }
	}
	
	public void InsertRequestMinimumCharge(int year, int minimum_charge) {
	    StringBuilder sb = new StringBuilder();
	    table = "request_minimum_charge";
		 String sql = sb.append("insert into " + table + " values(")
	                .append(year)
	                .append(minimum_charge)
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
