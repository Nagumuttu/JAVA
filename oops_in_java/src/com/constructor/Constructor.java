package com.constructor;
class Student{
	public String name;
	public int age;
	Student(String name,int age){
		this.name=name;
		this.age=age;
	
	}
	Student (){
		
	}
public void display() {
System.out.println("name:"+this.name);
	
System.out.println("age:"+this.age);
		
	}
}

public class Constructor {
	public static void main(String[] args) {
		Student s1=new Student("appu",23);
		s1.display();
		Student s2=new Student("anu",22);
		s2.display();
		Student s3=new Student("tharun",24);
		s3.display();
	}

}
