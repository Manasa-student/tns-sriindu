package com.tnsif.basics;
import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		String name;
		int id;
		int phno;
		Scanner ob = new Scanner(System.in);

		  System.out.println("Enter name");

	    // String input
	     name = ob.next();

	    // Numerical input
	     System.out.println("Enter id");
	    int id1 = ob.nextInt();
	    System.out.println("Enter phone no");
	    int phno1 = ob.nextInt();

	    // Output input by user
	    System.out.println("Name: " + name);
	    System.out.println("id: " + id1);
	    System.out.println("phno: " + phno1);
	  }
	
		

	}


