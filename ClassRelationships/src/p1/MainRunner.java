package p1;

public class MainRunner {

	public static void main(String[] args) {
		
		Engine e = new Engine(2000, "petrol");
		Car honda = new Car(101, "My Car", "White", e);
		
		System.out.println(" Car Name "+honda.getCarName());
		System.out.println(" Car Power "+honda.getEngine().getPower());
	
		int powerValue = honda.startCar("petrol");
		System.out.println(powerValue);
		
	}//end main
}//end class
