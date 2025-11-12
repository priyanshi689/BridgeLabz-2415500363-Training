package com.jdbc.studentjdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public  class ConnectionImpl implements IConnection{
	String URL="jdbc:mysql://localhost:3306/jdbc";
	String Username="root";
	String Password="anant#";
	Connection con;
	
	@Override
	public Connection createconnection() {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(URL, Username, Password);
		System.out.println("Connection Created");
		return con;
	}
	catch(Exception e) {
		System.out.println("Connection Error:"+e.getMessage());
	}
	return con;
}
	
	
}
