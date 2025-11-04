package calculator;

import java.util.Scanner;

public class BasicCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter the first number");
		double num1 = sc.nextDouble();

		System.out.println("Eneter the second number");
		double num2= sc.nextDouble();
		 
		System.out.println("Choose operation: +, -, *, /");
		char op = sc.next().charAt(0);
		
		double result;
		switch(op) {
		case '+': result = num1 + num2; break;
		case '-': result = num1 - num2; break;
		case '*': result = num1 * num2; break;
		case '/': result = num2 != 0?num1/num2:Double.NaN; break;
		default:
			System.out.println("invalid operation!");
		return;
		
		}
		
		
		
		System.out.println("result = "+result);
		

		

	}
}
