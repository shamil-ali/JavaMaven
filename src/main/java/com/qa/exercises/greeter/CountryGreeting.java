package com.qa.exercises.greeter;

public class CountryGreeting implements Greeting{
	
	private String country;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String greet() {
		// TODO Auto-generated method stub
		return "Howdy partner!";
	}
}
