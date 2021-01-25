
public class Vehicle {
	double fuelMileage;
	double fuelCapacity;
	int wheelSize;
	String vehicle;
	
	
	public  Vehicle(String name) {
		vehicle = name;
	}
	public void tankSize(int gallons) {
		fuelCapacity = gallons;
	}
	public void MPG(double miles) {
		fuelMileage = miles;
		
	}


	public static void main(String[] args) {
		Vehicle truck = new Vehicle("Dodge 2500");
		truck.tankSize(30);
		truck.MPG(21);
		
		System.out.println(truck.vehicle);
		System.out.println(truck.fuelCapacity);
	}
}
