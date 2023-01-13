package com.masai;

public class Order {

	
	private int id;
	private String address;
	Product[] products;
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Product[] getProducts() {
		return products;
	}
	public void setProducts(Product[] products) {
		this.products = products;
	}
	
	public void showProduct() {
		
		System.out.println("id      : "+id);
		System.out.println("Address : "+address);
		for(Product product:products) {
			
			product.showProduct();
			System.out.println("---------------------------");
		}
		
	}
	
	
	
	
	
}
