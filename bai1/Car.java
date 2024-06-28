package ex286.bai1;

public class Car extends Vehicle {
	private int numberOfDoors;

	@Override
	public void move() {
		System.out.println("Car is moving");
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
