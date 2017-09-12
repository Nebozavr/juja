package ua.com.juja.core.week09.tests.Array;

import ua.com.juja.core.week09.collections.SimpleArrayList;

public class Test3 {
    public static void main(String[] args) {
        String expectedPrintString = "[]";

        SimpleArrayList<Integer> simpleArrayList = new SimpleArrayList<>();

        //call

        String actualPrintString = simpleArrayList.toString();

        //check
        if (!expectedPrintString.equals(actualPrintString))
            throw new AssertionError("Should be printed " + expectedPrintString + " but printed " + actualPrintString);

        System.out.print("OK");
    }
}