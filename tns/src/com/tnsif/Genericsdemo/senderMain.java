package com.tnsif.Genericsdemo;

public class senderMain {
	public static void main(String[] args) {
		Sender<String> ob=new Sender<String>();
		ob.setMessage("Hello welcome to Generics");
		System.out.println(ob.getMessage());
		
		
		Sender<Integer> o=new Sender<Integer>();
		o.setMessage(120);
		System.out.println(o.getMessage());
		
	}


}
