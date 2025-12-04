package loops_in_java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Fibbonoci {
	//function
	// access_modifier, datatype, method_name(arguments)
	public int add(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		//0, 1,1,2,3,5
		Scanner sc = new Scanner(System.in);
		//int n = Integer.parseInt(args[3]);
		Fibbonoci f = new Fibbonoci();
		
		//method calling
		// add(parameter)
		//int adding = f.add(9, 7);
		//System.out.println(f.add(8, 8));
		int n = sc.nextInt();
		
		///
		//collection
		Collections.sort(Arrays.asList(null));
		int a = 0;
		int b = 1;
		int j =0;
		while(j<n) {
			System.out.println(a);
			int c = a+b;
			a = b;
			b = c;
			j++;
		}
		System.out.println("after while loop");
		for(int i = 0;i<n;i++) {
			System.out.println(a);
			int c = a+b;
			a = b;
			b = c;
		
		}
		
	}
}
