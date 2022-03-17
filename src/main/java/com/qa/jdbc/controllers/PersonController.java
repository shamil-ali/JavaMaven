package com.qa.jdbc.controllers;

import java.util.List;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.qa.jdbc.daos.PersonDAO;
import com.qa.jdbc.domain.Person;

public class PersonController {
	
	private Scanner scanner = new Scanner(System.in);
	private PersonDAO personDAO;
	
	public PersonController(PersonDAO personDAO) {
		this.personDAO = personDAO;
	}
	
	public void create() {
		
		System.out.println("Please enter a first name: ");
		String firstName = scanner.nextLine();
		
		System.out.println("Please enter a last name: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Please enter an age: ");
		int age = scanner.nextInt();
		
		personDAO.create(new Person(firstName, lastName, age));
		
		System.out.println("Person Created");
	}
	
	public void readAll() {
		List<Person> results = personDAO.readAll();
		for (Person p : results) {
			System.out.println(p);
		}
	}
	
	public void readByID() {
		
		System.out.println("Please enter an id: ");
		int id = scanner.nextInt();
		
		System.out.println(personDAO.readByID(id));
	}
	
	public void update() {
		
		System.out.println("Please enter the id you want to update the values for: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Please enter a new first name: ");
		String firstName = scanner.nextLine();
		
		System.out.println("Please enter a new last name: ");
		String lastName = scanner.nextLine();
		
		System.out.println("Please enter a new age: ");
		int age = scanner.nextInt();
		scanner.nextLine();
		
		personDAO.update(new Person(id, firstName, lastName, age));
	}
	
	public void delete() {
		
		System.out.println("Please enter the id you want to delete: ");
		int id = scanner.nextInt();
		scanner.nextLine();
		
		if (personDAO.delete(id) != 0) {
			System.out.println("Person with id: " + id + " Deleted!");
		} else {
			System.out.println("Person not found");
		}
	}	
}
