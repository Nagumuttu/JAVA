package com.recursion;

import java.util.Scanner;

public class SumOfnNaturalNumbers {
	static int sum(int n) {
		if(n==1)
		return 1;
		else
			return n+ sum(n-1);
		
			}
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=scanner.nextInt();
		
		int result=sum(num);
		System.out.println("sum of first" + num + "natural number is:"+result);
		scanner.close();
		
}
}
