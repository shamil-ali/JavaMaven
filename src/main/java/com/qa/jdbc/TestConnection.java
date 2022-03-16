package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestConnection {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	// 3 things we need to connect
	private String connectionURL = "jdbc:mysql://localhost:3306/persondb";
	private String username = "root";
	private String password = "root";
	
	public void testConnection() {
		
		Connection conn = null;
		try {
//			LOGGER.info("Attempting DB connection...");
			System.out.println("Attempting DB connection...");
			conn = DriverManager.getConnection(connectionURL, username, password);
//			LOGGER.info("Connected to Database Successfully!");
			System.out.println("Connected to Database Successfully!");
			
		} catch (SQLException se) {
			LOGGER.error(se.getMessage());
		}
		  finally {
			try {
				if (conn != null) {
//					LOGGER.info("Attempting to close connection...");
					System.out.println("Attempting to close connection...");
					conn.close();
					System.out.println("Connection closed.");
				}
			} catch (SQLException se) {
				LOGGER.error(se.getMessage());
			}
		}
	}
}
