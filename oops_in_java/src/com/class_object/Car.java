package com.class_object;

public class Car {
	public String car_name= "swift";
			public int wheels=4;
			
			public void running() {
			System.out.println(car_name+" car is running");

}
			public static void main(String[] args) {
				Car car1 = new Car();
				System.out.println(car1);
				System.out.println(car1.car_name);
				System.out.println(car1.wheels);
				car1.running();
				
				
			}
			}
