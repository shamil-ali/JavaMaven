package com.qa.exceptions;

public class Runner {
	
	public static void main(String[] args) {
	
		Maths maths = new Maths();
		
		try {
	
			maths.multiply(6, 4);
		}
		
		catch (MultiplyByFiveException mbfe) {
				mbfe.printStackTrace();
		}
	}
}
