package com.adamwier.javacourse;

import org.junit.jupiter.api.Test;

public class CarServiceTest {

    @Test
    public void shouldDemonstrateLogging() throws Exception {
        CarService carService = new CarService();
        // carService.process("BMW");
        carService.drive();
    }

}
