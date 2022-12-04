package com.example;

import com.example.sqlsettings.CreateTable;
import com.example.sqlsettings.DropTable;
import com.example.sqlsettings.InsertTuple;

/**
 * Hello world!
 *
 */

public final class testMain 
{

    public static void main( String[] args ) 
    {
    	
    	DBConnection dbConnection = new DBConnection();
    	CreateTable createT = new CreateTable(dbConnection);
    	
    	InsertTuple insertTuple = new InsertTuple(dbConnection);
    	DropTable dropTable = new DropTable(dbConnection);
    	
    	
    	    	
    	//select test
    	//SelectTuple selectTuple = new SelectTuple(dbConnection);
    	//selectTuple.SelectDummy();
    		
    }
}
