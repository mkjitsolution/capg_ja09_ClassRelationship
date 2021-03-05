package p2;
                   // is-a
public class Car extends Vehicle{

	private int carNumber;
	private String carName;
	private String color;
	
	private MusicSystem poineer;  // has-a

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(Engine e, Tyre[] tyres, Seat[] seats,int carNumber, String carName, String color, MusicSystem poineer) {
		super(e, tyres, seats);
		this.carNumber = carNumber;
		this.carName = carName;
		this.color = color;
		this.poineer = poineer;
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

	public MusicSystem getPoineer() {
		return poineer;
	}

	public void setPoineer(MusicSystem poineer) {
		this.poineer = poineer;
	}
	
	public void startCar()
	{
		super.getE().startEngine("petrol");
		
	}
	
	public int moveCarForward()
	{
		// ...1000 code ...
		
		for (Tyre tyre : super.getTyre()) {
			System.out.println(tyre+" is moving...");
		}
		
		return 40; // speed
	}
	
	
}






