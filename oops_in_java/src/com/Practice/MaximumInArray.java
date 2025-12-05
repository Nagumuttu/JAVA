package com.Practice;

public class MaximumInArray {
	public static void main(String[] args) {
		int arr[] = { 25, 57, 78, 97, 56 };
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}

		System.out.println("Largest number:" + max);
	}

}
