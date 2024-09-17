package com.deloitte.demo.day2;

import java.util.Objects;

public class ThisSuperDemo {

	public static void main(String[] args) {

		Employee emp = new Employee(101, "Sonu", 90.5);
		System.out.println(emp.toString());

		Employee emp2 = new Employee(101, "Sonu", 90.5);
		System.out.println(emp2);

		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp.equals(emp2));
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
	public int hashCode() {
		return Objects.hash(id, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id && Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", salary=" + salary + ", name=" + name + "]";
	}

}