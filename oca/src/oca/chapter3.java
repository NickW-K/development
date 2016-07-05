package oca;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class chapter3 {
	
	private boolean test;
	
	int c2 = 5;
	long l2 = c2;
	
	public void test(){
		
	}

	public static void main(String[] args){
		String name ="Webby";
		int num = 4;
		StringBuilder builder = new StringBuilder();
		speak(name, num, builder);
		System.out.println(name);
		System.out.println(num);		
		System.out.println(builder);
		
		builder.append("Test");
		
		chapter3 chap3 = new chapter3();
		chap3.test();
	}
	
	public static void speak(String name, int num, StringBuilder builder){
		name="Sparky"; // returns a new string reference
		num = 6;
		builder.append("test");
		
		
		Integer x = (Integer) new Object();
		int i = 1;
		
		if(i==x){
			
		} else {
			
		}
		
		try{
			throw new IOException();

		} catch(Exception e){
			
		} finally {
		}
		
		String grades []; 
			grades = new String[] {"1", "2"};
	}
	
	public void print(Byte b){}
	public void print(byte b){}
	
}