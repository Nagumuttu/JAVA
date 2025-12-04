package com.Tasks;

class Animal {
	void sound() {
		System.out.println("Animal makes sounds");
	}
}

class Dog extends Animal {
	void sound() {
		System.out.println("Dog Barks");
	}
}

class Cat extends Animal {
	void sound() {
		System.out.println("Cat meow");
	}

}

class Cow extends Animal {
	void sound() {
		System.out.println("Cow Moos");
	}
}

public class MethodOverriding {
	public static void main(String[] args) {
		Animal[] animal = { new Dog(), new Cat(), new Cow() };
		for (Animal a : animal) {
			a.sound();
		}

	}
}
