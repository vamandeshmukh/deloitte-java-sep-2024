package com.deloitte.demo;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		System.out.println("Start");
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a letter: ");
		String letter = sc.next();

		switch (letter) {
		case "a":
			System.out.println("Attractive");
			break;
		case "b":
			System.out.println("Beautiful");
			break;
		case "c":
			System.out.println("Charming");
			break;
		default:
			System.out.println("Zealous");
			break;
		}
		
		System.out.println("Enter an int value:");
		int num = sc.nextInt();
		System.out.println(num);
		
		sc.close();
	}
}
