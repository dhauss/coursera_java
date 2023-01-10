package com.javaoo.store;

public class Item {
	public Item() {};
	
	public Item(String title, double price, int quantity) {
		setTitle(title);
		setPrice(price);
		setQuantity(quantity);
	}

	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	
	private double price;
	private int quantity;
	private String title;
}

