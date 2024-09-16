package com.deloitte.demo;

public class SwitchDemo {

	public static void main(String[] args) {

		System.out.println("Start");

		String letter = "c"; // p

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

	}

}
