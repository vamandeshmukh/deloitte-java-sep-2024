package com.deloitte.demo.day3.strm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.addAll(Arrays.asList(new Employee(101, "Sonu", 90.25), new Employee(102, "Monu", 95.75),
				new Employee(103, "Tonu", 92.50), new Employee(104, "Soni", 97.25)));
		
		System.out.println("Iterate using for loop: ");
		for (int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i));
		}

		System.out.println("Iterate with for each and print with method reference:");
//		empList.forEach( e -> System.out.println(e));
		empList.forEach(System.out::println);

	}

}
