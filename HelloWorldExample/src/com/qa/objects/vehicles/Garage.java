package com.qa.objects.vehicles;

import java.util.ArrayList;

public class Garage {
	
	ArrayList<Vehicle> vehicles = new ArrayList<>();
	
	void addVehicle(Vehicle v) {
		this.addVehicle(v);
	}
	
	void delVehicle(int ID) {
		this.vehicles.remove(ID);
	}
	
	void fixVehicle(Vehicle v) {
		
	}
	
	void emptyGarage() {
		vehicles.clear();
	}
	
	void printAll() {
		for (Vehicle v : this.vehicles)
			v.print();
	}
	
}
