package ua.com.juja.core.week07.lab35;


import org.junit.Test;
import ua.com.juja.core.week07.lab34.BigIntegerUtils;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class PloyUtilsTest {

    @Test
    public void test1(){
        BigInteger[] input = new BigInteger[]{new BigInteger("2"), new BigInteger("0"), new BigInteger("-3"), new BigInteger("0")};
        assertMethod(input, new BigInteger("100"), "1999700");

    }
    @Test
    public void test2(){
        BigInteger[] input = new BigInteger[]{new BigInteger("1"), new BigInteger("2"), new BigInteger("3"), new BigInteger("4"), new BigInteger("5")};
        assertMethod(input, new BigInteger("10"), "12345");

    }

    @Test
    public void test3(){
        BigInteger[] input = new BigInteger[]{new BigInteger("0"), new BigInteger("0"), new BigInteger("3"), new BigInteger("5")};
        assertMethod(input, new BigInteger("10"), "35");
    }

    private static void assertMethod(BigInteger[] input, BigInteger arg, String expected) {
        String actual = PolyUtils.eval(input, arg).toString();
        assertEquals(expected, actual);

    }
}
