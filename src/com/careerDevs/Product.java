package com.careerDevs;

public class Product {

    public String type;
    public String name;
    public double pricePerPound;
    boolean isInStock;

    public Product(String type, String name, double pricePerPound, boolean isInStock) {
        this.type =type;
        this.name = name;
        this.pricePerPound = pricePerPound;
        this.isInStock = isInStock;
    }
}
