package com.deloitte.demo.day3.col;

import java.util.ArrayList;

public class CollectionDemo {

	// data structures -
	// linked list, stack, set, hash, map etc
	// store, add, update, delete, search, traverse etc

	public static void main(String[] args) {

		ArrayList myFriends = new ArrayList();

		System.out.println(myFriends);
		System.out.println(myFriends.size());

		myFriends.add("Sonu");
		myFriends.add("Monu");
		myFriends.add(20);
		myFriends.add(false);
		myFriends.add(10.25);

		System.out.println(myFriends);
		System.out.println(myFriends.size());
		
		myFriends.remove(2);
		
		System.out.println(myFriends);
		System.out.println(myFriends.size());
		
	}

}
