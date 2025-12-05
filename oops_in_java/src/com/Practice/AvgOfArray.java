package com.Practice;

public class AvgOfArray {
	public static void main(String[] args) {
		int arr[] = { 25, 57, 78, 97, 56 };
		int sum = arr[0];
		for (int i = 0; i < arr.length; i++) {
			sum+=arr[i];
			
		}
         double avg = (double)sum/arr.length;
		System.out.println("Average:" + avg);
	}


}
