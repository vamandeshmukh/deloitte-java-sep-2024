package com.deloitte.demo;

public class ObjectDemo {

	public static void main(String[] args) {

		int      num = 10;
		Employee obj = new Employee();

		obj.id = 101;
		obj.name = "Sonu";
		obj.salary = 10.50;

		System.out.println(obj.toString());

//		obj.writeCode();

	}

}

//package com.deloitte.demo;
//
//public class ObjectDemo {
//
//	public static void main(String[] args) {
//
//		Employee obj = new Employee();
//
//		obj.id = 101;
//		obj.name = "Sonu";
//		obj.salary = 10.50;
//
////		System.out.println("id = " + obj.id + " name = " + obj.name + " salary = " + obj.salary);
//
//		System.out.println(obj.toString());
//
//		obj.writeCode();
//
////		Employee [id=101, name=Sonu, salary=10.5]
//
//	}
//
//}
