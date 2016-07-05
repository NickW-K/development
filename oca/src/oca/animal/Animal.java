package oca.animal;

public class Animal {

	private int age;
	private String name;
	private boolean canHop;
	
//	public Animal()
//	{
//		//super();
//		//int i = 1;
//		this(1,"2"); // has to be the first uncommented line of code.
//	}
	
	public Animal(int age, String name, boolean canHop)
	{
		this.age = age;
		this.name = name;
		this.canHop = canHop;
	}
	
	public boolean canHop()
	{
		return canHop;
	}

	public Integer howHigh()
	{
		return new Integer(1);
	}
	
}
