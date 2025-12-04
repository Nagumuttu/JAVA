package com.funtion;

import java.util.Scanner;

public class SumOfnNaturalNumbers {
	static int sumOfNumbers (int n) {
		int  sum=0;
		for(int i=1; i<=n; i++) {
			sum=sum+i;
		}
		return sum;
			}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		
		int result=sumOfNumbers(num);
		System.out.println("sum of first"+num+"natural number is:"+result);
		scanner.close();
		
	}
}
