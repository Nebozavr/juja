package ua.com.juja.core.week02.lab15;

public class SelectionSorter {
    public static void sort(int[] arr) {
        int min;
        int findIndex;

        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            min = arr[barrier];
            findIndex = barrier;
            for (int index = barrier + 1; index < arr.length; index++)
                if (min > arr[index]) {
                    min = arr[index];
                    findIndex = index;
                }
            arr[findIndex] = arr[barrier];
            arr[barrier] = min;
        }
    }
}