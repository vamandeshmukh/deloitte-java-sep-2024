package com.deloitte.demo.day3.cmp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.addAll(Arrays.asList(new Employee(101, "Sonu", 90.75), new Employee(102, "Monu", 95.25),
				new Employee(103, "Tonu", 92.75), new Employee(104, "Ponu", 97.75)));

		System.out.println("List as per insertion order:");
		empList.forEach(System.out::println);

		System.out.println("List as per sorted by name:");
		EmployeeNameComparator empComp = new EmployeeNameComparator();
		Collections.sort(empList, empComp);
		empList.forEach(System.out::println);

	}

}
