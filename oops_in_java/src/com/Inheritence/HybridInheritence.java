package com.Inheritence;
class Animals{
	void eat() {
		System.out.println("Animals is eating");
	}
}

class Dogs extends Animal{
	void bark() {
		System.out.println("Dogs is barking");
	}

	
}
class Cats extends Animal{
	void meow() {
		System.out.println("cats is meowing");
	}
}


interface PetSound{
	void sound();
	
}

class Puppys extends Dog implements PetSound{
	public void sound() {
		System.out.println("Puppys is making cute sound");
		
	}	
}

public class HybridInheritence {
	public static void main(String[] args) {
		Puppys p = new Puppys();
		p.eat();
		p.bark();
		p.sound();
	}

}
