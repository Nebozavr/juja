package ua.com.juja.core;

/**
 * Created by ybartoschuk on 03.07.2017.
 */
public class Test {



    public static void main(String[] args) {
       // System.out.println(printPurchases(false,true));
        int[] array = new int[] {1, 3, 6};
        int[] array2 = new int[] {4, 5, 2};

/*
        for (int k: array) {
            System.out.print(k);
        }*/
        int[] mass = merge(array, array2);
        System.out.println();
        for (int k: mass) {
            System.out.print(k);
        }
    }

    public static String printPurchases(boolean hasEggs, boolean hasBread) {
       /*BODY*/
        String s1 = "eggs";
        String s2  = "bread";
        String ss = null;
            if (hasEggs && hasBread) {
                ss = s1 + "," + s2;
            } else if (!hasEggs && !hasBread) {
                ss = "";
            } else if (!hasEggs && hasBread){
                ss = s2;
            } else ss = s1;

            return ss;


    }

    public static String getMonthOfYear(int number) {
        /*BODY*/
        String month = null;
        switch (number){
            case 1: month = "January";
                    break;
            case 2: month = "February";
                    break;
            case 3: month = "March";
                    break;
            case 4: month = "April";
                    break;
            case 5: month = "May";
                    break;
            case 6: month = "June";
                    break;
            case 7: month = "July";
                    break;
            case 8: month = "August";
                    break;
            case 9: month = "September";
                    break;
            case 10: month = "October";
                    break;
            case 11: month = "November";
                    break;
            case 12: month = "December";
                    break;
            default:
                    break;
        }
        return month;
    }

    public static void invert(int[] arr) {
        for (int k = arr.length / 2; k >= 0; k--) {
            int tmp = arr[k];
            arr[k] = arr[arr.length - k - 1];
            arr[arr.length - k - 1] = tmp;

        }
    }

    public static int [] filterEven(int [] nums){
        int[] array = new int[nums.length];

        for (int i = 0, k = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                array[k] = nums[i];
                k++;
            }
        }

        return array;
    }

    public static int[] merge(int[] fst, int[] snd) {
        int[] result = new int[fst.length + snd.length];
        int fstIndex = 0;
        int sndIndex = 0;

        while ( fstIndex < fst.length && sndIndex < snd.length ) {
            if ( fst[fstIndex] < snd[sndIndex] ) {
                result[fstIndex + sndIndex] = fst[fstIndex++];
            } else {
                result[fstIndex + sndIndex] = snd[sndIndex++];
            }
        }
        while ( fstIndex < fst.length ) {
            result[fstIndex + sndIndex] = fst[fstIndex++];
        }
        while ( sndIndex < snd.length ) {
            result[fstIndex + sndIndex] = snd[sndIndex++];
        }


        return result;
    }

}
