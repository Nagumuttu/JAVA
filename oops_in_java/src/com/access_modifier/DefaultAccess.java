package com.access_modifier;

public class DefaultAccess {
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.std_name);
		System.out.println(s1.age);
		System.out.println(s1.cls);

	}

}
