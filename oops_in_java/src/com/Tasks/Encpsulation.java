package com.Tasks;
class Student{
	private String name;
	private int rollnumber;
	private int marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollnumber() {
		return rollnumber;
	}
	public void setRollnumber(int rollnumber) {
		this.rollnumber = rollnumber;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		if(marks>=0&&marks<=100) {
		this.marks = marks;
		}else {
			System.out.println("Invalid Marks");
		}
	}
}
public class Encpsulation {
	public static void main(String[] args) {
		Student s = new Student();
		s.setName("Nagu");
		s.setRollnumber(37);
		s.setMarks(77);
		System.out.println("Name:"+s.getName());
		System.out.println("rollnumber:"+s.getRollnumber());
		System.out.println("marks:"+s.getMarks());
		
	}

}
