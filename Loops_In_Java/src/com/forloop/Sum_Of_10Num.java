package com.forloop;

import java.util.Scanner;

public class Sum_Of_10Num {
   public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
//	   int j = sc.nextInt();
//	   for(int i = 1; i<=10; i++) {
//	   System.out.println(j+" x " +i+" = "+(j*i));
//	   }
//	
	   System.out.println("sum value");
	   int sum = 0;
	  for(int n=0; n<=10; n++) {
		  
		  //System.out.println(n);
		  sum=sum+n;
		  
	  }
	  System.out.println(sum);
	  
}
}
