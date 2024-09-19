package com.deloitte.demo.day4.jdbc;

import java.util.function.Function;

public class DoubtsDemo {

	public static void main(String[] args) {
		

		Function<String, Integer> obj = str -> str.length();
		
		int num = obj.apply("abc");
		
		System.out.println(num);
		
		
	}

}
