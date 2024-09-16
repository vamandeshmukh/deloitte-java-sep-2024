package com.deloitte.demo;

public class StringDemo {

	public static void main(String[] args) {

//		String str = "abc";
//		System.out.println(str);
//		System.out.println(System.identityHashCode(str));
//
//		str = "def";
//		System.out.println(str);		
//		System.out.println(System.identityHashCode(str));
//		
		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
//		sb.append("def"); // abcdef   
//		sb.replace(0, 3, "def"); // def 
		sb.setLength(0);
		sb.append("def");
//		sb.
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));

//		String str = "Abc";
//		String str2 = "ABC";
//
//		System.out.println(str.equals(str2));
//		System.out.println(str.equalsIgnoreCase(str2));
//
//		System.out.println(str.charAt(3));

	}

}






