package com.class_object;

public class Employee {
	public String name = "Appu";
	public int age = 23;
	public int salary = 21700;
	
	public void working() {
		System.out.println(name+" is working");
	}
	public static void main(String[] args) {
		Employee s1= new Employee();
		 System.out.println(s1);
		 System.out.println(s1.name);
		 System.out.println(s1.age);
		 System.out.println(s1.salary);
		 s1.working();
	}
	
}
