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
    sb.delete(0,sb.length());
    String sql = sb.append("delimiter $$ ")
    .append("drop procedure if exists `new_customer`;")
    .append("CREATE PROCEDURE `new_customer`(")
    .append("first_name varchar(20),")
    .append("middle_name varchar(20),")
    .append("last_name varchar(20),")
    .append("house_phone varchar(20),")
    .append("cell_phone varchar(20),")
    .append("card_number varchar(15),")
    .append("card_type varchar(20),")
    .append("cvc varchar(3),")
    .append("expiration_year varchar(2),")
    .append("expiration_month varchar(2)")
    .append(")")
    .append("BEGIN")
    .append("set @v1 = (select count(*) from customer_info);")
    .append("set @v2 = concat('customer_', @v1);")
    .append("insert into customer_info(customer_id, first_name, middle_name, last_name, house_phone, cell_phone) ")
    .append("values(@v2, first_name, middle_name, last_name, house_phone, cell_phone);")
    .append("insert into payment(card_number, customer_id, card_type, cvc, expiration_year, expiration_month) ")
    .append("values(card_number, @v2, card_type, cvc, expiration_year, expiration_month);")
    .append("END $$")
    .append("DELIMITER ;")
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
