package com.deloitte.demo;

public class ConstructorDemo {

	public static void main(String[] args) {

		Employee obj1 = new Employee();
		obj1.id = 101;
		obj1.name = "Sonu";
		obj1.salary = 90.50;
		System.out.println(obj1.toString());

		Employee obj2 = new Employee();
		obj2.id = 102;
		obj2.name = "Monu";
		obj2.salary = 95.75;
		System.out.println(obj2.toString());

		Employee obj3 = new Employee(103, "Tonu", 92.25);
		System.out.println(obj3.toString());

	}

}
