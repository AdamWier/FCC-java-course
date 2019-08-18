package com.adamwier.javacourse.lesson2;

import com.adamwier.javacourse.lesson10.LoggingLevel;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    static final String[] MY_STATE_VALUES = {"PENDING", "PROCESSING", "PROCESSED"};
    public String[] states(){
        //noinspection Since15
        return Arrays.copyOf(MY_STATE_VALUES, MY_STATE_VALUES.length);
    }

    @Test
    public void shouldReturnHelloWorld(){
        Person marcus = new Person();
        assertEquals("Hello World", marcus.helloWorld());
    }

    @Test
    public void shouldReturnHelloMarcus(){
        Person person = new Person();
        assertEquals("Hello Marcus", person.hello("Marcus"));
    }

    @Test
    public void shouldReturnNumberOfPersons(){
        Person person1;

        int i = 0;

        while( i < 10){
            person1 = new Person();
            i++;
        }
        /*
        do {
        } while (...)
         */
        /*for(int i = 0; i < 10; i++){
            person1 = new Person();
        }*/
        assertEquals(11, Person.numberOfPersons());
    }

    @Test
    public void demonstrateArrays(){
        Person[] persons = new Person[4];
/*      Person myPerson = new Person();
        persons[0] = new Person();
        persons[1] = new Person();
        persons[2] = new Person();
        persons[3] = new Person();
        persons[3] = myPerson;*/
        for (int i = 0; i < persons.length; i++){
            persons[i] = new Person();
        }

        for (Person person: persons){
            person.helloWorld();
        }

        Person[] person2 = {};

        /*
        Final keyword is like const
         */

        LoggingLevel state = LoggingLevel.PENDING;

        switch(state){
            case PENDING:
                //call method
                break;
        }

    }



}
