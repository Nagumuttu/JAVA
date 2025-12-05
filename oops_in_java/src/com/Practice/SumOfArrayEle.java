package com.Practice;

public class SumOfArrayEle {
	public static void main(String[] args) {
		int arr[] = { 25, 57, 78, 97, 56 };
		int sum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum = +arr[i];

		}

		System.out.println("Sum Of Elements:" + sum);
	}

}
