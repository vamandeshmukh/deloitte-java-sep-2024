package com.deloitte.demo.day3.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<String> myFriends = new ArrayList<>();

		myFriends.add("Sonu");

		myFriends.addAll(Arrays.asList("Monu", "Tonu", "Ponu"));

		System.out.println("Iterate using for loop: ");
		for (int i = 0; i < myFriends.size(); i++) {
			System.out.println(myFriends.get(i));
		}

		System.out.println("Iterate using for each loop: ");
		for (String friend : myFriends) {
			System.out.println(friend);
		}

		System.out.println("Iterate using forEach method: ");
//		Consumer<String> printMyFriend = friend -> System.out.println(friend);
//		myFriends.forEach(printMyFriend);
		myFriends.forEach(friend -> System.out.println(friend));

		System.out.println("Iterate using iterator: ");
		Iterator<String> iterator = myFriends.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
