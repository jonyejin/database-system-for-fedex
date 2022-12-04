package com.example;

import com.example.environmentsettings.CreateTable;
import com.example.environmentsettings.DropTable;
import com.example.environmentsettings.InsertTupleDrive;

public final class TestDrive 
{

    public static void main( String[] args ) 
    {
    	
//    	select test
//    	SelectTuple selectTuple = new SelectTuple(dbConnection);
//    	selectTuple.SelectDummy();
    	
    	DBConnection DBC = new DBConnection();
    	
    	CreateTable CT = new CreateTable(DBC);
    	DropTable DT = new DropTable(DBC);
    	InsertTupleDrive ITD = new InsertTupleDrive(DBC);
    	
//    	create table into db.
    	CT.CreateTableAll();
    	
//    	insert tuple into db.
//    	ITD.InsertAll();
    	
//    	drop table from db.
    	DT.DropTableAll();
    	
//    	disconnect
    	DBC.disConn();

    		
    }
}
