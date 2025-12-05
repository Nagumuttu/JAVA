package com.Practice;

public class MinimumInArray {
	public static void main(String[] args) {
		int arr[] = { 25, 57, 78, 97, 56 };
		int min = arr[0];
		for (int i = 1; i > arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		System.out.println("Smallest number:" + min);
	}


}
