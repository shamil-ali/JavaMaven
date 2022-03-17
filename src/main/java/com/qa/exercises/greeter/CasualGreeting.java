package com.qa.exercises.greeter;

public class CasualGreeting implements Greeting{
	
	private String casual;

	public String getCasual() {
		return casual;
	}

	public void setCasual(String casual) {
		this.casual = casual;
	}

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "sup bruh";
	}
}
