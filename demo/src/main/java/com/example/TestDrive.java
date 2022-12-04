package com.example;

import java.util.HashMap;

import com.example.environmentsettings.CreateTable;
import com.example.environmentsettings.DropTable;
import com.example.environmentsettings.InsertTupleDrive;
import com.example.environmentsettings.UpdateTuple;

public final class TestDrive 
{

    public static void main( String[] args ) 
    {
    	
    	DBConnection DBC = new DBConnection();
    	CreateTable CT = new CreateTable(DBC);
    	DropTable DT = new DropTable(DBC);
    	UpdateTuple UpdateTuple = new UpdateTuple(DBC);
    	InsertTupleDrive ITD = new InsertTupleDrive(DBC);
    	
    	
//    	DT.DropTableAll();
    	
//    	create table
    	CT.CreateTableAll();
    	
//    	insert tuple
    	ITD.InsertTupleAll();
    	
//    	update tuple
    	String Table = "customer_address";
    	HashMap<String, String> Set 	  = new HashMap<String, String>();
    	HashMap<String, String> SetType   = new HashMap<String, String>();
    	HashMap<String, String> Where 	  = new HashMap<String, String>();
    	HashMap<String, String> WhereType = new HashMap<String, String>();
    	Set.put("address_1", "update_test");
    	SetType.put("address_1", "String");
    	Where.put("customer_id", "1");
    	WhereType.put("customer_id", "String");
    	
    	UpdateTuple.WithSetWhere(Table, Set, SetType, Where, WhereType);
    	
//    	drop table
    	DT.DropTableAll();
    	
//    	disconnect
    	DBC.disConn();

    		
    }
}
