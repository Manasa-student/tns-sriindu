package com.tnsif.collectionsdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//demo for list interface and its implementation methods
//list interface class are 
//---->arraylist
//----->linkedlist
//----->vector
//----->stack

public class ListDemo {
public static void main(String args[]) {
		
		int a=10;
		//wrapper class
		//int --> Integer
		//float --> Float, double --> Double,short --> Short
		
		//1.array list
		
		List<Integer> ll=new ArrayList<Integer>();
		ll.add(10);
		ll.add(10);
		ll.add(34);
		ll.add(23);
		
		
		for(int i:ll) {
			System.out.println("The elements in List interface"+i);
		}
		
	
		//2. LinkedList
		List<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(10);
		l.add(34);
		l.add(23);
		System.out.println("Before Deletion");
		for(int i:l) {
			System.out.println(i);
		}
		
		l.remove(1);
		System.out.println("After Deletion");
		for(int i:l) {
			System.out.println(i);
		}
	}


}
