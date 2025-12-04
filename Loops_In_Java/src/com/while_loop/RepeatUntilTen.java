package com.while_loop;
import java.util.Scanner;

public class RepeatUntilTen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		while (number != 10) {
			System.out.println("Enetr a number:");
			number = sc.nextInt();
			
			if (number != 10) {
				System.out.println("You enetred "+ number +". try again!");
			}
		}
		System.out.println("you entered 10! loop ended. ");
		sc.close();
			
		}
	}


