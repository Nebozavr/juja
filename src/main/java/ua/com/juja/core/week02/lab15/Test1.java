package ua.com.juja.core.week02.lab15;

import ua.com.juja.core.week02.lab14.BubbleSorter;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        int[] array = new int[]{2, 6, -8, 3, 1, 42, 30, -9};

       /* Arrays.sort(array);
        System.out.println(Arrays.toString(array));*/

        SelectionSorter.sort(array);
        System.out.println(Arrays.toString(array));

        int k = Arrays.binarySearch(array, -8);
        System.out.println(k);

        /*System.out.println(Arrays.toString(array));

        SelectionSorter.sort(array);

        System.out.println(Arrays.toString(array));

        int k = Arrays.binarySearch(array, 2);
        System.out.println(k);*/
    }
}
