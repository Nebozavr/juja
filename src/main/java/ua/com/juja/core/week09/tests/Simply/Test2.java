package ua.com.juja.core.week09.tests.Simply;

import ua.com.juja.core.week09.collections.FinderElements;
import ua.com.juja.core.week09.collections.SinglyLinkedList;

public class Test2 {
    public static void main(String[] args) {

        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.add(2);

        Integer actualElement = null;

        try {
            actualElement = FinderElements.findElement(list, 4);
            if (actualElement == null)
                throw new AssertionError("result findElement()  is not null");
        } catch (IndexOutOfBoundsException e) {
            // expected behaviour
        }

        try {
            actualElement = FinderElements.findElement(list, -4);
            if (actualElement == null)
                throw new AssertionError("result findElement()  is not null");
        } catch (IndexOutOfBoundsException e) {
            // expected behaviour
        }

        if (actualElement != null)
            throw new AssertionError("list is empty and expected ArrayIndexOutOfBoundsException  but found" + actualElement.toString());

        System.out.print("OK");
    }
}