package com.adamwier.javacourse;

import org.junit.jupiter.api.Test;
import java.util.*;
import java.util.ArrayList;

public class ArrayListTest {

    private final int INITAL_CAPACITY = 5;

    @Test
    public void shouldDemonstrateArrayList() {
        Collection<String> elements = new ArrayList<>(INITAL_CAPACITY);
        elements.add("A");
        elements.add("B");
        elements.add("A");
        elements.add("C");
        elements.add("E");
        elements.add("E");

        elements.remove("A");

        System.out.println(elements.size());

        for(String str: elements){
            System.out.println(str);
        }
        System.out.println(elements);
    }
}
