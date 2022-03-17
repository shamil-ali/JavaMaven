package com.qa.exercises.greeter;

public class Runner {

	public static void main(String[] args) {
		
		FormalGreeting formalG = new FormalGreeting();
		CasualGreeting casualG = new CasualGreeting();
		CountryGreeting countryG = new CountryGreeting();
		
		Greeter gr = new Greeter();
		
		System.out.println(gr.greet(countryG));

	}
}
