package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


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
			
			//dummy table gen
//			StringBuilder sb = new StringBuilder();
//            sql = sb.append("create table if not exists dummy(")
//                    .append("id int,")
//                    .append("name varchar(20),")
//                    .append("grade int")
//                    .append(");").toString();
// 
//            stmt.execute(sql); //query문 날리기
//            System.out.println("dummy table generate!");
//            sb.delete(0,sb.length());
            
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
                    .append("pccc int,")
                    .append("building_pwd int,")
                    .append("primary key(address_1),")
                    .append("primary key(address_2),")
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
                    .append("card_number varchar(15),")
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
                    .append("primary key(nation_type),")
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
                    .append("unit_measure_size tinyint,")
                    .append("primary key(unit_measure_size)")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("unit_measure_size table has been generated!");
            sb.delete(0,sb.length());
            
          //vehicle table generation
            sql = sb.append("create table if not exists vehicle(")
                    .append("plate_number varchar(20),")
                    .append("nation_type tinyint,")
                    .append("unit_measure_size tinyint,")
                    .append("width int,")
                    .append("height int,")
                    .append("depth int,")
                    .append("primary key(plate_number),")
                    .append("foreign key(nation_type)")
                    .append("references nation(nation_type) on update cascade,")
                    .append("foreign key(unit_measure_size)")
                    .append("references unit_measure_size(unit_measure_size) on update cascade")
                    .append(");").toString();
        
            stmt.execute(sql);
            System.out.println("vehicle table has been generated!");
            sb.delete(0,sb.length());
            
            //driver_info table generation
            sql = sb.append("create table if not exists driver_info(")
                    .append("worker_id varchar(20),")
                    .append("plate_number varchar(20),")
                    .append("license_type tinyint,")
                    .append("foreign key(worker_id)")
                    .append("references worker(worker_id) on update cascade,")
                    .append("foreign key(plate_number)")
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

           
        
            
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
