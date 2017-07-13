package ua.com.juja.core.week02;

import java.util.Arrays;

public class Quiz08 {

    public static void main(String[] args) {

        int[] array = new int[]{7, 2, -3, 4, 5, 3};

        System.out.println(Arrays.toString(array));

        fun(array);

        System.out.println(Arrays.toString(array));


    }


    private static void fun(int[] data) {
        for (int k = 0; k < data.length - 1; k++) {
            if (data[k] < data[k + 1]) {
                swap(data, k, k + 1);
            }
        }
    }


    private static void swap(int[] array, int fstElement, int sndElement) {
        int temp = array[fstElement];
        array[fstElement] = array[sndElement];
        array[sndElement] = temp;

    }


}
