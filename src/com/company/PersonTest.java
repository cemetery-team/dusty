package com.company;

import static org.junit.Assert.*;

public class PersonTest {

    @org.junit.Test
    public void getName() {
        Person person = new Person();
        String per = person.getName();
        assertEquals("john", per);
    }
}