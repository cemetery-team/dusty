package com.company;

import org.junit.Assert;

public class PersonTest {

    @org.junit.Test
    public void getName() {
        Person person = new Person("john");
        String per = person.getName();
        Assert.assertEquals("john", per);
    }
}