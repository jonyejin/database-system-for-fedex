package com.example;

/**
 * Hello world!
 *
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.ArrayList;
import java.util.List;

public final class testMain 
{
//	private String dburl = "jdbc:mysql://localhost:3306/sys"; 원후
//	private String dbuser = "test1"; 원후
//	private String dbpasswd = "test1";원후
	private static  String dburl = "jdbc:mysql://localhost:3306/mydatabase"; //민지
	private static String dbuser = "root"; //민지
	private static String dbpasswd = "1367"; // 민지
	
	String sql = "SELECT * FROM student";
	
	
	
	public void createTable() {
			
			Connection conn = null;
		    Statement stmt = null;
	 
	        try{
	            Class.forName("com.mysql.cj.jdbc.Driver");
	 
	            conn = DriverManager.getConnection(dburl, dbuser, dbpasswd);
	 
	            System.out.println("Successfully Connected!");
	 
	            //DB와 연결된 conn 객체로부터 Statement 객체 획득.
	            stmt = conn.createStatement();
	 
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
	 
	        catch(ClassNotFoundException e){
	            e.printStackTrace();
	        }
	        catch(SQLException e){
	            e.printStackTrace();
	        }
	        finally{
	            try{
	                //자원 해제
	                if(conn != null && !conn.isClosed())
	                    conn.close();
	            } catch(SQLException e){
	                e.printStackTrace();
	        }
	    }
	}
	
    public void insertDummy(int id, String name, int grade) {
    	String table = "dummy";
        StringBuilder sb = new StringBuilder();
        Statement stmt = null;
        Connection conn = null;
        
		try {
			conn = DriverManager.getConnection(dburl, dbuser, dbpasswd);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
        //DB와 연결된 conn 객체로부터 Statement 객체 획득.
        try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        String sql = sb.append("insert into " + table + " values(")
                .append(id + ",")
                .append("'" + name + "',")
                .append(grade)
                .append(");")
                .toString();
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    public void deleteDummy(int id, String name, int grade) {
    	String table = "dummy";
        StringBuilder sb = new StringBuilder();
        Statement stmt = null;
        Connection conn = null;
        
		try {
			conn = DriverManager.getConnection(dburl, dbuser, dbpasswd);
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
        //DB와 연결된 conn 객체로부터 Statement 객체 획득.
        try {
			stmt = conn.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        String sql = sb.append("delete from " + table + " where id = ")
                .append(id)
                .append(";")
                .toString();
        try {
            stmt.executeUpdate(sql);
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
	
    public static void main( String[] args ) 
    {
    	
    	DBConnection dbConnection = new DBConnection(dburl, dbuser, dbpasswd);
    	CreateTable createT = new CreateTable(dbConnection);
    	
    	InsertTuple insertTuple = new InsertTuple(dbConnection);
    	DropTable dropTable = new DropTable(dbConnection);
    	//dropTable.DropTableName("dummy");
    	//dropTable.DropTableName("customer_address");
    	
    	//customer info insertion
    	//insertTuple.InsertCustomerInfo("1","Peter", "Jone", "White", "12 1234 5678","123 1111 2222");
    	//insertTuple.InsertCustomerInfo("2","Genevieve", "Lana", "Cheona", "03 5545 5378","123 2222 3333");
    	//insertTuple.InsertCustomerInfo("3","Zendaya", "Faizan", "Anderson", "08 6986 3434","123 4444 5555");
    	//insertTuple.InsertCustomerInfo("4","Carolos", "Kira", "Akpabio", "12 3434 2424","123 6666 7777");
    	//insertTuple.InsertCustomerInfo("5","Elisa", "Lainey", "Lenkov", "12 5757 8989","123 5555 2342");
    	//insertTuple.InsertCustomerInfo("6","Famke", "Valentin", "Bianchi", "12 0987 8765","123 2347 8458");
    	//insertTuple.InsertCustomerInfo("7","Ansley", "Van", "Johnson", "12 3454 4565","123 4831 5758");
    	//insertTuple.InsertCustomerInfo("8","Kavya", "Artem", "Agrinya", "12 4545 8908","123 4734 6966");
    	//insertTuple.InsertCustomerInfo("9","Katharina", "Jozefa", "Ailana", "12 4342 5464","545 6787 2756");
    	//insertTuple.InsertCustomerInfo("10","Sadhbh", "Fionn", "Semenov", "12 4656 4545","243 4589 9632");
    	
    	//customer address insertion
    	insertTuple.InsertCustomerAddress("5824 Hester Squares","Gutmann Apt. 093", "1", "USA","Avondale" ,"Georgia",24332,6834563692499L,4342);
    	insertTuple.InsertCustomerAddress("307 Schaden Creek","7784 Mayert Mall", "2", "USA", "Kansas","Florida",21232,6542487656773L,4554);
    	insertTuple.InsertCustomerAddress("147 서초중앙로","2931 도산대로", "3", "South Korea", "서울특별시", "서울특별시",14535,7397457578633L,2343);
    	insertTuple.InsertCustomerAddress("6236 가락로","1533 영동대로", "4", "South Korea", "서울특별시", "서울특별시",57585,4262819252596L,1221);
    	insertTuple.InsertCustomerAddress("742 논현로","671 역삼로", "5", "South Korea", "서울특별시", "서울특별시",46738,8241645434378L,1111);
    	insertTuple.InsertCustomerAddress("149 영동대로","397 서초중앙로", "6", "South Korea", "서울특별시", "서울특별시",57383,7616537831826L,3434);
    	insertTuple.InsertCustomerAddress("6459 테헤란로","0739 언주로", "7", "South Korea", "서울특별시", "서울특별시",47474,4316537831826L,8768);
    	insertTuple.InsertCustomerAddress("1556 양재천로","7636 영동대로", "8", "South Korea", "서울특별시", "서울특별시",23423,3778250143150L,6563);
    	insertTuple.InsertCustomerAddress("973 논현로","9252 잠실로", "9", "South Korea", "서울특별시", "서울특별시",12364,5778250143150L,2317);
    	insertTuple.InsertCustomerAddress("149 영동대로","1533 영동대로", "10", "South Korea", "서울특별시", "서울특별시",43264,9975250143150L,2317);
    	
    	
    	
    	//select test
    	//SelectTuple selectTuple = new SelectTuple(dbConnection);
    	//selectTuple.SelectDummy();
    	
    	
    	

    }
}
