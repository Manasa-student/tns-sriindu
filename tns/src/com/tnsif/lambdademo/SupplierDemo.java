package com.tnsif.lambdademo;

import java.util.function.Supplier;

public class SupplierDemo {
	//Demo for Supplier interface
	
		public static void main(String[] args) {
	       Supplier<Double> sup=()->Math.random();
	       System.out.println(sup.get());	
		}
	



	}


