package com.adamwier.javacourse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CarService {

    private final Logger log = LoggerFactory.getLogger(CarService.class);

/*    public void process(String input) {
        log.info("processing car: {}", input);
    }
    */
    public void process(String input) throws Exception {
        CarState carState = CarState.from(input);
    }

    public void drive() {
        BMW bmw = new BMW();
        bmw.message();
        Porsche porsche = new Porsche("Adam");
        Mercedes mercedes = new Mercedes();

        Car[] cars = {bmw, porsche, mercedes};
        for (Car car: cars){
            car.drive();
        }

        bmw.drive();
        porsche.drive();
        mercedes.drive();
    }
}
