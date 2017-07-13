package ua.com.juja.core.week02.lab22;


public class Test
{
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(new int[][]{{1}});
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }


}