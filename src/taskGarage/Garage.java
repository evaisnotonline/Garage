package taskGarage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> listOfVehicles = new ArrayList<>();

	public void addVehicle(Vehicle licensePlate) {
		this.listOfVehicles.addAll(listOfVehicles);
	}

	public void removeVehicle(Vehicle licensePlate) {
		this.listOfVehicles.remove(listOfVehicles);
	}

	public void removeAllVehicle(Vehicle vehicle) {
		this.listOfVehicles.clear();
	}

	public void print() {

		System.out.print("Vehicles:");
		for (Vehicle Vehicle : this.listOfVehicles) {
			Vehicle.print1();
		}
	}
	
	System.out.println(listOfVehicles);
}
