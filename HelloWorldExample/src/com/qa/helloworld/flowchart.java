package com.qa.helloworld;

public class flowchart {
	
	public static void main(String[] args) { 
		
		flowchart1(3, 5 , false);
	}
	
	public static int flowchart1(int a, int b, boolean c) {
		int results = c== true ? a+b : a*b;
		System.out.println(results);
		return results;
	}
	
	public static void flowchart2() {
	
	}
	
}
	

