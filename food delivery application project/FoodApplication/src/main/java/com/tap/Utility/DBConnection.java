package com.tap.Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	public static final Connection getConnection() {
		
		String url="jdbc:mysql://localhost:3306/foodApplication";
		String name="root";
		String password="6361273857";
		Connection conn=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn=DriverManager.getConnection(url,name,password);
		}
		catch(ClassNotFoundException | SQLException  e) {
			e.printStackTrace();
		}
		
		return conn;
	}
}
