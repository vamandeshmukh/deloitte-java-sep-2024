package com.deloitte.demo.day3.cmp;

public class ComparableDemo {

	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "Sonu", 90.25);
		Employee emp2 = new Employee(102, "Monu", 95.75);
		
//		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp2.compareTo(emp1));
		
		
		

	}

}
