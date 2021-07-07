package taskGarage;

public abstract class Vehicle {

	private String licensePlate;

	private int noOfWheels;

	private String colour;

	protected int cost;

	public Vehicle() {
		super();
	}

	public Vehicle(String licensePlate, int noOfWheels, String colour, int cost) {
		super();
		this.licensePlate = licensePlate;
		this.noOfWheels = noOfWheels;
		this.colour = colour;
		this.cost = cost;
	}

	public String getLicensePlate() {
		return licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getNoOfWheels() {
		return noOfWheels;
	}

	public void setNoOfWheels(int noOfWheels) {
		this.noOfWheels = noOfWheels;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public void cost() {

	}

	public void print1() {

		System.out.println("License Plate: " + getLicensePlate());
		System.out.println("Number of Wheels: " + getNoOfWheels());
		System.out.println("Colour: " + getColour());
		cost();
	}
}