package com.Tasks;
class Employee{
	int Salary;
	Employee( int salary){
	 this.Salary = salary;
}
void display() {
	System.out.println("Salary:"+Salary);
}}
public class ThisKey {
	 public static void main(String[] args) {
	        Employee emp = new Employee(50000);
	        emp.display();
	    }

}
