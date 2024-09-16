package com.deloitte.demo;

public class TypeDemo {
	
	public static void main(String[] args) {
		
//		int num = 10;
//		char ch = 'a';
//		System.out.println(num + ch);
		
//		byte b1 = 10; // -128 127 
//		byte b2 = 20;
////		int b3 = b1 + b2; //CE - byte, short, int, char => int 
//		byte b3 = (byte) (b1 + b2); //CE - byte, short, int, char => int 
//		System.out.println(b3);

		byte b1 = 127; // 12 
		byte b2 = 1; // 1 
		byte b3 = (byte) (b1 + b2); //   -128 
		System.out.println(b3);
		
	}

}
