package com.Inheritence;
class Parent{
	public boolean isWorking = true;
	public void  isWorking() {
		System.out.println("parent can work");
	}	
}
class Child extends Parent{
	
}

public class Inheritence {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.isWorking();
		System.out.println(c1.isWorking);
	}

}
