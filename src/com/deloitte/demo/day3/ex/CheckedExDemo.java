package com.deloitte.demo.day3.ex;

public class CheckedExDemo {

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

//package com.deloitte.demo.day3.ex;
//
//public class CheckedExDemo {
//
//	public static void main(String[] args) {
//
//		System.out.println("Start");
//		CheckedExDemo.printNums();
//		System.out.println("End");
//	}
//
//	static void printNums() {
//		for (int i = 1; i <= 10; i++) {
//			try {
//				Thread.sleep(300);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
//	}
//}
