package com.sriteja.main;

public class RelationalOperators {
	public static void main(String args[]) {
		
		int a = 30;
		int b = 50;
		
		RelationalOperators relOperator=new RelationalOperators();
		relOperator.getRelationalOperators(a,b);//instance method or non static method,parameterized method
		//static method calling
		showLogicalOperators(b,a);
		
		
		
	}
	private void getRelationalOperators(int a,int b) {
		
		if(a>b) {
			System.out.println("a>b is true so if condition is excuting");
		}else {
			System.out.println("a>b is is false so else condition is excuting");
			


		
			}
		//a<b
		System.out.println("a<b is true so if conidition is ecuting");
	}

		

//static method creation
private static void showLogicalOperators( int b, int a) {
	if ((b>=20)&& (a<=10)){
	System.out.println("Logical Operator && is true");
	}else {
		System.out.println("Logical Operator && is false");
	}
}
}

