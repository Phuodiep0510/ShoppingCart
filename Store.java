package shoppingCart;

import java.util.ArrayList;

public class Store {

	String storeName;
	ArrayList<Product> products;
	ArrayList<Customers> customers;
	
	public Store(String storeName) {
		this.storeName = storeName;
		this.customers = new ArrayList<>();
		this.products = new ArrayList<>();
	}
}
