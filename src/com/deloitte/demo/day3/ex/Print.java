package com.deloitte.demo.day3.ex;

public class Print {

	// you 
	public static void printNums() throws InterruptedException, NumberFormatException {
		for (int i = 1; i <= 10; i++) {
			Thread.sleep(300); // vaman's car 
			System.out.println(i);
		}
	}
}


//package com.deloitte.demo.day3.ex;
//
//public class Print {
//	
//	static void printNums()  {
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
