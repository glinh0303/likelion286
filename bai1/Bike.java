package ex286.bai1;

public class Bike extends Vehicle {
	private boolean hasGear;

	@Override
	public void move() {
		System.out.println("Bike is moving");
	}

	public boolean isHasGear() {
		return hasGear;
	}

	public void setHasGear(boolean hasGear) {
		this.hasGear = hasGear;
	}

}
