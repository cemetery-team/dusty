package test.java.com.network;

import main.java.com.network.Person;
import org.junit.Assert;

public class PersonTest {

    @org.junit.Test
    public void getName() {
        Person person = new Person("john");
        String per = person.getName();
        Assert.assertEquals("11john", per);
    }
}