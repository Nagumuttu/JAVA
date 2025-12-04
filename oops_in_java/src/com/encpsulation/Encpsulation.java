package com.encpsulation;
class Student{
	private String name;
	private int age;
	private int rollnumber;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	
}
public class Encpsulation {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setName("Appu");
		s1.setAge(23);
		s1.setRollnumber(47);
		System.out.println("Name:"+s1.getName());
		System.out.println("age:"+s1.getAge());
		System.out.println("rollnumber:"+s1.getRollnumber());
		
	}

}
