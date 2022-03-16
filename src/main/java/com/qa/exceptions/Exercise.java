package com.qa.exceptions;

import java.util.Scanner;

public class Exercise {
	
	Scanner scanner = new Scanner(System.in);
	
	public void divide() {
		try {
			
			int numOne = scanner.nextInt();
			int numTwo = scanner.nextInt();
			
			System.out.println(numOne / numTwo);
		} finally {
			scanner.close();
		}
	}
}			

//	public void divide(double x, double y) throws ArithmeticException {
//		
//		double result;
//		
//		if (x < y) {
//			throw new ArithmeticException();
//		}
//		
//		result = x / y;
//		
//		System.out.println(result);
//	}

