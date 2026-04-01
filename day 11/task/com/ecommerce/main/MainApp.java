package com.ecommerce.main;
import java.util.*;
import com.ecommerce.model.Product;
import com.ecommerce.service.CarService;
import com.ecommerce.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products: ");
        int n = sc.nextInt();

        CarService cart = new CarService();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for product " + (i + 1));

            System.out.print("Enter ID: ");
            int id = sc.nextInt();

            System.out.print("Enter Name: ");
            String name = sc.next();

            System.out.print("Enter Price: ");
            int price = sc.nextInt();
            int finalPrice = DiscountUtil.applyDiscount(price);
            Product p = new Product(id, name, finalPrice);
            cart.addProduct(p);
        }

        System.out.println("\nCart Details:");
        cart.showCart();

        int totalAmount = cart.calculateTotal();
        System.out.println("Total amount: $" + totalAmount);
    }
}