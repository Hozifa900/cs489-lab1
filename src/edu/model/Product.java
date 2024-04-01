package edu.miu.cs.cs489appsd.lab1a.productmgmtapp.model;

import java.text.DecimalFormat;
import java.time.LocalDate;

public class Product {
    private Long productId;
    private String name;
    private LocalDate dateSupplied;
    private Integer quantityInStock;
    private Double unitPrice;

    public Product(Long productId, String name, LocalDate dateSupplied, Integer quantityInStock, Double unitPrice) {
        this.productId = productId;
        this.name = name;
        this.dateSupplied = dateSupplied;
        this.quantityInStock = quantityInStock;
        this.unitPrice = unitPrice;
    }

    public Product(String name) {
        this(null, name, null, null, null);
    }

    public Product() {
        this(null, null, null, null, null);
    }

    // Getters and setters
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateSupplied() {
        return dateSupplied;
    }

    public void setDateSupplied(LocalDate dateSupplied) {
        this.dateSupplied = dateSupplied;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Method to format unit price to US dollar currency
    public String getFormattedUnitPrice() {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return "$" + df.format(unitPrice);
    }
}