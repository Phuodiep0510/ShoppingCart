package shoppingCart;

public class CartItem extends Product {

	int quantity;

	public CartItem() {
	}

	CartItem(String name, double price, int quantity) {
		super(name, price);
		this.quantity = quantity;
	}

	CartItem(Product product) {
		this.name = product.name;
		this.price = product.price;
	}
	public double getSubtotal() {
		return price * quantity;
	}
}