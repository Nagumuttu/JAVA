package com.while_loop;
import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enetr a number:");
		int num = sc.nextInt();
		
		int i = 1;
		long fact = 1;
		
		while(i<=num) {
		fact = fact*i;
		i++;
	}
		System.out.println("Factorial of "+num+" is:"+fact);
		sc.close();
	}

}
