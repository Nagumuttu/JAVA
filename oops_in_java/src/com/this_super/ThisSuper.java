package com.this_super;

class Person{
	public String name;
	public int age=30;
		
}
class Employee extends Person{
	public String salary="two hundred";
	public int age=24;
	
	public void display() {
		System.out.println("name;"+this.name);
		System.out.println("salary:"+this.salary);
		System.out.println("age:"+this.age);
		System.out.println("age:"+super.age);
	}
}
public class ThisSuper {
public static void main(String[] args) {
	Employee e1=new Employee();
	e1.name="appu";
	e1.display();
	Employee e2=new Employee();
	e2.name="anu";
	e2.display();
	
}
}
