package com.deloitte.demo;

public class VarDemo {

	int num = 10;
	static int num2 = 20;

	public static void main(String[] args) {
		
		VarDemo obj = new VarDemo();

		System.out.println(obj.num);
		System.out.println(VarDemo.num2);
		
		final int num3 = 30;
		System.out.println(num3);
//		num3 = 35; // CE 
		System.out.println(num3);

	}

}
