package shoppingCart;

import java.util.ArrayList;
import java.util.Scanner;

public class Authentication {

    public static boolean login(Store selectedStore, Cart cart, Scanner scanner) {
        System.out.print("Enter ID: ");
        String userID = scanner.nextLine();

        System.out.print("Enter Password: ");
        String userPassword = scanner.nextLine();

        for (Customers c : selectedStore.customers) {
            if (c.id.equals(userID) && c.password.equals(userPassword)) {
                cart.items = new ArrayList<CartItem>();
                return true;
            }
        }

        System.out.println("Login failed.");
        return false;
    }
}
