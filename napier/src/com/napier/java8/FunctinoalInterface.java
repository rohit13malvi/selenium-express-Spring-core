package com.napier.java8;

@FunctionalInterface
public interface FunctinoalInterface {

	public int m1(int s);

	default int m2() {
		int i = 9;
		int j = 10;
		return i + j;
	}
	static void m3() {
		System.out.println("this is static method");
	}

}
