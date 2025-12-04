package com.Static_Final;
class Employee{
	public static String comapny="Parvam";
	public static void details() {
		System.out.println("comapmy: " +comapny);
	}
}

public class Static {
	public static void main(String[] args) {
		System.out.println("Company: " +Employee.comapny);
		Employee.details();
	}
}

