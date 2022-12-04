package com.example.sqlsettings;

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
	
	public void DropTableName(String tableName) {		
		try {
			stmt = conn.createStatement();
			
			StringBuilder sb = new StringBuilder();
            sql = sb.append("DROP TABLE ")
            		.append(tableName)
                    .append(";").toString();
 
            stmt.execute(sql); //query문 날리기
            
            System.out.println("dummy table deleted!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
