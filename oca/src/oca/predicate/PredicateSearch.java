package oca.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import oca.animal.Animal;

public class PredicateSearch {
	public static void main(String[] args)
	{
		List<Animal> animals = new ArrayList<Animal>();
		List<Integer> integers = new ArrayList<Integer>();
		animals.add(new Animal(15,"bunny", true));
		integers.add(new Integer(15));
		integers.add(new Integer(16));
		integers.add(new Integer(17));
		
		// Java figures out the type in the Lambda expression if not explicitly given as it knows it will match the send parameter on the method being called.
		print(animals, a -> a.canHop());
		test(integers, (a) -> {return a.intValue() > 15;});		
		
	}

	private static void print(List<Animal> animals, Predicate<Animal> checker) 
	{
		for (Animal animal : animals) 
		{
			if (checker.test(animal)) 
			{
				System.out.println(animal + " ");
			}
		}
		System.out.println();
	}
	private static void test(List<Integer> integers, Predicate<Integer> checker) 
	{
		for (Integer num : integers) 
		{
			if (checker.test(num)) 
			{
				System.out.println(num + " ");
			}
		}
		System.out.println();
	}

}
