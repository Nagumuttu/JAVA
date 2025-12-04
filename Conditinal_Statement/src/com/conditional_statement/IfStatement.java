package com.conditional_statement;

public class IfStatement {
	public static void main(String[] args) {
		int num = 10;
		if(num>10 && num <=20) {
			System.out.println("Number is Greater than 10 and less than or equals to 20 ");
		}else if(num>20 && num<=30) {
			System.out.println("Number is Greater than 20 and less than or equals to 30 ");
		}
		else {
			System.out.println("Number is not greater than 10 or greater then 30");
		}
	}

}
