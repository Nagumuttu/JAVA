package java_learning;

import java.util.Arrays;

public class Datatypes {
	public static void main(String[] args) {
		//primitive data types
		byte age = 110;
		System.out.println("your age is:" + age);
		
		short salary = 1000;
			System.out.println("the salary amt is:" +salary);
			
		int myNum = 5;
		System.out.println("whole number :" + myNum);
		
		long longdistance = 12;
		System.out.println("distance of the work place:" +longdistance);
		
		float Floatvalue = 20.20f;
		System.out.println("the float value is:" +Floatvalue);
		
		double value = 23.58;
		System.out.println("double value is:" +value);
		
		char alphabet = 'a';
		System.out.println("the above alphbet is:" +alphabet);
		
		boolean write = true;
		System.out.println("sentence is :" +write);
		
		
		//non primitive data types
		int[] arr = {3,5,7,1};
		char[] arr2 = {'a','c','e'};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(arr2);
		
		
		//string litral
		
		String str = "Java";
				System.out.println(str);
		String str2 = new String("Full stack");
				System.out.println(str2);
		
		
		
	
	}

}
