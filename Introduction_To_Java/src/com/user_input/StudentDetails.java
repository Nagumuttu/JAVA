package com.user_input;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr the student name:");
		String name=sc.nextLine();
		
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter gender F/M/O");
		String gender=sc.nextLine();
		
		System.out.println("Enetr the marks obtained");
		double marks = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Enter the address");
		String address = sc.nextLine();
		
		System.out.println("\n=====student details=====");
		System.out.println("name:"+name);
		System.out.println("age:"+age);
		System.out.println("gender:"+gender);
		System.out.println("marks:"+marks);
		System.out.println("address:"+address);
		
		
		
	}

}
