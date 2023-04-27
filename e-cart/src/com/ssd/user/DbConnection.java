package com.ssd.user;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {

	
static Connection conn=null;
	
	public static Connection getCon() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/ecart","root","root");  
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;  		
		
	}
}
