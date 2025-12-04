package com.Tasks;

class MathUtility {
	int add(int a, int b) {
		System.out.println("addition:" + (a + b));
		return a + b;
	}

	double add(double a, double b) {
		System.out.println("addition:" + (a + b));
		return a + b;
	}

	int add(int a, int b, int c) {
		System.out.println("addition:" + (a + b));
		return a + b + c;

	}

}

public class MethodOverloading {
	public static void main(String[] args) {
		MathUtility m = new MathUtility();
		m.add(78, 789);
		m.add(58.3, 75.28);
		m.add(89, 789, 10);

	}

}
