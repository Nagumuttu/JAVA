package com.Abstraction;
interface Tv{
	public static final String name = "hello";
	String name1="hello";
	void TurnOn();
	void TurnOff();
}
class TvRemote implements Tv{

	public void TurnOn() {
		System.out.println("turn on");
	}
	public void TurnOff(){
		System.out.println("turn Off");
		
	}
	}

public class Abstraction2 {
	public static void main(String[] args) {
	TvRemote tv = new TvRemote();
	tv.TurnOff();
	tv.TurnOn();
	System.out.println(Tv.name);
}

}
