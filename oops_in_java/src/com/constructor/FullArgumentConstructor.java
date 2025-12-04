package com.constructor;
class Book{
	public String name;
	public int pages;
	public int price;
	Book(String name,int pages,int price){
		this.name=name;
		this.pages=pages;
		this.price=price;
		
	} 
	public void display() {
		System.out.println("name;"+name);
		System.out.println("pages;"+pages);
		System.out.println("price;"+price);
	}

}

public class FullArgumentConstructor {
	public static void main(String[] args) {
		Book b1=new Book("rich dad poor dad",400,299);
		
		Book b2=new Book("stroy",100,99);
		
		b1.display();
		
		b2.display();
	}

}
