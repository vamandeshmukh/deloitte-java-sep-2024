package com.deloitte.demo.day2;

public class ThisSuperDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sonu", 90.5);
		System.out.println(emp.toString());
	}
}

class Person {

	String name;

	public Person() {
	}
	
	public Person(String name) {
		this.name = name;
	}
}

class Employee extends Person {

	int id;
	double salary;

	public Employee(int id, String name, double salary) {
//		super();
//		super(name);
		super.name = name;
		this.id = id;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}

}