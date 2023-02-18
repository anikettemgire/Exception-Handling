package com.jbk.thorowpratice;

public class Test2 {

	public static void main(String[] args) {
		 Test2 t =new Test2();
		 try {
			 t.divide();
			 
		 }catch(Exception e) {
			 System.out.println("by handled using throgh the call");
		 }
		

	}
	 void divide()
	 {
		// try {
			 System.out.println(10/0);
		 
		 //}catch(Exception e) {
			// System.out.println("thow method by the tha try ctach");
	//	 }
		 
	 }

}
