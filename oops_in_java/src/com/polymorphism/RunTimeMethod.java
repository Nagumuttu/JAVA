package com.polymorphism;
class Parent {
	void isWalking() {
		System.out.println("is Walking");
	}}
	class Child extends Parent{
		
		void isWalking() {
			System.out.println("child is Walking");
		}
	}


public class RunTimeMethod {
	public static void main(String[] args) {
		Parent p = new Child();
		p.isWalking();
				
	}

}
