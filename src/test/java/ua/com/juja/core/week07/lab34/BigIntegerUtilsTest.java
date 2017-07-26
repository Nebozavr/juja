package ua.com.juja.core.week07.lab34;


import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class BigIntegerUtilsTest {

    @Test
    public void test1(){
        assertMethod(new BigInteger("2"), "10");

    }
    @Test
    public void test2(){

        assertMethod(new BigInteger("8"), "1000");
    }

    @Test
    public void test3(){

        assertMethod(new BigInteger("10"), "1010");
    }

    private static void assertMethod(BigInteger input, String expected) {
        String actual = BigIntegerUtils.toBitStr(input);
        assertEquals(expected, actual);

    }
}
