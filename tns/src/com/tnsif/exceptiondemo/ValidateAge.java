package com.tnsif.exceptiondemo;

public class ValidateAge {
	public static void validateAge(int age) throws Myexception,ArithmeticException {
		if(age<0) {
			throw new Myexception("The entered age is not valid");
		}
		else {
			System.out.println("The age is valid");
		}


}
}
