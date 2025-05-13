package shoppingCart;

import java.util.Scanner;

public class Main {

    static Cart cart;
    static Scanner scan = new Scanner(System.in);
    static Store selectedStore;

    public static void main(String[] args) {
        // Ask user to choose a store
        System.out.println("Select a store: ");
        for (int i = 0; i < Database.stores.size(); i++) {
            System.out.println((i + 1) + ". " + Database.stores.get(i).storeName);
        }

        int storeChoice = scan.nextInt();
        scan.nextLine(); // consume newline
        selectedStore = Database.stores.get(storeChoice - 1);

        // Initialize cart
        cart = new Cart();

        // Login loop
        boolean isLoggedin;
        do {
            isLoggedin = Authentication.login(selectedStore, cart, scan);
        } while (!isLoggedin);

        // Shopping loop
        while (true) {
            CartHandler.handleProductSelection(selectedStore, cart, scan);
        }
    }
}
