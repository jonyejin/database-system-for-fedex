package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


/*
 String createString = "create table SUPPLIERSPK " +
                "(SUP_ID INTEGER NOT NULL, " +
                "SUP_NAME VARCHAR(40), " +
                "STREET VARCHAR(40), " +
                "CITY VARCHAR(20), " +
                "STATE CHAR(2), " +
                "ZIP CHAR(5), " +
                "primary key(SUP_ID))";
    Statement stmt; 
 */

// foreign key(SUP_ID) reference table_name (tt_id);



public class CreateTable {
	private Connection conn = null;
	private Statement stmt = null;
		
	private Connection Conn;
	
	public CreateTable() {
		//assert("error");
	}
	
	public CreateTable(DBConnection dBConnection) {
		conn = dBConnection.getConn();
		
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void createTable() {
		List<dummy> list_dummies = my.getdummy();
    	for(dummy data: list_dummies) {
    		System.out.println(data);
    	}
    	
        //query 만들기
        StringBuilder sb = new StringBuilder();
        String sql = sb.append("create table if not exists dummy(")
                .append("id int,")
                .append("name varchar(20),")
                .append("grade int")
                .append(");").toString();

        //query문 날리기
        stmt.execute(sql);
	}
}
