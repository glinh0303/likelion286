package ex286.bai1;

public abstract class Vehicle {
	private String name;
	private final int id = 0;
	private static int countVehicle;

	public Vehicle() {
		countVehicle++;
	}

	public void move() {
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public int getId() {
		return id;
	}

	public static int getCountVehicle() {
		return countVehicle;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void setCountVehicle(int countVehicle) {
		Vehicle.countVehicle = countVehicle;
	};
}
