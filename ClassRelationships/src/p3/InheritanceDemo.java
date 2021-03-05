package p3;

class A    // Parent class , Super
{
	A()
	{
		System.out.println(" Inside A");
	}
	
	public void abc()
	{
		System.out.println(1+1);  // 1000 line 
	}
}

class B extends A    // Child  , sub - class
{
	B(int x)
	{
		System.out.println(" Inside B");
	}
	
	public void abc()
	{
		System.out.println("1+1"+(1+1));
	}
}

class C extends B   // child
{
	C()
	{
		super(101);
		System.out.println(" Inside C");
	}
}


public class InheritanceDemo {

	public static void main(String[] args) {
		
		C cobj = new C();
		
		
	}
}
