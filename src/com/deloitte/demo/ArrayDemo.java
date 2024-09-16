package com.deloitte.demo;

public class ArrayDemo {

	public static void main(String[] args) {

		String[] myFriends = { "Sonu", "Monu", "Tonu", "Ponu" };

		System.out.println("Using for loop - ");
		for (int i = 0; i < myFriends.length; i++)
			System.out.println(myFriends[i]);

		System.out.println("Using for each loop - ");
		for (String friend : myFriends)
			System.out.println(friend);

//		Output - 
//		Sonu
//		Monu
//		Tonu
//		Gonu

	}

}
