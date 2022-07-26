package com.qa.objects.vehicles;

import java.util.ArrayList;

public class Vehicle extends Object {
	
	
	private String type;
	private String make;
	private int year;
	private String colour;
	
	
	public static void main(String[] args) {
		
	ArrayList<Vehicle> vehicles = new ArrayList<>();
	Garage g = new Garage();
	Car c = new Car("Audi", "A3", 2018, "black");
	Motorbike m = new Motorbike("Honda", "Concerto", 2010, "Red");
	g.addVehicle(c);
	g.addVehicle(m);
	
	g.addVehicle(new Motorbike("Honda", "Civic", 2012, "Green"));
	
	g.printAll();
	}


		
	public Vehicle(String type, String make) {
		super();
		this.type = type;
		this.make = make;
	}


	public Vehicle(String type, String make, int year, String colour) {
		super();
		this.type = type;
		this.make = make;
		this.year = year;
		this.colour = colour;
	}
	
	public void print() {
		System.out.println("This car's name is " + type);
		System.out.println("The make of the car is " + make + "and was made in " + year);
		System.out.println("The colour of the car is " + colour);
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMake() {
		return make;
	}


	public void setMake(String make) {
		this.make = make;
	}


	public double getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public String getColour() {
		return colour;
	}


	public void setColour(String colour) {
		this.colour = colour;
	}
	
	
	

}
