package com.adamwier.javacourse;

import org.junit.jupiter.api.Test;;

public class CarSelectorTest {
    @Test
    public void shouldCallMain() throws Exception {
        String[] arguments = {"BMW", "Porsche"};
        CarSelector.main(arguments);
    }
}
