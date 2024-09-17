package com.deloitte.demo.day2;

public class WrapperDemo {
	
	public static void main(String[] args) {
		
//		int num = 10;		
//
//		Integer num2 = 20; // boxing - autoboxing 
//		int num3 = num2; // unboxing 
//				
//		Person pers = new Person();
////		pers.
//		
////		System.out.println(2147483647);
		
		String n1 = "145";
		String n2 = "255";
		
		int n4 = Integer.parseInt(n1);
		int n5 = Integer.parseInt(n2);
		
		int n6 = n4 + n5;
		
		String n3 = Integer.toString(n6);
		
		System.out.println(n3);
		
	}

}
