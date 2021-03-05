package p2;

public class MainApp {
	
	public static void main(String[] args) {
		
		
		Engine e = new Engine();
		// approach 1
		Tyre t1 = new Tyre();
		Tyre t2 = new Tyre();
		Tyre t3 = new Tyre();
		Tyre t4 = new Tyre();
		Tyre tyres[] = {t1,t2,t3,t4};
		
		// approach 2
		Seat seats[] = {new Seat(),new Seat(),new Seat(),new Seat(),new Seat()};
		
		MusicSystem ms = new MusicSystem();
		
		Car mycar = new Car(e,tyres,seats,123,"My New Car","White",ms);
		
		
		
	}

}
