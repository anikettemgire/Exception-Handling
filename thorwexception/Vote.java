package com.jbk.thorwexception;

public class Vote {

	
	void CheckAge(int age) {
		 // try {
		if(age>18) {
			System.out.println("you are eligle");
		}else
		{
			//try {
				throw new AgeException("not eligle");
				
			//}catch(Exception e) {
			//	e.getStackTrace();
			//}

            
		}
		  //}catch(Exception e) {
			//  System.out.println("not eliglbe");
		 // }
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Vote v =new Vote();
		v.CheckAge(17);

	}

}
