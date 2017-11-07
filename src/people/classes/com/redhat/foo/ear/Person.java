package com.redhat.foo.ear;

import com.redhat.foo.bar.Car;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final String name;
    private Gender gender; // Even Netbeans say that gender can be final!
    private final List<Car> cars;
    
    public Person(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
        this.cars = new ArrayList<>();
    }
    
    public Gender getGender() {
        return gender;
    }
    
    public String getName() {
        return name;
    }
    
    public void addCar(Car car) {
        cars.add(car);
    }
}
