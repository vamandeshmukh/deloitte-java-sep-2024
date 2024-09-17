package com.deloitte.demo.day2.abs;

// Q. How to USE abstract method(s) from an interface?

//// Answer 1 - Inherit that interface to a concrete class 
//// and implement those methods  
//
//public class FunDemo {
//
//	public static void main(String[] args) {
//		
//		ConClass obj = new ConClass();
//		obj.absMethod();
//		obj.anotherAbsMethod();
//	}
//}

// Answer 2 - Use anonymous inner class 
// and implement those methods  

public class FunDemo {

	public static void main(String[] args) {
		
		FunInt obj = new FunInt() {

			@Override
			public void absMethod() {
				System.out.println("absMethod in FunInt");
			}

			@Override
			public void anotherAbsMethod() {
				System.out.println("anotherAbsMethod in FunInt");
			}
		};
		
		obj.absMethod();
		obj.anotherAbsMethod();

	}
}









