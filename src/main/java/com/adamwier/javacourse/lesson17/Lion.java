package com.adamwier.javacourse.lesson17;

import com.adamwier.javacourse.Loggable;

public class Lion extends Animal implements Loggable {

    public void eat(){
        System.out.println("Lion is eating");
    }

    public String message(){
        return "RAWR";
    }
}
