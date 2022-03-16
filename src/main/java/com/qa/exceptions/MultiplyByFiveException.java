package com.qa.exceptions;

public class MultiplyByFiveException extends Exception {
	
//	public MultiplyByFiveException() {
//		super();
		
//		OR
		
   public MultiplyByFiveException() {
		super("You can't multiply by 5");
	}

}
