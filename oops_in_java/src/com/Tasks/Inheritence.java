package com.Tasks;

class Person {
	String name;
	int age;

	void BasicDetails() {
		System.out.println("Name:" + name);
		System.out.println("Age:" + age);
	}
}

class Studentss extends Person {
	String course;
	int rollnumber;

	void StudentDetails() {
		System.out.println("Course:" + course);
		System.out.println("Rollnumber:" + rollnumber);

	}
}

class Teacher extends Person {
	String subject;
	int employeeId;

	void TeacherDetails() {
		System.out.println("Subject:" + subject);
		System.out.println("EmployeeId:" + employeeId);
	}

}

public class Inheritence {
	public static void main(String[] args) {
		Studentss s = new Studentss();
		s.name = "appu";
		s.age = 23;
		s.rollnumber = 7;
		s.course = "java";
		
		System.out.println("StudentDetails");
		s.BasicDetails();
		s.StudentDetails();

		Teacher t = new Teacher();
		t.name = "lakshmi";
		t.age = 35;
		t.employeeId = 177;
		t.subject = "Computer Science";
		System.out.println("TeacherDetails");
		t.BasicDetails();
		t.TeacherDetails();

	}

}
