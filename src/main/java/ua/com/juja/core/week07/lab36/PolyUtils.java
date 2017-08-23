package ua.com.juja.core.week07.lab36;

import java.math.BigInteger;
import java.util.Arrays;


public class PolyUtils {
    public static void main(String[] args) {
        BigInteger[] data = new BigInteger[] {new BigInteger("1"), new BigInteger("1")};
        BigInteger[] data1 = new BigInteger[] {new BigInteger("1"), new BigInteger("1")};

        System.out.println(Arrays.toString(mul(data, data1)));


    }

    public static BigInteger[] mul(BigInteger[] x, BigInteger[] y) {
        BigInteger[] result = new BigInteger[x.length + y.length - 1];
        Arrays.fill(result, BigInteger.ZERO);

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y.length; j++) {
                result[i + j] = result[i + j].add(x[i].multiply(y[j]));
            }
        }

        return result;
    }
}
