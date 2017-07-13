package ua.com.juja.core.week02.lab14;

import java.util.Arrays;

public class Test1 {

    public static void main(String[] args) {
        int[] array = new int[]{2, 6, -8, 3, 1, 42, 30, -9};

        System.out.println(Arrays.toString(array));

        BubbleSorter.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
