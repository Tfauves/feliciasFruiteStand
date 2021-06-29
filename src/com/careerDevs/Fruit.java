package com.careerDevs;

public class Fruit extends Product{

    public String color;
    public boolean isLocal;

    public Fruit(String type, String name, double pricePerPound, boolean isInStock, String color, boolean isLocal) {

        super(type, name, pricePerPound, isInStock);
        this.color = color;
        this.isLocal = isLocal;
    }

    public String toString() {

        return String.format("{type: %s, name: %s, pricePerPound: %s, isInStock: %s, color: %s, isLocal: %s}", type,
                name, pricePerPound, isInStock, color, isLocal);
    }
}
