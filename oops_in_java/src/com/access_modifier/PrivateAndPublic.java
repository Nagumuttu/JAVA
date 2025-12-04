package com.access_modifier;

class Student{
public String std_name = "appu";
//private int age= 23;
int age = 23;
protected String cls = "2sem";
}

public class PrivateAndPublic {
public static void main(String[] args) {
	Student s1 = new Student();
	System.out.println(s1.std_name);
	System.out.println(s1.age);
}

}
