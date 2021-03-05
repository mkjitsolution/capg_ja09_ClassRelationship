package p4;

public class AnimalGame {

	public static void main(String[] args) {
		
		AnimalGame user = new AnimalGame();
		
		Dog dog = new Dog();
		user.userPlayAnimalGame(dog);
		
		System.out.println("\n\n ** User change the Animal ** \n");
		
		
		  Cat cat = new Cat(); 
		  user.userPlayAnimalGame(cat);
		 
	}
	
	// animal a = new dog();
	public void userPlayAnimalGame(Animal a)
	{
		a.doWalk();
		
		if(a instanceof Dog)
		{
			Dog d = (Dog)a;
			d.playGame();	
			
		}
		else if(a instanceof Cat)
		{
			Cat cat = (Cat)a;
			cat.doCatThings();
		}
		
	}
}














