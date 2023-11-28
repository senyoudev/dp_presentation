package org.example;

class ProductFactory {
    public static Product createProduct(String name, double price, String category) {
        return new Product(name, price, category);
    }
}