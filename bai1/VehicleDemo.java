package ex286.bai1;

public class VehicleDemo {

	public static void main(String[] args) {

		Vehicle c = new Car();
		Vehicle b = new Bike();
		Vehicle c2 = new Car();

		c.move();
		b.move();
		System.out.println(c.getCountVehicle());

	}

}
