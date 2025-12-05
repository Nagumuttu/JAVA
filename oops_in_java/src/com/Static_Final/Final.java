package com.Static_Final;

class Parent {
	void display() {
		System.out.println("Parent class");
	}

	final void display(int a) {
		System.out.println("Parent class");
	}
}

class Child extends Parent {
	@Override
	void display() {
		System.out.println("Child class");
	}

}

public class Final {
public static void main(String[] args) {
final double pi;
pi= 3.14;
System.out.println("Pi: "+pi);
//pi=3.45;
}
}
