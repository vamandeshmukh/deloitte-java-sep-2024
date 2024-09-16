package com.deloitte.demo;

public class MethodDemo {

	static double gstCalc(double amount, int gst) {
		return amount + (amount * gst / 100);
	}

	static double piValue() {
		return 3.142;
	}

	static void sayHello() {
		System.out.println("Hello world!");
	}

	public static void main(String[] args) {

		double amount = 5000;
		int gst = 18;
		double finalAmount = gstCalc(amount, gst);
		System.out.println(amount);
		System.out.println(finalAmount);

		System.out.println(gstCalc(500, 5));
		System.out.println(gstCalc(1000, 28));
		
//		System.out.println(piValue(10)); // CE 
		System.out.println(piValue());  
//		System.out.println(gstCalc()); // CE
//		System.out.println(gstCalc(10)); // CE
//		System.out.println(gstCalc(10, 10, 10)); // CE
		System.out.println(gstCalc(500, 5));

	}

}




