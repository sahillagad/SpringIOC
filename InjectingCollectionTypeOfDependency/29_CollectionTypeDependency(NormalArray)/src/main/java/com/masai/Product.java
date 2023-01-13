package com.masai;

public class Product {

	private int id;
	private String name;
	private double price;

	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void showProduct() {
		System.out.println("ID    : "+id);
		System.out.println("Name  : "+name);
		System.out.println("Price : "+price);
	}
	
	
	
	
}
