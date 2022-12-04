package com.example;

import com.example.environmentsettings.CreateTable;
import com.example.environmentsettings.DropTable;
import com.example.environmentsettings.InsertTupleDrive;

/**
 * Hello world!
 *
 */

public final class TestDrive 
{

    public static void main( String[] args ) 
    {
    	
    	DBConnection dbConnection = new DBConnection();
    	CreateTable createT = new CreateTable(dbConnection);
    	DropTable dropTable = new DropTable(dbConnection);
    	InsertTupleDrive ITD = new InsertTupleDrive(dbConnection);
    	
//    	ITD.InsertAllTogether();
//    	select test
//    	SelectTuple selectTuple = new SelectTuple(dbConnection);
//    	selectTuple.SelectDummy();
    		
    }
}
