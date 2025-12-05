package com.Tasks;
class Cars{
	Cars(){
		System.out.println("Basic Car");
	}
	Cars(String model){
		this();
		System.out.println("Model:"+ model);
	}
	Cars(String model1,int price){
		this(model1);
			System.out.println("Price:"+price);
			
		}
		
	}

public class ConstructorChaining {
	public static void main(String[] args) {
		Cars c = new Cars("Honda City",120000);
	}

}