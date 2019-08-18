package com.adamwier.javacourse;

import java.io.IOException;

public class CarSelector {

    public static void main(String[] arguments) throws Exception {
        CarService carService = new CarService();
        for(String argument : arguments){
/*            try {
                carService.process(argument);
            } catch(RuntimeException e) {
                System.err.println(e.getMessage());
            }
            */
            if(isValid(argument)){
                carService.process(argument);
            } else {
                System.err.println("Ignoring invalid argument: " + argument);
            }
        }
    }

    private static boolean isValid(String argument) {
        try {
            CarState carState = CarState.valueOf(argument);
            System.out.println("This line will not be printed if there's an exception");
        } catch (IllegalArgumentException e){
            return false;
        } finally {
            System.out.println("I am still running");
        }
        return true;

    }
}
