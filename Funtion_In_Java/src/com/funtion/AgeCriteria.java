package com.funtion;

import java.util.Scanner;

public class AgeCriteria {
	static void checkEligibility(int age) {
		if(age>=18) {
			System.out.println("your are eligible to vote.");
			
		}else {
			System.out.println("your are not eligible to vote.");
	
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enetr your age:");
		int age = scanner.nextInt();
		checkEligibility(age);
		scanner.close();
	}
}
