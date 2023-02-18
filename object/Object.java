package com.jbk.object;

public class Object {
 
	double div(int x,int y) {
		double result=0; // because  globally decare
		try {
			 result=x/y;
		}
		catch(Exception e) {
			System.out.println("not by the zero");
		}
		
		return  result;
	}


	}


