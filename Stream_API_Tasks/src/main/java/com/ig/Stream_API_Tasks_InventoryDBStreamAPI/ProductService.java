package com.ig.Stream_API_Tasks_InventoryDBStreamAPI;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

class ProductService {

    // List the highest-priced product
    public Optional<Product> getHighestPricedProduct(List<Product> productList) {
        return productList.stream()
                          .max(Comparator.comparing(Product::getPrice));
    }

    // List the lowest-priced product
    public Optional<Product> getLowestPricedProduct(List<Product> productList) {
        return productList.stream()
                          .min(Comparator.comparing(Product::getPrice));
    }

    // List products that have already expired
    public List<Product> getExpiredProducts(List<Product> productList) {
        return productList.stream()
                          .filter(p -> p.getExpiryDate().isBefore(LocalDate.now()))
                          .collect(Collectors.toList());
    }

    // List product names that will expire in the next 10 days
    public List<String> getProductsExpiringSoon(List<Product> productList) {
        LocalDate today = LocalDate.now();
        LocalDate next10Days = today.plusDays(10);
        return productList.stream()
                          .filter(p -> p.getExpiryDate().isAfter(today) && p.getExpiryDate().isBefore(next10Days))
                          .map(Product::getName)
                          .collect(Collectors.toList());
    }

    // Count of products based on their types
    public Map<String, Long> getProductTypeCount(List<Product> productList) {
        return productList.stream()
                          .collect(Collectors.groupingBy(Product::getType, Collectors.counting()));
    }
    
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Milk", "Dairy", 1.0, 50.0, LocalDate.of(2025, 3, 15)),
            new Product(2, "Rice", "Pulses", 5.0, 250.0, LocalDate.of(2026, 1, 1)),
            new Product(3, "Chili Powder", "Spices", 0.5, 80.0, LocalDate.of(2024, 2, 20)),
            new Product(4, "Olive Oil", "Oils", 1.0, 500.0, LocalDate.of(2025, 8, 10)),
            new Product(5, "Chips", "Snacks", 0.2, 20.0, LocalDate.of(2024, 3, 5)),
            new Product(6, "Butter", "Dairy", 0.5, 200.0, LocalDate.of(2024, 2, 28))
        );

        ProductService productService = new ProductService();

        // Get highest priced product
        System.out.println("Highest Priced Product: " + productService.getHighestPricedProduct(products).orElse(null));

        // Get lowest priced product
        System.out.println("Lowest Priced Product: " + productService.getLowestPricedProduct(products).orElse(null));

        // Get expired products
        System.out.println("Expired Products: " + productService.getExpiredProducts(products));

        // Get products expiring in next 10 days
        System.out.println("Products Expiring Soon: " + productService.getProductsExpiringSoon(products));

        // Get count of product types
        System.out.println("Product Type Count: " + productService.getProductTypeCount(products));
    }
}
