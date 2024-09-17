package com.deloitte.demo.day2.abs;

interface FinMin {

	public abstract void collectTax();
//	void collectTax();

	public default void m1() {
		System.out.println("default method in interface");
	}
}

interface StateGovt {

	public abstract void paySalary();
}

abstract class Rbi {

	public abstract void doKyc();

	public void payInterest() {
		System.out.println("interest @8% per annum");
	}
}

class HdfcBank extends Rbi implements FinMin, StateGovt {

	@Override
	public void doKyc() {
		System.out.println("HDFC KYC with Aadhaar");
	}

	public void getInsurance() {
		System.out.println("General Insurance");
	}

	@Override
	public void collectTax() {
		System.out.println("10% tds is cut");

	}

	@Override
	public void paySalary() {
		System.out.println("pay salary in time");
	}
}

class IciciBank extends Rbi {

	@Override
	public void doKyc() {
		System.out.println("ICICI KYC with PAN");
	}

}
