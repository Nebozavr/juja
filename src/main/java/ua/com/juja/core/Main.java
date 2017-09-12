package ua.com.juja.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    int[] array;

    public Main(int... array){
        this.array = array;
    }



    public String toString(){
        String result = Arrays.toString(array);
        return result;
    }

    public static void main(String[] args) {

        StringBuilder test = new StringBuilder();

        for (int i = 0; i < 10; i++) {
            test.append(i).append(i+1);
        }

        System.out.println(test);
        System.out.println(test.toString());
       // LinkedList

    }
}
