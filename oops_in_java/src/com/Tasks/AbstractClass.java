package com.Tasks;
abstract class Payment{
	abstract void pay(double amount);
	void displayMessage() {
		System.out.println("Payment processing started.......");
	}
	
}
class CreditCardPayment extends Payment{
	void pay(double amount) {
		displayMessage();
		System.out.println("Paid "+amount +" Using credit card");
	}
	
	
}
class UPIPayment extends Payment{
	void pay (double amount) {
		displayMessage();
		System.out.println("paid "+amount+" using UPI");
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		Payment p = new CreditCardPayment();
		p.pay(5000);
		System.out.println("................");
		p=new UPIPayment();
		p.pay(5000);
		
	}

}
