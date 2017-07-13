package ua.com.juja.core.week02.lab16;

import java.util.Arrays;

public class InsertionSorter {
    public static void sort(int[] arr) {
        for (int k = 1; k < arr.length; k++) {
            int newElement = arr[k];
            int minLocation = Arrays.binarySearch(arr, 0, k, newElement);
            if (minLocation < 0) {
                minLocation = -(minLocation) - 1;
            }
            System.arraycopy(arr, minLocation, arr, minLocation + 1, k - minLocation);
            arr[minLocation] = newElement;

        }
    }
}