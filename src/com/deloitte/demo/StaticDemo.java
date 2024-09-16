package com.deloitte.demo;

public class StaticDemo {

	public static void main(String[] args) {

		BankCustomer customer1 = new BankCustomer();
		customer1.accountNumber = 101;
		
		System.out.println(customer1.toString());

	}

}

class BankCustomer {

	int accountNumber; // non static - belongs to object - unique for each object, accessed with objectName.fieldName
	static String ifsc = "abcd00012"; // static - belong to class - common for all objects, accessed with ClassNme.fieldName

	@Override
	public String toString() {
		return "BankCustomer [accountNumber=" + accountNumber + " ifsc = " + ifsc + "]";
	}

}
