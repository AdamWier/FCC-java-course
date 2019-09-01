package com.adamwier.javacourse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;

public class PorscheTest {

    @Test
    public void shouldCloneStringArray() {
        String[] array = {"one", "two", "three"};
        String[] copiedArray = array.clone();
        assertNotSame(array, copiedArray);

        System.out.println(copiedArray[0]);
    }

    @Test
    public void shouldClonePorsche(){
        Porsche porsche = new Porsche("Adam");
        Porsche petersPorsche = porsche.clone();
        assertNotSame(porsche, petersPorsche);
        petersPorsche.sellTo("Peter");
        assertEquals("Peter's Porsche", petersPorsche.asString());


    }
}
