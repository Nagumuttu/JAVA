package com.user_input;

import java.util.Scanner;

public class UserInput {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		System.out.println("Your age is: "+age);
		sc.close();
	}
}
