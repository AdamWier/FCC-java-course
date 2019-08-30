package com.adamwier.javacourse.lesson17;

public abstract class Animal {

    public abstract void eat();

    protected void age(){
        //Visibility to any class in same package in addition to inheritence
        System.out.println("Animal is old");

    }
}
