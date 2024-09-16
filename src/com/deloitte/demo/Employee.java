package com.deloitte.demo;

// constructor - 
// special type of method 
// does not have a return type 
// needed to create object 
// by default, JVM provides a default constructor
// if needed we can create one or more constructors 
// if we create a constructor, then JVM will not provide one 

public class Employee {

	Employee() {
		System.out.println("default constructor");
	}

	int id;
	String name;
	double salary;

	public Employee(int id, String name, double salary) {
		System.out.println("paremeterized constructor");
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}

//package com.deloitte.demo;
//
//public class Employee {
//
//	int id;
//	String name;
//	double salary;
//
//	void writeCode() {
//		System.out.println("Employee writing code...");
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}
//
//}

//package com.deloitte.demo;
//
//public class Employee {
//
//	int id;
//	String name;
//	double salary;
//
//	void writeCode() {
//		System.out.println("Employee writing code...");
//	}
//
//	@Override
//	public String toString() {
//		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
//	}
//
////	printEmpData
//
//////	@Override
////	public String toString() {
////		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
////	}
//
//}

//class Animal {
//
//	void eat() {
//		System.out.println("eat food");
//	}
//}
//
//class Dog extends Animal {
//	
//	@Override
//	void eat() {
//		System.out.println("eat carnivorous food");
//	}
//	
//
//}
