package com.Practice;

public class CountEvenOddNumbers {
	public static void main(String[] args) {
		int arr[] = { 25, 57, 78, 97, 56 };
		int evenCount = 0;
		int oddCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] %2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			
		}
	
		System.out.println("Total count of even number:" + evenCount);
		System.out.println("Total count of odd number:" +oddCount);
	}
}



