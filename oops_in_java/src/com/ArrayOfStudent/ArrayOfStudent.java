package com.ArrayOfStudent;

import java.util.Arrays;

class Student {
	public String name;
	public int age;
	public int roll_num;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	
}

public class ArrayOfStudent {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "anu";
		s1.age = 22;
		s1.roll_num = 10;

		Student s2 = new Student();
		s2.name = "appu";
		s2.age = 23;
		s2.roll_num = 15;
		Student arr[] = new Student[2];
		arr[0]= s1;
		arr[1]= s2;
		System.out.println(Arrays.toString(arr));
	}

}
