package com.Practice;

import java.util.Scanner;

public class SearchEleInArray {
	public static void main(String[] args) {
		int arr[] = {10,30,70,80,90};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter element to search: ");
		int key = sc.nextInt();
		boolean found = false;
		for(int i = 0;i<arr.length; i++) {
			if(arr[i]==key) {
				System.out.println("Elements found at index:"+i);
				found= true;
					break;
				
			}
		}
		if (!found) {
			System.out.println("Not Found");
		}
	}
}
