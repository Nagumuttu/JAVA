package com.this_super;
class Studentt{
	String name;
	int age;
	Studentt(String name, int age){
		this.name= name;
		this.age = age;
		
		
	}
	void display() {
		System.out.println("Name: "+ name);
		System.out.println("age:"+age);
	}
}
public class ThisKeyword {
	public static void main(String[] args) {
		
	
	Studentt s = new Studentt("Appu",23);
	s.display();


}
}