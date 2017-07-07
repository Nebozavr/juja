package ua.com.juja.core.week02.lab14;

public class BubbleSorter {
    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int element = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = element;
                }
            }

        }
    }


}