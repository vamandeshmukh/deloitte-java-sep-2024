package com.deloitte.demo.day2;

public class InheritDemo {

	public static void main(String[] args) {

		System.out.println("Phone");
		Phone phone1 = new Phone();
		phone1.call();
		phone1.sms();

		System.out.println("SmartPhone");
		SmartPhone phone2 = new SmartPhone();
		phone2.call();
		phone2.sms();
		phone2.camera();

	}
}

class Phone {

	void call() {
		System.out.println("calling...");
	}

	void sms() {
		System.out.println("texting...");
	}

}

class SmartPhone extends Phone {

	void camera() {
		System.out.println("clicking...");
	}

}
