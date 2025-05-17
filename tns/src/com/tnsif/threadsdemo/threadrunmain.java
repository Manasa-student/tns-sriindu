package com.tnsif.threadsdemo;

public class threadrunmain {

	public static void main(String[] args) {

//main class for threadrunnable class which is demo for runnable interface

	      threadrunnable t1=new threadrunnable("task1");
	      threadrunnable t2=new threadrunnable("task2");
	     Thread ob=new Thread(t1);
	      Thread ob1=new Thread(t2);
	     
	      ob.setPriority(10);
	      ob1.setPriority(1);
	     
	      ob.start();
	      ob1.start();
			
		}


	}


