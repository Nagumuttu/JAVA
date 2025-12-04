package com.funtion;

import java.util.Scanner;

public class FibonacciSeries {
	static  void printFibonacci(int n) {
		int first = 0, second = 1, next;
		System.out.println("Fibonacci series;");
		for(int i=1; i<=n; i++) {
			System.out.println(first+"");
			next = first+second;
			first = second;
			second = next;
			
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a number :");
		int n = sc.nextInt();
		printFibonacci(n);
		
		
	}
}
