package com.polymorphism;

class Calculator {
	void sub(int a, int b) {
		System.out.println("subtraction:" + (a - b));
	}

	void add(double a, double b) {
		System.out.println("addition:" + (a + b));
	}

	void add(float a, double b) {
		System.out.println("addition:" + (a + b));
	}

}

public class CompileTimeMethod {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.sub(10, 8);
		c.add(100.0, 88.25);
		c.add(56.8, 89.1);
	}

}
