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

////Q. How to USE abstract method(s) from an interface?
//
//// Answer 2 - Use anonymous inner class 
//// and implement those methods  
//
//public class FunDemo {
//
//	public static void main(String[] args) {
//
//		FunInt obj = new FunInt() {
//
//			@Override
//			public void absMethod() {
//				System.out.println("absMethod in FunInt");
//			}
//
//			@Override
//			public void anotherAbsMethod() {
//				System.out.println("anotherAbsMethod in FunInt");
//			}
//		};
//		obj.absMethod();
//		obj.anotherAbsMethod();
//	}
//}

//Q. How to USE abstract method(s) from an interface?

//Answer 3 - Use lambda expression 
// (only for functional interface)

public class FunDemo {

	public static void main(String[] args) {

		FunInt obj = () -> {
			System.out.println("absMethod in FunInt");
		};
		obj.absMethod();

//		Maths obj2  /* code here with lambda */ ;

//		Maths obj2 = (int i, int j) -> { return i + j; };
		Maths obj2 = (i, j) -> i + j;

		System.out.println(obj2.addNums(0, 0));
		
//		Taxation obj3 = (double amount) -> { return amount + (amount * 18 / 100);};
		
		Taxation obj3 = amount -> amount + (amount * 18 / 100);

		System.out.println(obj3.gstCalc(100));

	}
}















// 