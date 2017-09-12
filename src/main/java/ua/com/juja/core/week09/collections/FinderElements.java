package ua.com.juja.core.week09.collections;

import java.util.Iterator;

public class FinderElements {
    public static Integer findElement(SinglyLinkedList<Integer> singlyLinkedList, int k) {
       int size = 0;
       int result = 0;

        Iterator<Integer> iterator = singlyLinkedList.iterator();
        while (iterator.hasNext()){
            iterator.next();
            size++;
        }

        int n = size - k - 1;

        if (!(k > 0 && k < size)){
            throw new IndexOutOfBoundsException();
        }else {
            Iterator<Integer> iterator1 = singlyLinkedList.iterator();
            while (iterator1.hasNext()){
                if (n == 0){
                    result = iterator1.next();
                }

                iterator1.next();
                n--;
            }
        }
            return result;
    }
}