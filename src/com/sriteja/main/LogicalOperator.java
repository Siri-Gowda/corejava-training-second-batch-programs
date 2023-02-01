package com.sriteja.main;

public class LogicalOperator {
	public static void main(String args[]) {
		// Logical AND Operator
		// initializing variables
		int a = 20, b = 30, c = 50, d = 10;
		// Dispalying a,b,c,d
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

		// using Logical AND Operator

		if ((a < b) && (b < c)) {
			d = a + b + c + d;
			System.out.println(d);
		}
		if ((a > b) && (b > c)) {
			d = a * b * c * d;
			System.out.println(d);
		} else
			System.out.println("condition is false");
		if (a < b || c == d) {
			d = a * b * c * d;
			System.out.println(d);

		}
		// using Logical OR Operator

		if (a > b || c == d) {
			d = a + b;
			System.out.println("d");
		} else
			System.out.println("condition is false");
	}

}
