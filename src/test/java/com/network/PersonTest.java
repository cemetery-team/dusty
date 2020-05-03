package test.java.com.network;

import main.java.com.network.Person;
import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void getName() {
        Person person = new Person("john");
        String per = person.getName();
        Assert.assertEquals("john", per);
    }
}