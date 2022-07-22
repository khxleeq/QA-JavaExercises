package com.qa.helloworld;

public class calculator {

	public static void main(String[] args) {

		Addition();
		Subtraction();
		Division();
		Multiplication();
	}
	
	public static void Addition() {
		int number1 = 20;
		int number2 = 10;
		int result = number1+number2;
		System.out.println(result);

	}
	public static void Subtraction () {
		int number1 = 20;
		int number2 = 10;
		int result = number1-number2;
		
		System.out.println(result);

	}
	public static void Multiplication() {
		int number1 = 20;
		int number2 = 10;
		int result = number1*number2;
		
		System.out.println(result);

	}

	public static void Division () {
		double number1 = 20;
		double number2 = 30;

	
		if(number1<number2) {
			double result = number1/number2;
			System.out.println(result);
		}
		else if (number1>=number2) {
			System.out.println("Division cannot be performed");
			
		}


	}
}
