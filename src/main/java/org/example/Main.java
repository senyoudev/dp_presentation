package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Singleton Pattern
        ConfigurationManager configManager = ConfigurationManager.getInstance();
        configManager.setApiKey("your_api_key");

        // Observer Pattern
        Order order = new Order();
        Customer customer1 = new Customer("John");
        Customer customer2 = new Customer("Alice");
        order.addObserver(customer1);
        order.addObserver(customer2);

        // Strategy Pattern
        PaymentStrategy creditCardPayment = new CreditPayment();
        PaymentStrategy payPalPayment = new PaypalPayment();

        OrderPaymentContext creditCardContext = new OrderPaymentContext(creditCardPayment);
        OrderPaymentContext payPalContext = new OrderPaymentContext(payPalPayment);

        // Factory Pattern (ProductFactory)
        Product electronics = ProductFactory.createProduct("Smartphone", 599.99, "electronics");
        Product clothing = ProductFactory.createProduct("T-Shirt", 19.99, "clothing");
        Product book = ProductFactory.createProduct("Java Programming Book", 29.99, "books");

        // Simulate order processing with different products
        order.updateStatus(OrderStatus.PROCESSING);

        // Simulate payment using different strategies
        creditCardContext.processPayment(electronics.getPrice());
        payPalContext.processPayment(clothing.getPrice());

        // Retrieve and display API key from configuration
        String apiKey = configManager.getApiKey();
        System.out.println("API Key: " + apiKey);

        // Display details of purchased products
        List<Product> purchasedProducts = new ArrayList<>();
        purchasedProducts.add(electronics);
        purchasedProducts.add(clothing);
        purchasedProducts.add(book);

        System.out.println("Purchased Products:");
        for (Product product : purchasedProducts) {
            System.out.println(product.getName() + " - $" + product.getPrice() + " - Category: " + product.getCategory());
        }
    }
}