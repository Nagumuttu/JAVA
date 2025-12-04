package com.Tasks;
class Vehicle{
	Vehicle(){
		System.out.println("Vehicle is created");
	}
}
class  Car extends Vehicle{
	Car(){
		super();
		System.out.println("Car is created");
		
	}
}

public class SuperKey {
	public static void main(String[] args) {
		new Car();
	}

}
