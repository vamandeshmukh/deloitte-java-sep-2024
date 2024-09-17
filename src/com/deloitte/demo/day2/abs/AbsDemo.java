package com.deloitte.demo.day2.abs;

public class AbsDemo {

	public static void main(String[] args) {

//		AbsClass obj = new AbsClass();
//		obj.addNums(0, 0);

		HdfcBank bank = new HdfcBank();
		bank.doKyc();
		bank.payInterest();
		IciciBank bank2 = new IciciBank();
		bank2.doKyc();
		bank2.payInterest();

		Rbi bank3 = new HdfcBank();
//		bank3.getInsurance();
		bank3.doKyc();
		bank3.payInterest();

		bank3 = new IciciBank();
		bank3.doKyc();

		HdfcBank bank4 = new HdfcBank();
		bank4.collectTax();
		
		bank4.m1();

	}

}
