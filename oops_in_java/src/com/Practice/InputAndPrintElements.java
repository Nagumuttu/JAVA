package com.Practice;

import java.util.Scanner;

public class InputAndPrintElements {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a 5 numbers");
		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("you entered:");
		for (int i = 0; i < 5; i++) {
			System.out.println(arr[i]);
		}

	}

}
