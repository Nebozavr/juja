package ua.com.juja.core.week07.lab35;

import java.math.BigInteger;

/**
 * Реализовать вычисление полинома в точке, то есть нам, скажем, дают полином f = 2*x*x*x - 3*x
 * в виде [2, 0, -3, 0] и точку 100, а мы должны вычислить 2*100*100*100 - 3*100 = 2000000 - 300 = 1999700
 */

public class PolyUtils {


    public static BigInteger eval(BigInteger[] poly, BigInteger arg) {
        int pow = poly.length - 1;
        BigInteger[] resultArray = new BigInteger[poly.length];

        int intResult = poly[poly.length - 1].intValue();

        for (int index = 0; index < poly.length - 1; index++) {
            resultArray[index] = poly[index].multiply(arg.pow(pow));
            pow--;
            intResult += resultArray[index].intValue();
        }

        return new BigInteger(String.valueOf(intResult));
    }
}
