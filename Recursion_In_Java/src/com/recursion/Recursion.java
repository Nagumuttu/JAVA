package com.recursion;

public class Recursion {
	public static void printNumbers(int n, int step) {
		if(step>n){
			return;
		}
		System.out.println("numbers:"+step);
		step++;
		printNumbers(n,step);
	}
	public static void main(String[] args) {
		printNumbers(20,1);
	}


}
