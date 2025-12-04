package com.ArrayOfStudent;

import java.util.Scanner;

class Std {
	String name;
	String gender;
	int age;
	double marks;
	String address;
}

public class UserInputValueStd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter number of Students");
		int n = sc.nextInt();
		sc.nextLine();
    Std[] students = new Std[n];
    
    for (int i=0; i<n; i++) {
    	students[i] = new Std();
    	System.out.println("\nEnter details for Student"+(i+1));
    	
    	System.out.println("Enter  name:");
    	students[i].name=sc.nextLine();
    	
    	System.out.println("Enter gender :");
    	students[i].gender=sc.nextLine();
    	
    	System.out.println("Enter age:");
    	students[i].age=sc.nextInt();
    	
    	System.out.println("Enter marks:");
    	students[i].marks=sc.nextInt();
    	
    	System.out.println("Enter address:");
    	students[i].address=sc.nextLine();
    	
    }
    System.out.println("\n---Student Details---");
    for (int i=0; i<n; i++) {
    	System.out.println("\nStudent"+(i+1));
    	System.out.println("Name"+students[i].name);
    	System.out.println("gender"+students[i].gender);
    	System.out.println("age"+students[i].age);
    	System.out.println("Marks"+students[i].marks);
    	System.out.println("address"+students[i].address);
    }
	}

}
