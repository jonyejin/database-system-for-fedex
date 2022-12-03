package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Procedure {
  private Connection conn = null;
	private Statement stmt = null;
	private String table;
	private Connection Conn;
	private String sql;

	public void NewCustomerProcedure(String customer_id, String first_name, String middle_name, String last_name, 
  String house_phone, String cell_phone, String card_number, String card_type, String cvc, String expiration_year, String expiration_month, 
  String org_name, String org_phone){

    table = "customer_info";

    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder();
    StringBuilder insert_new_customer  = new StringBuilder();
    table = "customer_info";
    String sql1 = sb.append("insert into " + table + " values(")
	                .append(customer_id + ",")
	                .append("'" + first_name + "',")
	                .append("'" + middle_name + "',")
	                .append("'" + last_name + "',")
	                .append("'" + house_phone + "',")
	                .append("'" + cell_phone + "'")
	                .append(");")
	                .toString();
    String payment = sb2.append()
    

    String sql2 = insert_new_customer.append("create procedure newcustomer(IN customer_id varchar(20),")
                  .append("IN first_name varchar(20),")
                  .append("IN middle_name varchar(20),")
                  .append("IN last_name varchar(20),")
                  .append("IN house_phone varchar(20),")
                  .append("IN cell_phone varchar(20),")
                  .append("IN card_number varchar(15),")
                  .append("IN card_type varchar(20),")
                  .append("IN cvc varchar(3),")
                  .append("IN expiration_year varchar(2),")
                  .append("IN expiration_month varchar(2))")
                  .append("BEGIN")
                  .append(sql1)
                  .append()
                  .toString();
    try {
            stmt.executeUpdate(sql);
            System.out.println("insert "+table+ " tuple");
      } catch (SQLException e) {
            e.printStackTrace();
      }
  }
}
