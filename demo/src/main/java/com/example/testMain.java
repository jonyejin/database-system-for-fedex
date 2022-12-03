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
    	
    	//#1 customer info insertion
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
    	
    	//#2 customer address insertion
//    	insertTuple.InsertCustomerAddress("5824 Hester Squares","Gutmann Apt. 093", "1", "USA","Avondale" ,"Georgia",24332,6834563692499L,4342);
//    	insertTuple.InsertCustomerAddress("307 Schaden Creek","7784 Mayert Mall", "2", "USA", "Kansas","Florida",21232,6542487656773L,4554);
//    	insertTuple.InsertCustomerAddress("147 서초중앙로","2931 도산대로", "3", "South Korea", "서울특별시", "서울특별시",14535,7397457578633L,2343);
//    	insertTuple.InsertCustomerAddress("6236 가락로","1533 영동대로", "4", "South Korea", "서울특별시", "서울특별시",57585,4262819252596L,1221);
//    	insertTuple.InsertCustomerAddress("742 논현로","671 역삼로", "5", "South Korea", "서울특별시", "서울특별시",46738,8241645434378L,1111);
//    	insertTuple.InsertCustomerAddress("149 영동대로","397 서초중앙로", "6", "South Korea", "서울특별시", "서울특별시",57383,7616537831826L,3434);
//    	insertTuple.InsertCustomerAddress("6459 테헤란로","0739 언주로", "7", "South Korea", "서울특별시", "서울특별시",47474,4316537831826L,8768);
//    	insertTuple.InsertCustomerAddress("1556 양재천로","7636 영동대로", "8", "South Korea", "서울특별시", "서울특별시",23423,3778250143150L,6563);
//    	insertTuple.InsertCustomerAddress("973 논현로","9252 잠실로", "9", "South Korea", "서울특별시", "서울특별시",12364,5778250143150L,2317);
//    	insertTuple.InsertCustomerAddress("149 영동대로","1533 영동대로", "10", "South Korea", "서울특별시", "서울특별시",43264,9975250143150L,2317);
    	
    	//#18 cs department
    	insertTuple.InsertCSDepartment("1","0000000001");
    	insertTuple.InsertCSDepartment("2","0000000010");
    	insertTuple.InsertCSDepartment("3","0000000100");
    	insertTuple.InsertCSDepartment("4","0000001000");
    	insertTuple.InsertCSDepartment("5","0000010000");
    	insertTuple.InsertCSDepartment("6","0000100000");
    	insertTuple.InsertCSDepartment("7","0001000000");
    	insertTuple.InsertCSDepartment("8","0010000000");
    	insertTuple.InsertCSDepartment("9","0100000000");
    	insertTuple.InsertCSDepartment("10","1000000000");
    	
    	//#19 cs worker info (worker id,cs_department_id,seat_no)
    	insertTuple.InsertCSWorkerInfo("1","5",3);
    	insertTuple.InsertCSWorkerInfo("2","2",10);
    	insertTuple.InsertCSWorkerInfo("3","3",5);
    	insertTuple.InsertCSWorkerInfo("4","7",1);
    	insertTuple.InsertCSWorkerInfo("5","6",8);
    	insertTuple.InsertCSWorkerInfo("6","4",9);
    	insertTuple.InsertCSWorkerInfo("7","1",7);
    	insertTuple.InsertCSWorkerInfo("8","9",2);
    	insertTuple.InsertCSWorkerInfo("9","10",4);
    	insertTuple.InsertCSWorkerInfo("10","8",6);
    	insertTuple.InsertCSWorkerInfo("11","10",6);
    	
    	//#20 board
    	insertTuple.InsertBoard("1","2",1,"언제도착하나요","안녕하세요 제 택배 언제 도착하나요",1);  
    	insertTuple.InsertBoard("2","6",3,"택배를 신청했는데","택배 신청했는데 언제 방문하시나요? ",1);
    	insertTuple.InsertBoard("3","7",2,"택배 없음","집앞에 택배 없는데 배송완료라고 뜨네요.. 확인부탁드립니다.",0);
    	insertTuple.InsertBoard("4","8",1,"내일 입어야 하는데","옷 언제배송 예정인가요?? 내일까지 꼭 받아야 돼요ㅜㅠㅜㅠ",1);
    	insertTuple.InsertBoard("5","1",3,"편의점에서","편의점에서 택배 보낼수있나여??",1);
    	insertTuple.InsertBoard("6","5",3,"물건 현재 위치","제 택배 어딨는지 어떻게 확인하나요",1);
    	insertTuple.InsertBoard("7","9",2,"택배 어디까지 왔어요?","제 택배 지금 어디까지 왔는지 어떻게 알아요??????",1);
    	insertTuple.InsertBoard("8","10",3,"국외 택배","어떻게 보내나요?",1);
    	insertTuple.InsertBoard("9","3",2,"배송완료아닌데 배송완료라고 함","아직 도착 안했는데 확인해보니 배송완료라는데요??",1);
    	insertTuple.InsertBoard("10","4",3,"공휴일에 배달 가능한가요?","공휴일에 배달 가능한가요? 일요일은요?",1);
    	insertTuple.InsertBoard("11","11",3,"인터넷 쇼핑?","인터넷 쇼핑으로 산거 반품 되나요?",1);
    	
    	
    	//#21 board answer (complaint_id,worker id, title,body)
    	insertTuple.InsertBoardAnswer("1","1","답변 드립니다.","당사 홈페이지 내의 [조회/예약]-[택배조회]를 이용하시면 이동경로 확인이 가능합니다.");
    	insertTuple.InsertBoardAnswer("2","2","답변 드립니다.","상품 인수를 위한 방문 희망 일로 지정하신 요청일에 방문합니다.");
    	insertTuple.InsertBoardAnswer("4","4","답변 드립니다.","당사 홈페이지 내의 [조회/예약]-[택배조회]를 이용하시면 이동경로 확인이 가능합니다.");
    	insertTuple.InsertBoardAnswer("5","5","답변 드립니다.","편의점으로 상품을 가져가시면 택배 서비스를 이용하실 수 있습니다. ");
    	insertTuple.InsertBoardAnswer("6","6","답변 드립니다.","당사 홈페이지 내의 [조회/예약]-[택배조회]를 이용하시면 이동경로 확인이 가능합니다.");
    	insertTuple.InsertBoardAnswer("7","7","답변 드립니다.","당사 홈페이지 내의 [조회/예약]-[택배조회]를 이용하시면 이동경로 확인이 가능합니다.");
    	insertTuple.InsertBoardAnswer("8","8","답변 드립니다.","해외로 물품을 보내시는 경우 가까운 편의점 중 Postbox가 설치된 곳에 내방하시면 접수 가능합니다.");
    	insertTuple.InsertBoardAnswer("9","9","답변 드립니다.","당사 홈페이지 내의 [조회/예약]-[택배조회]를 이용하시면 이동경로 확인이 가능합니다.");
    	insertTuple.InsertBoardAnswer("10","10","답변 드립니다.","공휴일과 일요일은 택배사 휴무로 방문이 어려우니 양해 바랍니다. 더 나은 서비스를 제공하기 위해 최선을 다하겠습니다.");
    	insertTuple.InsertBoardAnswer("11","11","답변 드립니다.","주문하신 물품 구입처에 반품 의사를 전달하시면 구매업체에서 직접 접수를 해주거나 택배사로 접수하시도록 안내를 받으실 수 있습니다. ");
    	    	
    	//select test
    	//SelectTuple selectTuple = new SelectTuple(dbConnection);
    	//selectTuple.SelectDummy();
    	
    	
    	

    }
}
