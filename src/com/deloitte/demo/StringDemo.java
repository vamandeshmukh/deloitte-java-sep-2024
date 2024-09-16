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
//		String str2 = new String("ghi");
//		System.out.println(str2);

		StringBuilder sb = new StringBuilder("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		sb.append("def");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));

	}

}
