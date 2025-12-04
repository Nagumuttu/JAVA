package com.class_object;

public class Vehicle {
	public String vehicle = "bike";
	public int wheels = 2;

	public void running() {
		System.out.println(vehicle+ " is moving");

	}

	public static void main(String[] args) {
		Vehicle bike = new Vehicle();
		System.out.println(bike);
		System.out.println(bike.vehicle);
		System.out.println(bike.wheels);
		bike.running();

	}

}
