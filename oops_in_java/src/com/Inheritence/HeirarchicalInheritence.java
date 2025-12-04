package com.Inheritence;

class Bird{
	void eat() {
		System.out.println("bird is eating");
	}
}
class Pigion extends Bird{
	void flying() {
		System.out.println("pigion is flying");
	}
}
class Parrot extends Bird{
	void eating() {
		System.out.println("parrot is eating");
	}
}
class Pecock extends Bird{
	void dancing() {
		System.out.println("pecock is dancing");
		
	}
}
public class HeirarchicalInheritence {
	public static void main(String[] args) {
		Pigion p1= new Pigion();
		Parrot p2 = new Parrot();
		Pecock p3 = new Pecock();
		 p1.eat();
		 p1.flying();
		 p2.eat();
		 p2.eating();
		 p3.eat();
		 p3.dancing();
	
	}

}
