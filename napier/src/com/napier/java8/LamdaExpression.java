package com.napier.java8;

public class LamdaExpression {

	public static void main(String[] args) {
		FunctinoalInterface fn = ( r) -> {
			System.out.println("Hello");
			int a = 10;
			int b = 29;
			return a + b + r;

		};
		fn.m1(4);
		int out = fn.m2();
		System.out.println(out);

	}

}
