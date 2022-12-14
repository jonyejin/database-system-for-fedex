package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import com.example.dataclass.DataClass;

public class SelectTuple {
    private Connection conn = null;
    Statement stmt = null;
    private String table;
    private String sql;
    private DataClass DC;


    public SelectTuple (DBConnection DBConnection, DataClass DC, String tableName) {
        conn = DBConnection.getConn();
	
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
        setTable(tableName);
        setSql("SELECT * FROM " + table);
        setDc(DC);
    }

    public void showResults(){
    
            PreparedStatement ps;
            try {
                ps = conn.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                getDc().SelectTuple(rs);
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
                
            
                
            
    }

    public void setTable(String tableName){
        this.table = tableName;
    }

    public void setSql(String sql){
        this.sql = sql;
    }

    public void setDc(DataClass DC){
        this.DC = DC;
    }

    public DataClass getDc(){
        return this.DC;
    }
}
