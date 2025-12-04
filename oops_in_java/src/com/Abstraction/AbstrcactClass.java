package com.Abstraction;
abstract class TV{
	abstract void turnOn();
	abstract void turnOff();	
}
 class TVRemote extends TV{
	 void turnOn() {
		 System.out.println("Tv is Turning on");
	}
	 void turnOff() {
		 System.out.println("Tv is Turning on");
	 }
}

public class AbstrcactClass {
	public static void main(String[] args) {
		TVRemote tr = new TVRemote();
		tr.turnOff();
		tr.turnOn();
	}

}
