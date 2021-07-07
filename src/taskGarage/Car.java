package taskGarage;

public class Car extends Vehicle {

	public Car(String licensePlate, String colour) {
		super(licensePlate, 4, colour, 10000);
	}

	public void boot() {
		System.out.println("Storage!");
	}

	public void cost() {
		if (getColour() == "Black") {
			System.out.println("Total cost is:" + cost + 1000);
		} else {
			System.out.println("Total cost is: " + cost);
		}
	}
}
