package com.axbg.creational.builder;

public class Product {

    private String name;
    private int price;

    private String description;
    private int volume;

    Product(ProductBuilder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.description = builder.description;
        this.volume = builder.volume;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", volume=" + volume +
                '}';
    }

    static class ProductBuilder {

        private String name;
        private int price;

        private String description;
        private int volume;

        ProductBuilder(String name, int price) {
            this.name = name;
            this.price = price;
        }

        ProductBuilder setDescription(String description) {
            this.description = description;
            return this;
        }

        ProductBuilder setVolume(int volume) {
            this.volume = volume;
            return this;
        }

        Product build() {
            return new Product(this);
        }
    }
}
