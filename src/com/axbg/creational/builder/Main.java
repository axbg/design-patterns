package com.axbg.creational.builder;

public class Main {
    public static void main(String[] args) {

        System.out.println("Builder pattern");

        Product productOne = new Product.ProductBuilder("Book", 20).build();
        Product productTwo = new Product.ProductBuilder("TV", 250).
                setDescription("A Nice TV").setVolume(120)
                .build();

        System.out.println(productOne);
        System.out.println(productTwo);
    }
}
