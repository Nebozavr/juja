package ua.com.juja.core;

public class BubbleSort {

    public static void main(String[] args) {
        int[] testArray = new int[]{3, 2, 5, 6, 1, 9, 55};

        sort(testArray);

        for (int aTestArray : testArray) {
            System.out.print(aTestArray + ",");
        }
    }

    private static void sort(int[] array) {
        int element;
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    element = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = element;
                }
            }

        }
    }
}
