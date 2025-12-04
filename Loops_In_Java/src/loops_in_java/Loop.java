package loops_in_java;

import java.util.Scanner;

public class Loop {
	
	/*
	 * for loop
	 * ---------
	 * for(initialization;condition;inc/dec)
	 * for(int i =1; i<10;i++)
	 * 
	 * while
	 * ----------------
	 * while(condition){
	 *		code
	 *		inc/dec
	 *	}
	 *
		do-while
	 *-----------
	 *	do{
	 *		//code
	 *		//inc/dec
	 *	}while(condition)
	 *
	 *	for(int a:arr){
	 *		syso(a)
	 *	}
	 //
	 * */
	public static void main(String[] args) {
		System.out.println("enter array size: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		for(int i = 0;i<n;i++) {
		System.out.println("the array elements at index"+(i+1)+" is: "+a[i]);
		}
		int n1 = n;
//		while(n >1 ) {
//			System.out.println(n);
//			n--;
//		}
//		int sum = 0;
//
////		do{
////			sum += n1;
////			System.out.println(n1);
////			//sum = sum + n;
////			n1--;
////		}while(n1>0);
////		System.out.println(sum);
//		
//		int b = 10;
//		do {
//			System.out.println(b);
//		}while(b>10);
//		
//		while(b>10) {
//			System.out.println(b);
//		}
		
		for(int ele : a) {
		System.out.println("using for each");
			System.out.println(ele);
		}
	}
	
}
