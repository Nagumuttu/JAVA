package com.class_object;

public class Company {
	public String company_name = "Toyata";
	public int employees = 700;
	
	 public void working() { 
		System.out.println(company_name+ " employees are working ");
	}
	 public static void main(String[] args) {
		Company c1 = new Company();
		System.out.println(c1);
		System.out.println(c1.company_name);
		System.out.println(c1.employees);
		c1.working();
		
	}

}
