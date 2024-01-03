package demo;

import demo.Hello;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @Test
    public void testHello() {
        Hello hello = new Hello();

        String resultat = hello.sayHello();

        assertEquals("Hello", resultat, "Les deux messages doivent être identiques");

    }

}