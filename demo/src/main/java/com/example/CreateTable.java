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
			StringBuilder sb = new StringBuilder();
            sql = sb.append("create table if not exists dummy(")
                    .append("id int,")
                    .append("name varchar(20),")
                    .append("grade int")
                    .append(");").toString();
 
            stmt.execute(sql); //query문 날리기
            System.out.println("dummy table generate!");
            sb.delete(0,sb.length());
            
            //customer_info table gen
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
            System.out.println("customer_info table generate!");
            sb.delete(0,sb.length());
            
            
            //customer_address table gen
            sql = sb.append("create table if not exists customer_address(")
            		//여기여기여
                    .append("address_1 varchar(20),")
                    .append("address_2 varchar(20),")
                    .append("customer_id varchar(20),")
                    .append("country_region varchar(20),")
                    .append("town_city varchar(20),")
                    .append("province_territory varchar(20),")
                    .append("zip int,")
                    .append("pccc BIGINT,")
                    .append("building_pwd BIGINT,")
                    .append("primary key(address_1,address_2)")
                    //.append("foreign key(customer_id) reference table_name (tt_id)")
                    .append(");").toString();
 
            stmt.execute(sql);
            System.out.println("customer_info table generate!");
            sb.delete(0,sb.length());
            
            
            System.out.println("table generated!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}
}
