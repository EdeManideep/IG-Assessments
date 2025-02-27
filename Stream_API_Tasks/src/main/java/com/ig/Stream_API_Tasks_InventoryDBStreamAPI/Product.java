package com.ig.Stream_API_Tasks_InventoryDBStreamAPI;

import java.time.LocalDate;

class Product {
    private Integer id;
    private String name;
    private String type; // e.g., dairy, pulses, spices, oils, snacks
    private Double qty;
    private Double price;
    private LocalDate expiryDate;

    // Constructor
    public Product(Integer id, String name, String type, Double qty, Double price, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.qty = qty;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    // Getters
    public Integer getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public Double getQty() { return qty; }
    public Double getPrice() { return price; }
    public LocalDate getExpiryDate() { return expiryDate; }

    // ToString method for better readability
    @Override
    public String toString() {
        return "Product{" +
               "id=" + id +
               ", name='" + name + '\'' +
               ", type='" + type + '\'' +
               ", qty=" + qty +
               ", price=" + price +
               ", expiryDate=" + expiryDate +
               '}';
    }
}
