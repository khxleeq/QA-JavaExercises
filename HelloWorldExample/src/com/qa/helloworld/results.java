package com.qa.helloworld;

public class results {
	
	static double  chemistry = 89;
	static double  physics = 82;
	static double  biology =108;
	static double  total = chemistry + physics + biology;
	static double chemistryPer = ((chemistry / 150) * 100);
	static double physicsPer = ((physics / 150) * 100);
	static double biologyPer = ((biology / 150) * 100);
	
	
	public static void main(String[] args) { 
		DisplayResults();
		overall();
		
	}
	
	public static void DisplayResults() {

		System.out.println("Results: ");
		
		System.out.println("Chemistry: " + chemistry + " marks");
		if(chemistryPer > 60) {
			System.out.println(Math.round(chemistryPer)+"% " + "Pass");
		}
		else if(chemistryPer < 60) {
			System.out.println(Math.round(chemistryPer)+"% " +"Fail");
		}
		
		
		System.out.println("Physics: " + physics + " marks");
		if(physicsPer > 60) {
			System.out.println(Math.round(physicsPer)+"% " +"Pass");
		}
		else if(physicsPer < 60) {
			System.out.println(Math.round(physicsPer)+"% " +"Fail");
		}
		
		
		System.out.println("Biology: " + biology + " marks");
		if(biologyPer > 60) {
			System.out.println(Math.round(biologyPer)+"% " +"Pass");
		}
		else if(biologyPer < 60) {
			System.out.println(Math.round(biologyPer)+"% " +"Fail");
		}
		
		System.out.println("Total marks: " + total + " marks");
	}
	
	public static void overall() {
					

		if((total*100)/450 > 60 && biologyPer < 60 || physicsPer < 60 || chemistryPer < 60) {
			String failed = "";
			if(physicsPer<60) {
				failed+= "Physics " + String.valueOf(Math.round(physicsPer)) + "% ,";
			}
			if(biologyPer<60) {
				failed+= " Biology " + String.valueOf(Math.round(biologyPer))+ "% ,";
			}
			if(chemistryPer<60) {
				failed+= " Chemistry " + String.valueOf(Math.round(chemistryPer))+ "%";
			}
			System.out.println("Status: Fail" + "\n" + "Failed Subjects:" + "\n" + failed);
		
		}
		else if ((total*100)/450 > 60 && biologyPer > 60 && physicsPer > 60 && chemistryPer > 60) {
			System.out.println("Overall Percentage " + ((total*100)/450) + "%");
			System.out.println("Status: Pass");
		}
		
		
		
		
	}
}
