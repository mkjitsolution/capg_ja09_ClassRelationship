package p2;

public class Vehicle {

	private Engine e;
	private Tyre tyre[]; // 4
	private Seat seats[]; // 5
	
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehicle(Engine e, Tyre[] tyre, Seat[] seats) {
		super();
		this.e = e;
		this.tyre = tyre;
		this.seats = seats;
	}
	public Engine getE() {
		return e;
	}
	public void setE(Engine e) {
		this.e = e;
	}
	public Tyre[] getTyre() {
		return tyre;
	}
	public void setTyre(Tyre[] tyre) {
		this.tyre = tyre;
	}
	public Seat[] getSeats() {
		return seats;
	}
	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}
	
	
	
	
}
