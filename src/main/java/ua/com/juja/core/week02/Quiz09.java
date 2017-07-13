package ua.com.juja.core.week02;

import java.util.Arrays;

public class Quiz09 {

    public static void main(String[] args) {

        int[] array = new int[]{7, 2, -3, 4, 5, 3};

        System.out.println(Arrays.toString(array));

        f(array);

        System.out.println(Arrays.toString(array));


    }


    private static void f(int[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                int tmp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = tmp;
            }
        }
    }

}
