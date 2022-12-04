package com.example.environmentsettings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.example.DBConnection;


/* pk  설정하는 법
 * String createString = "create table SUPPLIERSPK " +
 *              "(SUP_ID INTEGER NOT NULL, " +
 *              "SUP_NAME VARCHAR(40), " +
 *              "STREET VARCHAR(40), " +
 *              "CITY VARCHAR(20), " +
 *              "STATE CHAR(2), " +
 *              "ZIP CHAR(5), " +
 *              "primary key(SUP_ID))";
 *  Statement stmt; 
 */

//

/* fk 설정하는법
 * foreign key(SUP_ID) reference table_name (tt_id);
 */


public class CreateTable {
	private Connection conn = null;
	private Statement stmt = null;
	private String sql;
	
	public CreateTable() {
		//assert("error");
	}
	
	public CreateTable(DBConnection dBConnection) {
		conn = dBConnection.getConn();
		
		try {
			stmt = conn.createStatement();
            
            //customer_info table generation
			StringBuilder sb = new StringBuilder();
            sql = sb.append("create table if not exists customer_info(")
                    .append("customer_id varchar(20),")
                    .append("first_name varchar(20),")
                    .append("middle_name varchar(20),")
                    .append("last_name varchar(20),")
                    .append("house_phone varchar(20),")
                    .append("cell_phone varchar(20),")
                    .append("primary key(customer_id)")
                    .append(");").toString();
 
            stmt.execute(sql);
            System.out.println("customer_info table has been generated!");
            sb.delete(0,sb.length());

            //customer_address table generation
            sql = sb.append("create table if not exists customer_address(")
                    .append("address_1 varchar(20),")
                    .append("address_2 varchar(20),")
                    .append("customer_id varchar(20),")
                    .append("town_city varchar(20),")
                    .append("province_territory varchar(20),")
                    .append("zip int,")
                    .append("pccc bigint,")
                    .append("building_pwd int,")
                    .append("primary key(address_1, address_2),")
                    .append("foreign key(customer_id)")
                    .append("references customer_info(customer_id) on update cascade")
                    .append(");").toString();
 
            stmt.execute(sql);
            System.out.println("customer_address table has been generated!");
            sb.delete(0,sb.length());
            
            
            //customer_organization table generation
            sql = sb.append("create table if not exists customer_organization(")
                    .append("name varchar(20),")
                    .append("customer_id varchar(20),")
                    .append("phone varchar(20),")
                    .append("primary key(name),")
                    .append("foreign key(customer_id)")
                    .append("references customer_info(customer_id) on update cascade")
                    .append(");").toString();
 
            stmt.execute(sql);
            System.out.println("customer_organization table has been generated!");
            sb.delete(0,sb.length());
            
            
            //payment table generation
            sql = sb.append("create table if not exists payment(")
                    .append("card_number varchar(16),")
                    .append("customer_id varchar(20),")
                    .append("card_type varchar(20),")
                    .append("cvc varchar(3),")
                    .append("expiration_year varchar(2),")
                    .append("expiration_month varchar(2),")
                    .append("primary key(card_number),")
                    .append("foreign key(customer_id)")
                    .append("references customer_info(customer_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("payment table has been generated!");
            sb.delete(0,sb.length());
                
            //area table generation
            sql = sb.append("create table if not exists area(")
                    .append("area_id varchar(20),")
                    .append("primary key(area_id)")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("area table has been generated!");
            sb.delete(0,sb.length());

            //worker table generation
            sql = sb.append("create table if not exists worker(")
                    .append("worker_id varchar(20),")
                    .append("area_id varchar(20),")
                    .append("first_name varchar(20),")
                    .append("middle_name varchar(20),")
                    .append("last_name varchar(20),")
                    .append("house_phone varchar(20),")
                    .append("cell_phone varchar(20),")
                    .append("doe timestamp default current_timestamp,")
                    .append("primary key(worker_id),")
                    .append("foreign key(area_id)")
                    .append("references area(area_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("worker table has been generated!");
            sb.delete(0,sb.length());
                
            //salary_log table generation
            sql = sb.append("create table if not exists salary_log(")
                    .append("date varchar(8),")
                    .append("worker_id varchar(20),")
                    .append("monthly_pay varchar(30),")
                    .append("incentive varchar(20),")
                    .append("primary key(date),")
                    .append("foreign key(worker_id)")
                    .append("references worker(worker_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("salary_log table has been generated!");
            sb.delete(0,sb.length());
                
                
            //nation table generation
            sql = sb.append("create table if not exists nation(")
                    .append("nation_type tinyint,")
                    .append("primary key(nation_type)")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("nation table has been generated!");
            sb.delete(0,sb.length());
                
                
            //driver_license table generation
            sql = sb.append("create table if not exists driver_license(")
                    .append("license_type tinyint,")
                    .append("nation_type tinyint,")
                    .append("primary key(license_type),")
                    .append("foreign key(nation_type)")
                    .append("references nation(nation_type) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("driver_license table has been generated!");
            sb.delete(0,sb.length());
                
                
            //unit_measure_size table generation
            sql = sb.append("create table if not exists unit_measure_size(")
                    .append("unit_measure_size_type tinyint,")
                    .append("primary key(unit_measure_size_type)")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("unit_measure_size table has been generated!");
            sb.delete(0,sb.length());
            
          //vehicle table generation
            sql = sb.append("create table if not exists vehicle(")
                    .append("plate_number varchar(20),")
                    .append("nation_type tinyint,")
                    .append("unit_measure_size_type tinyint,")
                    .append("width int,")
                    .append("height int,")
                    .append("depth int,")
                    .append("primary key(plate_number),")
                    .append("foreign key(nation_type)")
                    .append("references nation(nation_type) on update cascade,")
                    .append("foreign key(unit_measure_size_type)")
                    .append("references unit_measure_size(unit_measure_size_type) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("vehicle table has been generated!");
            sb.delete(0,sb.length());
            
            //driver_info table generation
            sql = sb.append("create table if not exists driver_info(")
                    .append("worker_id varchar(20),")
                    .append("vehicle_id varchar(20),")
                    .append("license_type tinyint,")
                    .append("foreign key(worker_id)")
                    .append("references worker(worker_id) on update cascade,")
                    .append("foreign key(vehicle_id)")
                    .append("references vehicle(plate_number) on update cascade,")
                    .append("foreign key(license_type)")
                    .append("references driver_license(license_type) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("driver_info table has been generated!");
            sb.delete(0,sb.length());
            
            //warehouse table generation
            sql = sb.append("create table if not exists warehouse(")
                    .append("warehouse_id varchar(20),")
                    .append("area_id varchar(20),")
                    .append("warehouse_name varchar(20),")
                    .append("primary key(warehouse_id),")
                    .append("foreign key(area_id)")
                    .append("references area(area_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("warehouse table has been generated!");
            sb.delete(0,sb.length());
            
            //warehouse_worker_info table generation
            sql = sb.append("create table if not exists warehouse_worker_info(")
                    .append("worker_id varchar(20),")
                    .append("warehouse_id varchar(20),")
                    .append("foreign key(worker_id)")
                    .append("references worker(worker_id) on update cascade,")
                    .append("foreign key(warehouse_id)")
                    .append("references warehouse(warehouse_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("warehouse_worker_info table has been generated!");
            sb.delete(0,sb.length());
            
          //unit_measure_weight table generation
            sql = sb.append("create table if not exists unit_measure_weight(")
                    .append("unit_measure_weight_type tinyint,")
                    .append("primary key(unit_measure_weight_type)")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("unit_measure_weight table has been generated!");
            sb.delete(0,sb.length());
            
            
          //parcel table generation
            sql = sb.append("create table if not exists parcel(")
                    .append("parcel_id varchar(20),")
                    .append("customer_id varchar(20),")
                    .append("unit_measure_size_type tinyint,")
                    .append("unit_measure_weight_type tinyint,")
                    .append("weight float,")
                    .append("width float,")
                    .append("depth float,")
                    .append("is_fragile tinyint,")
                    .append("primary key(parcel_id),")
                    .append("foreign key(customer_id)")
                    .append("references customer_info(customer_id) on update cascade,")
                    .append("foreign key(unit_measure_size_type)")
                    .append("references unit_measure_size(unit_measure_size_type) on update cascade,")
                    .append("foreign key(unit_measure_weight_type)")
                    .append("references unit_measure_weight(unit_measure_weight_type) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("parcel table has been generated!");
            sb.delete(0,sb.length());
            
            
            //whole_request table generation
            sql = sb.append("create table if not exists whole_request(")
                    .append("id varchar(20),")
                    .append("sender_address varchar(20),")
                    .append("customer_id varchar(20),")
                    .append("parcel_id varchar(20),")
                    .append("time_stamp date,")
                    .append("departure_area_id tinyint,")
                    .append("arrival_area_id tinyint,")
                    .append("receiver_address varchar(20),")
                    .append("receiver_id varchar(20),")
                    .append("primary key(id),")
                    .append("foreign key(sender_address)")
                    .append("references customer_address(address_1) on update cascade,")
                    .append("foreign key(customer_id)")
                    .append("references customer_address(customer_id) on update cascade,")
                    .append("foreign key(parcel_id)")
                    .append("references parcel(parcel_id) on update cascade,")
                    .append("foreign key(receiver_address)")
                    .append("references customer_address(address_1) on update cascade,")
                    .append("foreign key(receiver_id)")
                    .append("references customer_address(customer_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("whole_request table has been generated!");
            sb.delete(0,sb.length());
            
          //warehouse_connection table generation
            sql = sb.append("create table if not exists warehouse_connection(")
                    .append("start_warehouse_area varchar(20),")
                    .append("dest_warehouse_area varchar(20),")
                    .append("edge_weight int,")
                    .append("foreign key(start_warehouse_area)")
                    .append("references area(area_id) on update cascade,")
                    .append("foreign key(dest_warehouse_area)")
                    .append("references area(area_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("warehouse_connection table has been generated!");
            sb.delete(0,sb.length());

            //a2a_request table generation
            sql = sb.append("create table if not exists a2a_request(")
                    .append("a2a_id varchar(20),")
                    .append("whole_request_id varchar(20),")
                    .append("worker_id varchar(20),")
                    .append("vehicle_id varchar(20),")
                    .append("is_done tinyint,")
                    .append("departure tinyint,")
                    .append("arrival tinyint,")
                    .append("done_time_stamp date,")
                    .append("primary key (a2a_id),")
                    .append("foreign key(whole_request_id)")
                    .append("references whole_request(id) on update cascade,")
                    .append("foreign key(worker_id)")
                    .append("references driver_info(worker_id) on update cascade,")
                    .append("foreign key(vehicle_id)")
                    .append("references driver_info(vehicle_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("a2a_request table has been generated!");
            sb.delete(0,sb.length());
           
            
          //d2a_request table generation
            sql = sb.append("create table if not exists d2a_request(")
                    .append("customer_id varchar(20),")
                    .append("whole_request_id varchar(20),")
                    .append("worker_id varchar(20),")
                    .append("vehicle_id varchar(20),")
                    .append("warehouse_id varchar(20),")
                    .append("from_d tinyint,")
                    .append("is_done tinyint,")
                    .append("done_time_stamp date,")
                    .append("foreign key(customer_id)")
                    .append("references customer_info(customer_id) on update cascade,")
                    .append("foreign key(whole_request_id)")
                    .append("references whole_request(id) on update cascade,")
                    .append("foreign key(worker_id)")
                    .append("references driver_info(worker_id) on update cascade,")
                    .append("foreign key(vehicle_id)")
                    .append("references driver_info(vehicle_id) on update cascade,")
                    .append("foreign key(warehouse_id)")
                    .append("references warehouse(warehouse_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("d2a_request table has been generated!");
            sb.delete(0,sb.length());
            
            
          //cs_department table generation
            sql = sb.append("create table if not exists cs_department(")
                    .append("cs_department_id varchar(20),")
                    .append("area_id varchar(20),")
                    .append("primary key (cs_department_id),")
                    .append("foreign key(area_id)")
                    .append("references area(area_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("cs_department table has been generated!");
            sb.delete(0,sb.length());
            
          //cs_worker_info table generation
            sql = sb.append("create table if not exists cs_worker_info(")
                    .append("worker_id varchar(20),")
                    .append("cs_department_id varchar(20),")
                    .append("seat_no int,")
                    .append("foreign key(worker_id)")
                    .append("references worker(worker_id) on update cascade,")
                    .append("foreign key(cs_department_id)")
                    .append("references cs_department(cs_department_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("cs_worker_info table has been generated!");
            sb.delete(0,sb.length());
            
          //board table generation
            sql = sb.append("create table if not exists board(")
                    .append("complaint_id varchar(20),")
                    .append("whole_request_id varchar(20),")
                    .append("question_type tinyint,")
                    .append("title varchar(20),")
                    .append("body varchar(20),")
                    .append("is_answered tinyint,")
                    .append("primary key (complaint_id),")
                    .append("foreign key(whole_request_id)")
                    .append("references whole_request(id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("board table has been generated!");
            sb.delete(0,sb.length());
            
          //board_answer table generation
            sql = sb.append("create table if not exists board_answer(")
                    .append("complaint_id varchar(20),")
                    .append("worker_id varchar(20),")
                    .append("title varchar(100),")
                    .append("body varchar(300),")
                    .append("foreign key(complaint_id)")
                    .append("references board(complaint_id) on update cascade,")
                    .append("foreign key(worker_id)")
                    .append("references cs_worker_info(worker_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("board_answer table has been generated!");
            sb.delete(0,sb.length());
            
          //fedex_market table generation
            sql = sb.append("create table if not exists fedex_market(")
                    .append("item_code varchar(20),")
                    .append("unit_measure_size_type tinyint,")
                    .append("unit_measure_weight_type tinyint,")
                    .append("item_name varchar(20),")
                    .append("item_price int,")
                    .append("item_type varchar(20),")
                    .append("weight float,")
                    .append("width float,")
                    .append("height float,")
                    .append("depth float,")
                    .append("primary key(item_code),")
                    .append("foreign key(unit_measure_size_type)")
                    .append("references unit_measure_size(unit_measure_size_type) on update cascade,")
                    .append("foreign key(unit_measure_weight_type)")
                    .append("references unit_measure_weight(unit_measure_weight_type) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("fedex_market table has been generated!");
            sb.delete(0,sb.length());
            
            
          //fedex_inventory table generation
            sql = sb.append("create table if not exists fedex_inventory(")
                    .append("item_code varchar(20),")
                    .append("area_id varchar(20),")
                    .append("count int,")
                    .append("foreign key(item_code)")
                    .append("references fedex_market(item_code) on update cascade,")
                    .append("foreign key(area_id)")
                    .append("references area(area_id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("fedex_inventory table has been generated!");
            sb.delete(0,sb.length());
            
          //pickup table generation
            sql = sb.append("create table if not exists pickup(")
                    .append("whole_request_id varchar(20),")
                    .append("is_delegate tinyint,")
                    .append("is_untact tinyint,")
                    .append("message varchar(50),")
                    .append("foreign key(whole_request_id)")
                    .append("references whole_request(id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("pickup table has been generated!");
            sb.delete(0,sb.length());
            
            //delegate_info table generation
            sql = sb.append("create table if not exists delegate_info(")
                    .append("whole_request_id varchar(20),")
                    .append("message varchar(20),")
                    .append("nickname varchar(20),")
                    .append("cell_phone varchar(20),")
                    .append("relationship varchar(20),")
                    .append("foreign key(whole_request_id)")
                    .append("references whole_request(id) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("delegate_info table has been generated!");
            sb.delete(0,sb.length());
            
          //worker_base_pay table generation
            sql = sb.append("create table if not exists worker_base_pay(")
                    .append("seniority int,")
                    .append("plus_amount int,")
                    .append("primary key(seniority)")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("worker_base_pay table has been generated!");
            sb.delete(0,sb.length());
            
          //regulated_base_pay table generation
            sql = sb.append("create table if not exists regulated_base_pay(")
                    .append("year int,")
                    .append("base_pay int,")
                    .append("primary key(year)")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("regulated_base_pay table has been generated!");
            sb.delete(0,sb.length());
            
          //request_minimum_charge table generation
            sql = sb.append("create table if not exists request_minimum_charge(")
                    .append("year int,")
                    .append("minimum_charge int,")
                    .append("primary key(year)")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("request_minimum_charge table has been generated!");
            sb.delete(0,sb.length());
            
            
             
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
