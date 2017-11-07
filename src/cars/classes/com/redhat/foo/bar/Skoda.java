package com.redhat.foo.bar;

public class Skoda implements Car {

    private final Color color;
    private final int price;
    
    public Skoda(Color color, int price) {
        this.price = price;
        this.color = color;
    }
    
    @Override
    public Color getColor() {
        return color;
    }

    @Override
    public String getBrand() {
        return "Škoda auto";
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void printInfo() {
        Car.super.printInfo();
        System.out.println("Simply clever.");
    }
    
}
