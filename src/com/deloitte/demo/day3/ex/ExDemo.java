package com.deloitte.demo.day3.ex;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter num1");
			int num1 = sc.nextInt();
			System.out.println("Enter num2");
			int num2 = sc.nextInt();
			System.out.println(num1 / num2);
		} catch (ArithmeticException e) {
			System.out.println("Do not divide by 0.");
		} catch (InputMismatchException e) {
			System.out.println("Enter only int value.");
		}
		finally {
			sc.close();
		}
		System.out.println("End");
	}
}

//package com.deloitte.demo.day3.ex;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ExDemo {
//
//	public static void main(String[] args) {
//
//		System.out.println("Start");
//		Scanner sc = new Scanner(System.in);
//
//		try {
//			System.out.println("Enter num1");
//			int num1 = sc.nextInt();
//			System.out.println("Enter num2");
//			int num2 = sc.nextInt();
//			System.out.println(num1 / num2);
//		} catch (ArithmeticException | InputMismatchException | ArrayIndexOutOfBoundsException e) {
////			System.out.println(e.getMessage());
//			System.out.println("Something is wrong!");
//		}
//		sc.close();
//		System.out.println("End");
//	}
//}

//package com.deloitte.demo.day3.ex;
//
//import java.util.Scanner;
//
//public class ExDemo {
//
//	public static void main(String[] args) {
//
//		System.out.println("Start");
//		Scanner sc = new Scanner(System.in);
//
//		try {
//			System.out.println("Enter num1");
//			int num1 = sc.nextInt();
//			System.out.println("Enter num2");
//			int num2 = sc.nextInt();
//			System.out.println(num1 / num2);
//		} catch (Exception e) {
////			System.out.println(e.getMessage());
//			System.out.println("Something is wrong!");
//		} 
//		sc.close();
//		System.out.println("End");
//	}
//}

//package com.deloitte.demo.day3.ex;
//
//import java.util.InputMismatchException;
//import java.util.Scanner;
//
//public class ExDemo {
//
//	public static void main(String[] args) {
//
//		System.out.println("Start");
//		Scanner sc = new Scanner(System.in);
//
//		try {
//			System.out.println("Enter num1");
//			int num1 = sc.nextInt();
//			System.out.println("Enter num2");
//			int num2 = sc.nextInt();
//			System.out.println(num1 / num2);
//		} catch (ArithmeticException e) {
//			System.out.println("Do not divide by 0.");
//		} catch (InputMismatchException e) {
//			System.out.println("Enter only int value.");
//		}
//		sc.close();
//		System.out.println("End");
//	}
//}

//package com.deloitte.demo.day3.ex;
//
//public class ExDemo {
//
//	public static void main(String[] args) {
//
//		System.out.println("Start");
//
//		System.out.println(10 / 0);
//
//		System.out.println("End");
//	}
//
//}
