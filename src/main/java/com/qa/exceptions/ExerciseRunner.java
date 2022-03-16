package com.qa.exceptions;

import java.util.InputMismatchException;

public class ExerciseRunner {
	
	public static void main(String[] args) {

		Exercise calculator = new Exercise();
		try {
			calculator.divide();
		}
		  catch (InputMismatchException ime) {
			System.out.println("ERROR: Input must be a number");
		} catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		} catch (Exception e ) {
			e.printStackTrace();
		}
	}
}
