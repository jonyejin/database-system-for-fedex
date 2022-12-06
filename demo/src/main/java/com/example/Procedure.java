package com.example;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Procedure {
  private Connection conn = null;
	private Statement stmt = null;
	private String table;
	private String sql;

      public Procedure(DBConnection dbConnection){
            conn = dbConnection.getConn();
            
            try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
      }

public void NewCustomerProcedure(){

    StringBuilder sb = new StringBuilder();
    String sql = sb.append("Delimiter $$")
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
            System.out.println("insert "+table+ " tuple");
      } catch (SQLException e) {
            e.printStackTrace();
      }
  }

  public void NewCustomerProcedureCall(String first_name, String middle_name, String last_name, 
      String house_phone, String cell_phone,
      String card_number, String card_type, String cvc, 
      String expiration_year, String expiration_month){

    StringBuilder sb = new StringBuilder();
    String sql = sb.append("call new_customer(")
    .append('"' + first_name + "\",")
    .append('"' + middle_name + "\",")
    .append('"' + last_name + "\",")
    .append('"' + house_phone + "\",")
    .append('"' + cell_phone + "\",")
    .append('"' + card_number + "\",")
    .append('"' + card_type + "\",")
    .append('"' + cvc + "\",")
    .append('"' + expiration_year + "\",")
    .append('"' + expiration_month + "\")")
    .toString();
    System.out.println(sql);
    try {
            stmt.executeUpdate(sql);
            System.out.println("newcustomerprocedurecall");
      } catch (SQLException e) {
            e.printStackTrace();
      }
  }
}
