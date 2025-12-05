package com.Practice;

public class SecondLargestArray {
	public static void main(String[] args) {
		int[]arr= {10,20,30,70,50};
		int largest = Integer.MIN_VALUE;
		int Secondlargest = Integer.MIN_VALUE;
		for(int num : arr) {
			if (num > largest) {
				Secondlargest = largest;
				largest = num;
				
			}else if(num > Secondlargest && num != largest) {
				Secondlargest = num;
			}
		}
		System.out.println("largest Number:"+largest);
		System.out.println("Second largest Number:"+Secondlargest);
	}

}
