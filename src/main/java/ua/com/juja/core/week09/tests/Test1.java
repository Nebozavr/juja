package ua.com.juja.core.week09.tests;

import ua.com.juja.core.week09.collections.SimpleArrayList;

import java.util.Iterator;

public class Test1 {
    public static void main(String[] args) {

        Integer[] expectedElements = {1, 2, 3, 4, 5, 6, 7};

        SimpleArrayList<Integer> simpleArrayList = new SimpleArrayList<>();

        for (int i = 0; i < expectedElements.length; i++) {
            simpleArrayList.add(expectedElements[i]);
        }

        //call and check
        Iterator<Integer> iterator = null;
        try {
            iterator = simpleArrayList.iterator();
        } catch (UnsupportedOperationException u) {
            throw new AssertionError("Iterator not implemented");
        }

        if (iterator == null)
            throw new AssertionError("Iterator must be no equals null");

        boolean isException = false;
        try {
            iterator.remove();
        } catch (IllegalStateException e) {
            isException = true;
        }

        if (!isException)
            throw new AssertionError("Expected throw IllegalStateException form iterator.remove()");

        System.out.print("OK");
    }
}