package com.boda.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public interface Dao {
public default Connection getConnection() throws SQLException {
		 var dburl = "jdbc:mysql://127.0.0.1:3306/webstore?serverTimezone=UTC";
		 var username = "root";
		 var password = "123456";
		 Connection conn = null;
		 try {
			 conn = DriverManager.getConnection(dburl,username,password);
		 } catch (SQLException e) {
		     System.out.println(e);
		 }
		 
		return conn;
	 }	
}
