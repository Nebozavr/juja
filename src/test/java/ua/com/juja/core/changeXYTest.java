package ua.com.juja.core;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class changeXYTest {

    @Test
    public void test1(){
        assertMethod("x", "y");

    }
    @Test
    public void test2(){

        assertMethod("aadx", "aady");
    }

    @Test
    public void test3(){

        assertMethod("xy", "yy");
    }

    private static void assertMethod(String input, String expected) {
        String actual = changeXY.change(input);
        assertEquals(expected, actual);

    }
}
