package shoppingCart;

import java.util.Scanner;

public class CartHandler {

    public static void handleProductSelection(Store store, Cart cart, Scanner scanner) {
        showProducts(store);

        System.out.print("Enter Product Number (0 to finish): ");
        int productNumber = scanner.nextInt();
        scanner.nextLine();

        if (productNumber == 0) return;

        if (productNumber < 1 || productNumber > store.products.size()) {
            System.out.println("Invalid product number. Try again.");
            return;
        }

        Product selectedProduct = store.products.get(productNumber - 1);

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        if (quantity <= 0) {
            System.out.println("Quantity must be at least 1.");
            return;
        }

        CartItem item = new CartItem(selectedProduct.name, selectedProduct.price, quantity);
        cart.items.add(item);
        printCart(cart);
    }

    private static void showProducts(Store store) {
        System.out.println("\n--- Products ---");
        for (int i = 0; i < store.products.size(); i++) {
            Product p = store.products.get(i);
            System.out.println((i + 1) + ". " + p.name + " : " + p.price + " AUD");
        }
    }

    private static void printCart(Cart cart) {
        System.out.println("\nYour Cart:");
        double total = 0;
        for (CartItem item : cart.items) {
            double subtotal = item.getSubtotal();
            System.out.println(item.name + " x " + item.quantity + " = " + subtotal + " AUD");
            total += subtotal;
        }
        System.out.println("Total: " + total + " AUD\n");
    }
}
