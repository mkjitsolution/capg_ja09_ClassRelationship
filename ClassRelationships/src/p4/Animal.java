package p4;

public class Animal  // ICICBankApplication(Server)
{
	public void doWalk()      // task1
	{
		System.out.println(" All animal walks");
	}
}

class Dog extends Animal // ICICIBankOnlineApplication
{
			
	@Override
	public void doWalk() {
		// 1000 lines of code 
		System.out.println(" Dog walk implementation ...");
			
	}

	public void playGame()   // task2
	{ 
		System.out.println(" Dog plays Games");
	}
}


class Cat extends Animal
{
	@Override
	public void doWalk()
	{
		// 1000 lines of code 
		System.out.println(" Cat walk implementation ...");
	}
	
	public void doCatThings()
	{
		System.out.println(" Cat things implementation ");
	}
}

