package com.example.environmentsettings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.example.DBConnection;


public class DropTable {
	private Connection conn = null;
	private Statement stmt = null;
	private String sql;
	
	public DropTable() {
		//assert("error");
	}
	
	public DropTable(DBConnection dBConnection) {
		conn = dBConnection.getConn();
	
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void DropTableAll() {
		DropTableName("customer_info, customer_address, customer_organization, payment, area, worker, salary_log, nation, driver_license, unit_measure_size, vehicle, driver_info, warehouse, warehouse_worker_info, unit_measure_weight, parcel, whole_request, warehouse_connection, a2a_request, d2a_request, cs_department, cs_worker_info, board, board_answer, fedex_market, fedex_inventory, pickup, delegate_info, worker_base_pay, regulated_base_pay, request_minimum_charge");
	}
	
//	public void DropTableWhat() {
//		DropTableName("customer_info");
//		DropTableName("customer_address");
//		DropTableName("customer_organization");
//		DropTableName("payment");
//		DropTableName("area");
//		DropTableName("worker");
//		DropTableName("salary_log");
//		DropTableName("nation");
//		DropTableName("driver_license");
//		DropTableName("unit_measure_size");
//		DropTableName("vehicle");
//		DropTableName("driver_info");
//		DropTableName("warehouse");
//		DropTableName("warehouse_worker_info");
//		DropTableName("unit_measure_weight");
//		DropTableName("parcel");
//		DropTableName("whole_request");
//		DropTableName("warehouse_connection");
//		DropTableName("a2a_request");
//		DropTableName("d2a_request");
//		DropTableName("cs_department");
//		DropTableName("cs_worker_info");
//		DropTableName("board");
//		DropTableName("board_answer");
//		DropTableName("fedex_market");
//		DropTableName("fedex_inventory");
//		DropTableName("pickup");
//		DropTableName("delegate_info");
//		DropTableName("worker_base_pay");
//		DropTableName("regulated_base_pay");
//		DropTableName("request_minimum_charge");
//	}
	
	public void DropTableName(String tableName) {		
		try {
			stmt = conn.createStatement();
			
			StringBuilder sb = new StringBuilder();
            sql = sb.append("DROP TABLE if exists ")
            		.append(tableName)
                    .append(";").toString();
 
            stmt.execute(sql); //query문 날리기
            
            System.out.println(tableName + " table has been deleted!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
