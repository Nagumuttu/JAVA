package com.constructor;
class Student7{
	
	String name;
	int age;
	
	Student7(){
		name="a";
		age=0;
		System.out.println("D C");
	}
	Student7(String name){
		name="nagu";
		age=22;
		System.out.println("N A C" );
	}
	Student7(String name,int age){
		this.name="name";
		this.age=age;
		System.out.println("F A C");
	}
	void display() {
		System.out.println("Name:"+this.name + ", Age:"+this.age);
	}
}

public class CostructorOverloading {
	public static void main(String[] args) {
		Student7 s1 = new Student7();
		s1.display();
		Student7 s2 = new Student7("true");
		s2.display();
		Student7 s3=new Student7("appu",23);
		s3.display();
	}

}
