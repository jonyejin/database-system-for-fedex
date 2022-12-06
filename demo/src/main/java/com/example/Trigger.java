package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Trigger {
  private Connection conn = null;
	private Statement stmt = null;
	private String table;
	private String sql;

      public Trigger(DBConnection dbConnection){
            conn = dbConnection.getConn();
            
      try {
			  stmt = conn.createStatement();
		  } catch (SQLException e) {
			  e.printStackTrace();
		  }
      }

  public void CSQuestionDeleteTrigger(){

    StringBuilder sb = new StringBuilder();
    String sql = sb.append("delimiter $$ ")
                  .append("drop trigger if exists `cs_question_deleted` $$ ")
                  .append("create trigger `cs_question_deleted` ")
                  .append("before delete on `board` for each row ")
                  .append("begin ")
                  .append("delete from `board_answer` ")
                  .append("where complaint_id = OLD.complaint_id;")
                  .append("end $$")
                  .toString();

    System.out.println(sql);

    try {
            stmt.executeUpdate(sql);
            System.out.println("trigger for cs question delete set");
      } catch (SQLException e) {
            e.printStackTrace();
      }
  }
}
