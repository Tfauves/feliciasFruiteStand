package com.careerDevs;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        List<Product> myProduce = new ArrayList<>();

        myProduce.add(new Fruit("fruit", "apple", 0.49, true, "red", false));
        myProduce.add(new Fruit("fruit", "peach", 0.58, false, "peach", true));
        myProduce.add(new Fruit("fruit", "lime", 0.32, true, "green", false));

        myProduce.add(new Meat("meat", "steak tips", 3.29, true, true));
        myProduce.add(new Meat("meat", "chicken wings", 2.49, false, false));
        myProduce.add(new Meat("meat", "ground beef", 1.89, true, false));



        displayProducts(myProduce);

        displayProductByType(myProduce, "fruit");

        displayProductByIndex(myProduce, 5);

    }

    public static void displayProducts(List<Product> productList) {

        for (Product product : productList) {
            System.out.println(product);
        }
    }

    public static void displayProductByType(List<Product> productList, String type) {

        for (Product product : productList) {
            if (product.type.equals(type)) {
                System.out.println(product);
            }
        }
    }

    public static void displayProductByIndex(List<Product> productList, int i) {

        System.out.println(String.valueOf(productList.get(i).name));
    }






}
