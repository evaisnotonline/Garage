package taskGarage;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> listOfVehicles = new ArrayList<>();

	public void addVehicle(Vehicle Vehicle) {
		this.listOfVehicles.add(Vehicle);
	}

	public void removeVehicle(Vehicle Vehicle) {
		this.listOfVehicles.remove(Vehicle);
	}

	public void removeAllVehicle(Vehicle vehicle) {
		this.listOfVehicles.clear();
	}

	public void print() {

		System.out.print("Vehicles:");
		for (int i = 0; i < listOfVehicles.size(); i++) {
			listOfVehicles.get(i).print1();
		}
	}
}
