package oca.animal;

public interface Animal2 {

	public String getName();
	
//	public default String getName() 
//	{
//		return null;
//	}
}

interface Mammal 
{
	public String getName();
	
//	public default String getName()
//	{
//		return null;
//	}
}

abstract class Otter implements Mammal, Animal2 
{
	//public abstract String getName();
	
//	public String getName()
//	{
//		return null;
//	}
	
}