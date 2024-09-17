package com.deloitte.demo.day2.abs;

@FunctionalInterface
public interface FunInt {
	
	public abstract void absMethod();
}

interface Maths {
	
	public abstract int addNums(int i, int j);
	
}

interface Taxation {
	
	public abstract double gstCalc(double amount);
	
}


//package com.deloitte.demo.day2.abs;
//
//public interface FunInt {
//	
//	public abstract void absMethod();
//
//	public abstract void anotherAbsMethod();
//}

//class ConClass implements FunInt {
//
//	@Override
//	public void absMethod() {
//		System.out.println("absMethod in FunInt");
//	}
//
//	@Override
//	public void anotherAbsMethod() {
//		System.out.println("anotherAbsMethod in FunInt");
//	}
//	
//}

//package com.deloitte.demo.day2.abs;
//
//@FunctionalInterface
//public interface FunInt {
//	
//	public abstract void funMethod();	
//
////	public abstract void absMethod();
////
////	public abstract void absMethod2();
//
//}
