package com.adamwier.javacourse;

public class Porsche implements Car {

    public void drive(){
        System.out.println("P driving");
    }

    @Override
    public void finalize(){
        // clean up IO Resources;
    }
}
