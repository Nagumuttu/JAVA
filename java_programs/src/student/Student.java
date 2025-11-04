package student;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner  sc = new Scanner(System.in);
		
		System.out.println("Enter the Student name");
		String name = sc.nextLine();
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter gender(M/F/Others):");
		char gender = sc.nextLine().charAt(0);
		
		System.out.println("Enter Marks");
		double marks = sc.nextDouble();
		
	    System.out.println("Enter the address");
		String address = sc.nextLine();
		
		System.out.println("\n---Student---");
		
		System.out.println("Name :"+name);
		
		System.out.println("Age:"+age);
		
		System.out.println("gender:"+gender);
		
		System.out.println("marks:"+marks);
		
		System.out.println("address:"+address);
		
		
}
}
