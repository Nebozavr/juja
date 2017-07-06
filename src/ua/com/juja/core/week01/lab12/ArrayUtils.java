package ua.com.juja.core.week01.lab12;

/**
 * Created by ybartoschuk on 05.07.2017.
 */
public class ArrayUtils {

    public static int[] lookFor(int[] array){

       int[] result = new int[2];
       int fisrtIndex = 0;
       int secondIndex = 0;
       int length = 0;
       int currentLength = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0){
                if (currentLength == 0){
                    fisrtIndex = i;
                }
                currentLength ++;
                secondIndex = i;
            } else {
                if (currentLength > length){
                    length = currentLength;

                    result[0] = fisrtIndex;
                    result[1] = secondIndex;
                }

                currentLength = 0;
            }
        }

        if (currentLength > length){
            length = currentLength;

            result[0] = fisrtIndex;
            result[1] = secondIndex;
        }

        if (length == 0){
            return new int[0];
        }


       return result;
    }


    public static void main(String[] args) {
        int[] test = lookFor(new int[]{0,1,1,1,0,1,1,1,1,1,0});

        for (int iter: test) {
            System.out.print(iter + " ");

        }

    }

}
