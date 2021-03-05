package p2;

public class Engine {
	
	private int power;
	private String type;// fuel type
	
	public Engine() {
		
	}

	public Engine(int power, String type) {
		
		this.power = power;
		this.type = type;
	}
	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	public int startEngine(String fuel)
	{
		// 1000 code to start the engine
		// and it returns the power 
		
		if(fuel.equals("petrol"))
			return 1800;
		else if(fuel.equals("diesel"))
			return 2800;
		return 0;
	}
	
	public void stopEngine()
	{
		// code to stop the engine
	}
	
	

}
