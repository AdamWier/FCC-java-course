package com.adamwier.javacourse;

public class Porsche implements Car, Cloneable {

    private String owner;

    public Porsche(String owner){
        this.owner = owner;
    }

    public void drive(){
        System.out.println("P driving");
    }

    @Override
    public void finalize(){
        // clean up IO Resources;
    }

    @Override
    public Porsche clone() {
        try {
            return (Porsche) super.clone();
        } catch(CloneNotSupportedException e){
            return null;
        }
    }

    public String asString() {
        return owner + "'s Porsche";
    }

    public void sellTo(String owner){
        this.owner = owner;
    }
}
