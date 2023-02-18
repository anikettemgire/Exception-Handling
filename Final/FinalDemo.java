package com.jbk.Final;

public class FinalDemo {

	public static void main(String[] args) {
		try {
			System.out.println("try Block");
			System.out.println(10/0);
			System.out.println("after the Exception ");

		}catch(Exception e){
			System.out.println("catch Block");
		}finally {
			System.out.println("finall block Block");
		}

	}

}
