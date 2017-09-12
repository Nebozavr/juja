package ua.com.juja.core.week09.tests.Linked;

import ua.com.juja.core.week09.collections.SimpleLinkedList;

public class Test2 {
    public static void main(String[] args) {
        Integer[] testElement  = {1,2,3,4,5,6,7,8};
        //first array list
        SimpleLinkedList<Integer> firstSimpleLinkedList = new SimpleLinkedList<>();
        for (int i = 0; i <testElement.length ; i++) {
            firstSimpleLinkedList.add(testElement[i]);
        }

        //second array list
        SimpleLinkedList<Integer> secondSimpleLinkedList = new SimpleLinkedList<>();

        for (int i = 0; i <testElement.length ; i++) {
            secondSimpleLinkedList.add(testElement[i]);
        }


        //check
        if (!firstSimpleLinkedList.equals(secondSimpleLinkedList))
            throw new AssertionError("Two simpleLinkedList with identical type and with identical elements should be equals");


        System.out.print("OK");
    }
}
