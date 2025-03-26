package org.tnsif.accenture.c2c.java;

class Product{
	double price;
	Product(double price){
		this.price=price;
	}
	double calculateDiscount()
	{
		return this.price*0.10;
	}
	double calculateFinalPrice()
	{
		return this.price-this.calculateDiscount();
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		Product p = new Product(400.0);
		System.out.println("Final Price="+p.calculateFinalPrice());
		
	}

}
