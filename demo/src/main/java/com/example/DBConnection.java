package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	private String dburl; //민지
	private String dbuser; //민지
	private String dbpasswd; // 민지
	
	
	private Connection Conn;

public class DBConnection 
{
	//원후 
	private String dburl = "jdbc:mysql://localhost:3306/sys";
	private String dbuser = "test1";
	private String dbpasswd = "test1";
	//민지 
//	private String dburl = "jdbc:mysql://localhost:3306/mydatabase";
//	private String dbuser = "root";
//	private String dbpasswd = "1367";
	
	String sql = "SELECT * FROM student";
	
	public List<student> getstudents() {
		List<student> list = new ArrayList<>();
		
		
	}
	
	public DBConnection(String dburl, String dbuser, String dbpasswd) {
		setDburl(dburl);
		setDbuser(dbuser);
		setDbpasswd(dbpasswd);
		setConn(dburl,dbuser,dbpasswd);
	}

	public String getDburl() {
		return dburl;
	}


	private void setDburl(String dburl) {
		this.dburl = dburl;
	}


	public String getDbuser() {
		return dbuser;
	}


	private void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}


	public String getDbpasswd() {
		return dbpasswd;
	}


	private void setDbpasswd(String dbpasswd) {
		this.dbpasswd = dbpasswd;
	}


	public Connection getConn() {
		return Conn;
	}


	public void setConn(String dburl, String dbuser, String dbpasswd) {
		try {
			Conn = DriverManager.getConnection(dburl, dbuser, dbpasswd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void disConn() {
		Connection connTemp = getConn();
		try{
            //자원 해제
            if(connTemp != null && !connTemp.isClosed())
            	connTemp.close();
        } catch(SQLException e){
            e.printStackTrace();
        }
	}
}
