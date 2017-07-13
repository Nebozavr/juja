package ua.com.juja.core.week02.lab16;

import ua.com.juja.core.week02.lab15.SelectionSorter;

import java.util.Arrays;
import java.util.Random;

public class Test1 {

    public static void main(String[] args) {
       // int[] array = new int[256 * 1024];
        int[] array = new int[10];
        Random rnd = new Random();
        for (int k = 0; k < array.length; k++) {
            array[k] = rnd.nextInt(10);
        }
        long t1 = System.nanoTime();

        System.out.println(Arrays.toString(array));
        InsertionSorter.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("A:" + (System.nanoTime() - t1) / 1000000);
    }
}
