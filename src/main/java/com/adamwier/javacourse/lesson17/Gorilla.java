package com.adamwier.javacourse.lesson17;

public class Gorilla extends Animal {

    public void eat(){
        System.out.println("Gorilla is eating");
    }

    public void age(){
        System.out.println("The gorilla is ancient");
    }

    //Static doesn't allow inheritance but can be called on the class itself
}
