package com.data_types;

import java.util.Arrays;

public class NonPrimitiviDataType {
	public static void main(String[] args) {
		
	//arrays
		
	int[] arr = {1,2,3,4};
	char[] arr1 = {'a','b','c'};
	System.out.println(arr[3]);
	System.out.println(Arrays.toString(arr));
	System.out.println(arr1);
	
	
	//string
	
	String str1 = "Hunter";
	System.out.println(str1);
	
	
	String str2 = new String("Hello World");
	System.out.println(str2);
}
}