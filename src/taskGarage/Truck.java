package taskGarage;

public class Truck extends Vehicle {

	public Truck(String licensePlate, String colour) {
		super(licensePlate, 8, colour, 40000);
	}

	public void horn() {
		System.out.println("Honk");
	}

	@Override
	public void cost() {
		if (getColour() == "Black") {
			System.out.println("Total cost is:" + (cost + 1000));
		} else {
			System.out.println("Total cost is: " + cost);
		}
	}

}
