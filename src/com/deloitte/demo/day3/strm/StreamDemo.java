package com.deloitte.demo.day3.strm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<>();

		empList.addAll(Arrays.asList(new Employee(101, "Sonu", 90.25), new Employee(102, "Monu", 95.75),
				new Employee(103, "Tonu", 92.50), new Employee(104, "Soni", 97.25)));

		System.out.println("List of all the employees:");
		empList.forEach(e -> System.out.println(e));

		System.out.println("List of those employees having salary > 95.00 using forEach method:");
		empList.forEach(e -> {
			if (e.getSalary() > 95.00)
				System.out.println(e);
		});

		System.out.println("List of those employees having salary > 95.00 using Stream API:");

//		Stream<Employee> empStream = empList.stream();
////		Predicate<Employee> predicate = e -> e.getSalary() > 95.50;
////		Stream<Employee> empTemp = empStream.filter(predicate);
//		Stream<Employee> empTemp = empStream.filter(e -> e.getSalary() > 95.50);
//		List<Employee> empsWithGivenSalary = empTemp.toList();
//		empsWithGivenSalary.forEach(e -> System.out.println(e));

		empList.stream().filter(e -> e.getSalary() > 95.00).toList().forEach(e -> System.out.println(e));

		System.out.println("Employee with the highest salary:");
//		empList.stream().max(Comparator.comparingDouble(e -> e.getSalary())).ifPresent(e -> System.out.println(e));
		empList.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).stream().forEach(e -> System.out.println(e));

		System.out.println("First two employees using Stream API:");
		empList.stream().limit(2).forEach(e -> System.out.println(e));
		
		System.out.println("Except first two employees using Stream API:");
		empList.stream().skip(2).forEach(e -> System.out.println(e));

	}

}
