package p1;

public class Car {

	private int carNumber;
	private String carName;
	private String color;
	
	
	private Engine engine;
	
	public Car() {
		
		carNumber = 1000;
		carName = "No Name";
		color = "Rust";
	}
	
	
	public Car(int carNumber, String carName, String color, Engine engine) {
		
		this.carNumber = carNumber;
		this.carName = carName;
		this.color = color;
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int startCar(String fuel)
	{
		return engine.startEngine(fuel);
	}
	
	
}






