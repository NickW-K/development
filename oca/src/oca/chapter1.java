package oca;

import java.util.ArrayList;
import java.util.List;

public class chapter1 {
	
	{
		// Instance initializers are outside of any other methods
	}

	public void admission() {
		
		{
			// Allowed to a have matching braces within another method.
			
		}
		
		//int amount1 = 9L;	// cannot convert a long to an int
		int amount2 = 0b101;
		int amount3 = 0xE;
		double amount4 = 0xE;
		double amount5 = 1_2.0_0;
		int amount6 = 1_2;
		
		long smallNum = 1; // adding an L is no harm, probably good practise.
		long tooLargeForInt = 34567890212L;
		
		float floating = 1.02f;
		
		int x = 0;
		long y = 10;
		
		for(x=1,y=1; x<5 && y<100 ; x++,y++)
		{
			
		}
		
		for(int a=1, b=1; x<5 && y<100 ; x++,y++)
		{
			
		}
		
		List test = new ArrayList();
	}
	
}