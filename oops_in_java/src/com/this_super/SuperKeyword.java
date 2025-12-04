package com.this_super;
class Parent{
	String name = "xyz";
	
}
class Child extends Parent{
	String name = "abc";
	 
	void display() {
		System.out.println(name);
		System.out.println(super.name);
	}
}
public class SuperKeyword {
	public static void main(String[] args) {
		Child c = new Child();
		c.display();
	}

}
