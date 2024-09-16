package com.deloitte.demo;

public class OverLoadDemo {

	public static int addNums(int i, int j) {
		return i + j;
	}

	public static int addNums(int i, int j, int k) {
		return i + j + k;
	}

	public static int addNums(int i, int j, int k, int l) {
		return i + j + k + l;
	}

	public static void main(String[] args) {

		System.out.println(addNums(10, 20));
		System.out.println(addNums(10, 20, 30));
		System.out.println(addNums(10, 20, 30, 40));

	}

}
