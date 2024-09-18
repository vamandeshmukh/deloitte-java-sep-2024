package com.deloitte.demo.day2.fun;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.Predicate;

public class FunIntDemo {

	public static void main(String[] args) {

		Function<String, Integer> function = str -> str.length();

		System.out.println(function.apply("abcd"));

		Consumer<String> consumer;

//		consumer.accept(null);

		Supplier<Integer> supplier;

//		supplier.get();

		Predicate<String> predicate;

//		predicate.test(null);
		
//		m1();

	}

}
