package com.constructor;

class District {
	public String name;
	public int num_district;
	
//DEFAULT CONSTRUCTOR
	public District() {

	}
//NO ARGUMENT CONSTRUCTOR
	
	public District(boolean noArg) {
		System.out.println("no argument constructor");
		name = "hassan";
		num_district = 13;
	}
//FULL ARGUMENT CONSTRUCTOR
	
	public District(String name, int num_district) {
		System.out.println("full argument constructor");
		this.name = name;
		this.num_district = num_district;
	}

	public void display() {
		System.out.println("name:" + this.name);
		System.out.println("num_district:" +this.num_district);
	}
}

public class MultipleConstInSingleConst {
	public static void main(String[] args) {
		District d1 = new District(true);
		d1.display();
		District d2 = new District("bengaluru",7);
		d2.display();

	}

}
