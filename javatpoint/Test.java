package com.jbk.javatpoint;

public class Test {
	void age(int age) {
   	 if(age>18) {
   		 System.out.println("you are eilgible");
   	 }else
   	 {
   		// throw new AgeException("you are not eligle");
   	 }
    }

	public static void main(String[] args) {

         Test t= new Test();
         t.age(14);
         
	}
}
