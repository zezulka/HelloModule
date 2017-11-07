package com.redhat.foo.bar;

public interface Car {
    Color getColor();
    String getBrand();
    int getPrice();
    default void printInfo() {
        System.out.println(getColor() + " car '" + getBrand() + "', " + getPrice() + "CZK");
    }
}
