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
}
