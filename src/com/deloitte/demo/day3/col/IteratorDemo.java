package com.deloitte.demo.day3.col;

import java.util.ArrayList;

public class IteratorDemo {
	
	public static void main(String[] args) {
		
		ArrayList<String> myFriends = new ArrayList<>();

		myFriends.add("Sonu");
		myFriends.add("Monu");
		myFriends.add("Tonu");
		myFriends.add("Ponu");
		
		System.out.println("Iterate using for loop: ");
		for (int i = 0; i < myFriends.size(); i++) {
			System.out.println(myFriends.get(i));
		}
		
		System.out.println("Iterate using for each loop: ");
		
		System.out.println("Iterate using forEach method: ");


		System.out.println("Iterate using iterator: ");
		// i will 

	}

}
