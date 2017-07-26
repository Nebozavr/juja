package ua.com.juja.core;

import java.util.Arrays;

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

        Main test = new Main(3,4,5,6,7);

        System.out.println(test.toString());


    }
}
