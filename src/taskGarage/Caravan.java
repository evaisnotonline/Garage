package taskGarage;

public class Caravan extends Vehicle {

	public Caravan(String licensePlate, String colour) {
		super(licensePlate, 6, colour, 25000);
	}

	public void bed() {
		System.out.println("Zzz");
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
