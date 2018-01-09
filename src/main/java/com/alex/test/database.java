
package com.alex.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException; 

public class database {
	@SuppressWarnings("unused")
	private Connection con = null; //Database objects 
	  public database() 
	{
		try 
		{ 
		      Class.forName("com.mysql.jdbc.Driver"); 
		      //註冊driver 
		      con = DriverManager.getConnection( 
		      "jdbc:mysql://localhost:3306/alex_gui", 
		      "root","root"); 
		      //取得connection
		// TODO Auto-generated constructor stub
	}
    catch(ClassNotFoundException e) 
    { 
      System.out.println("DriverClassNotFound :"+e.toString()); 
    }//有可能會產生sqlexception 
    catch(SQLException x) { 
      System.out.println("Exception :"+x.toString()); 
    } 

	}
}