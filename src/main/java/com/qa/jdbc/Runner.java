package com.qa.jdbc;

import java.util.List;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class Runner {

	public static void main(String[] args) {
		
		// Testing connection
//		TestConnection tc = new TestConnection();
//		tc.testConnection();
		
		// CRUD functionality (CREATE, READ, UPDATE, DELETE)
		
		// Using DAO - Data Access Object
		PersonDAO pDAO = new PersonDAO();
//		Person p = new Person("Shamil", "Ali", 23);
		
//		pDAO.create(p);
		
		// Prepared Statement
//		pDAO.createPrepared(p);
		
		// READ by ID
		System.out.println(pDAO.readByID(1));;
		
		// READ ALL
		List<Person> people = pDAO.readAll();
		
		for (Person person : people) {
			System.out.println(person);
		}
	}
}
