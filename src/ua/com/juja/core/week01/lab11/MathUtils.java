package ua.com.juja.core.week01.lab11;

/**
 * Created by ybartoschuk on 04.07.2017.
 */
public class MathUtils {

    public static int lookFor(int max) {

       int k = 0;
       int value = 1;
       int middle = max / 2;

        for (int i = middle; i > 0 ; i--) {
                if ( i * i < max){
                    value = i;
                    i = 0;
                }
        }


       for ( int a = 1; a <= value; a++){
           for ( int b = 1; b <= value; b++){
              if (a * a + b * b <= max ){
                   k++;
               }
           }
       }

        return k;
    }

    public static void main(String[] args) {
        System.out.println(lookFor(2));
    }
}
