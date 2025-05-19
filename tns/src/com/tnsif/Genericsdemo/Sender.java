package com.tnsif.Genericsdemo;
//Demo for Generic class
public class Sender <T>{
	//T--> the type
		private T message;
		
		
		public void setMessage(T message) {
			this.message=message;
			}
		
		public T getMessage() {
			return message;
		}
	}

	


