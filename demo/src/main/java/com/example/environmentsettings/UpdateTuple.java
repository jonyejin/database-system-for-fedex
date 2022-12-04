package com.example.environmentsettings;

import com.example.DBConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

public class UpdateTuple {

	private Connection conn = null;
	private Statement stmt = null;
	private String table;
	private String sql;
	
	public UpdateTuple(DBConnection DBConnection) {
		
		conn = DBConnection.getConn();
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void WithSetWhere(String Table, HashMap<String, String> Set, HashMap<String, String> SetType, HashMap<String, String> Where, HashMap<String, String> WhereType) {
		
		//desired format
//		UPDATE table_name
//		SET column1 = value1, column2 = value2, ...
//		WHERE column11 = value11 and column12 = value12;
		
		StringBuilder sb = new StringBuilder();
	    
//		query for table name
		setTable(Table);
	    
//		update body
	    sb.append("update " + getTable() + " ");
	    
//	    set body
	    sb.append("set ");
		for (String key: Set.keySet()) {
			sb.append(key + " = " + (SetType.get(key) == "String" ? "\"" : "") + Set.get(key) + (SetType.get(key) == "String" ? "\"" : "") + ", ");
		}
		
//		delete dangling ", "
		sb.delete(sb.length() - 2, sb.length());
		
//		where body
		sb.append(" where ");
		for (String key: Where.keySet()) {
			sb.append(key + " = " + (WhereType.get(key) == "String" ? "\"" : "") + Where.get(key) + (WhereType.get(key) == "String" ? "\"" : "") + " and ");
		}
		
//		delete dangling " and "
		sb.delete(sb.length() - 5, sb.length());
		
//		append ;
		sb.append(";");
		
		String sql = sb.toString();
		System.out.println(sql);
		
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("Successfully updated!");
	            
	     } catch (SQLException e) {
	    	 System.out.println("Update Failed.");
	     }

	}
	
	public void WithSet(String Table, HashMap<String, String> Set, HashMap<String, String> SetType) {
		
		//desired format
//		UPDATE table_name
//		SET column1 = value1, column2 = value2, ...
//		WHERE column11 = value11 and column12 = value12;
		
		StringBuilder sb = new StringBuilder();
	    
//		query for table name
		setTable(Table);
	    
//		update body
	    sb.append("update " + getTable() + " ");
	    
//	    set body
	    sb.append("set ");
	    for (String key: Set.keySet()) {
			sb.append(key + " = " + (SetType.get(key) == "String" ? "\"" : "") + Set.get(key) + (SetType.get(key) == "String" ? "\"" : "") + ", ");
	    }

//		delete dangling ", "
		sb.delete(sb.length() - 2, sb.length());
		
//		append ;
		sb.append(";");
		
		String sql = sb.toString();
		
		 try {
	            stmt.executeUpdate(sql);
	            System.out.println("Successfully updated!");	
	            
	     } catch (SQLException e) {
	    	 System.out.println("Update Failed.");
	     }


	}
	
	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		this.table = table;
	}
}