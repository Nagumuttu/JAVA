package com.Practice;

public class Copy1ArrayToAnother {
	public static void main(String[] args) {
		int arr1[] = {10,30,70,80,90};
		int arr2[] = new int[arr1.length];
		for (int i=0; i<arr2.length;i++){
			arr2[i] = arr1[i];
		}
		System.out.println("Copied Array");
		for(int i =0;i<arr2.length;i++) {
			System.out.println(arr2[i]);
		}

}}
