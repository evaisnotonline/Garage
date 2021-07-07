package taskGarage;

public class App {

	public static void main(String[] args) {

		Garage garage1 = new Garage();

		garage1.addVehicle(new Car("684 gid", "Black"));
		garage1.addVehicle(new Truck("305 gos", "Green"));

		garage1.print();

	}
}
