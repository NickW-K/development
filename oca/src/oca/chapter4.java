package oca;

//import static oca.util.Util.getName;
//import static oca.util.Util.age;

//or

import static oca.util.Util.*;

public class chapter4 {
	
	public final int test;
	
	// instance initialiser block to initialise final fields
	{
		//test = 1;
	}
	
	public static final int testStatic;
	
	// static initialiser block to initialise static final fields
	static {
		testStatic = 1;
	}
	
	// Can initialise final instance fields in the constructor, this does not work for static final fields
	public chapter4() {
		test = 1;
		
		//int localAge = Util.age;
		int localAge = age;
		String name = getName();
	}

	public static void main(String[] args){
		String name ="Webby";
		int num = 4;
		StringBuilder builder = new StringBuilder();
		speak(name, num, builder);
		System.out.println(name);
		System.out.println(num);		
		System.out.println(builder);
	}
	
	public static void speak(String name, int num, StringBuilder builder){
		name="Sparky"; // returns a new string reference
		num = 6;
		builder.append("test");
	}
	
}