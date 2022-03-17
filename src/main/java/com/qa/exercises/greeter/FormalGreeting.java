package com.qa.exercises.greeter;

public class FormalGreeting implements Greeting{
	
	private String formal;

	public String getFormal() {
		return formal;
	}

	public void setFormal(String formal) {
		this.formal = formal;
	}

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Goodeth Evening";
	}
}
