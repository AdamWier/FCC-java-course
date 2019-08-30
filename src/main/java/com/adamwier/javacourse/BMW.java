package com.adamwier.javacourse;

public class BMW implements Car, Loggable, Asset, Property {

    public void drive(){
        System.out.println("B driving");
    }

    public int value() {
        return 8000;
    }

    public String owner() {
        return "Marcus";
    }

    public String message(){
        return "I am Marcus's car.";
    }
}
