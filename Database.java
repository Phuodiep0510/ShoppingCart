package shoppingCart;

import java.util.ArrayList;

public class Database {

	static final ArrayList<Customers> customersDB = new ArrayList<Customers>();
	static final ArrayList<Product> productsDB = new ArrayList<Product>();
	static final ArrayList<Store> stores = new ArrayList<>();
	static {
		Store store1 = new Store("Store 1");
        store1.customers.add(new Customers("s1User1", "s1Pw1"));
        store1.customers.add(new Customers("s1User2", "s1Pw2"));
        store1.products.add(new Product("Coffee", 5));
        store1.products.add(new Product("Milk", 3));
		
		
        Store store2 = new Store("Store 2");
        store2.customers.add(new Customers("s2User1", "s2Pw1"));
        store2.customers.add(new Customers("s2User2", "s2Pw2"));
        store2.products.add(new Product("Bread", 2));
        store2.products.add(new Product("Eggs", 8));
        
        stores.add(store1);
        stores.add(store2);
	}
}

