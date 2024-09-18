package com.deloitte.demo.day3.ex;

public class AnotherClass {

	// your friend 
	public static void main(String[] args) {

		System.out.println("Start");
		try {
			Print.printNums();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End");
	}

}
