package com.qa.jdbc.daos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.jdbc.domain.Person;

public class PersonDAO {
	
	public static final Logger LOGGER = LogManager.getLogger();
	
	// 3 things we need to connect
	private String connectionURL = "jdbc:mysql://localhost:3306/persondb";
	private String username = "root";
	private String password = "root";
	
	// CREATE
//	public void create(Person person) {
//		try (Connection conn = DriverManager.getConnection(connectionURL, username, password);
//				Statement statement = conn.createStatement()) {
//			statement.executeUpdate("INSERT INTO people(firstName, lastName, age) VALUES ('" + person.getFirstName() 
//			+ "', '" + person.getLastName() + "', " + person.getAge() + ");");
//			System.out.println("Person Created");
//		} catch (SQLException e) {
//			LOGGER.error(e);
//		}
//	}
	
	// Prepared Statement
	public void createPrepared(Person person) {
		try (Connection conn = DriverManager.getConnection(connectionURL, username, password);
			PreparedStatement statement = conn.prepareStatement("INSERT INTO people (firstName, lastName, age) VALUES (?, ?, ?)")) {
			
			statement.setString(1, person.getFirstName());
			statement.setString(2, person.getLastName());
			statement.setInt(3, person.getAge());
			statement.executeUpdate();
			System.out.println("Person Created");
		} catch (SQLException e) {
			LOGGER.error(e.getMessage());
			System.out.println("ERROR: test");
		}
	}
	
	// READ ALL
	public void readAll() {}
	
	// READ BY ID
	public void readByID() {}
	
	// UPDATE
	public void update() {}
	
	// DELETE
	public void delete() {}

}
