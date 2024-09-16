package com.deloitte.demo;

public class ObjectLifeCycle {

	public static void main(String[] args) {

		// creation - new
		Person person = new Person("Sonu");

		// usage
		person.introduce();

		// nullify 
		person = null;

	}

}

class Person {

	String name;

	public Person() {

	}

	public Person(String name) {
		this.name = name;

	}

	void introduce() {
		System.out.println("Hi! I'm " + name + ".");
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("object is being deleted.");
	}

}