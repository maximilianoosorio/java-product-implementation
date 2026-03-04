package com.example;

public class Main {
    public static void main(String[] args) {

        Product product1 = new Product();
        product1.setId("P001");
        product1.setName("Laptop");
        product1.setPrice(1200.0);
        product1.setStock(28);

        Product product2 = new Product("P002", "Teclado", 350.0, 52);

        product2.setPrice(400.0);

        System.out.println("Product 1 Name: " + product1.getName());
        System.out.println("Product 2 Price: " + product2.getPrice());

        System.out.println("\nComplete Information:");
        System.out.println(product1);
        System.out.println(product2);

    }
}