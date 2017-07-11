package ua.com.juja.core.week02.lab22;

public class Test2 {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(new int[][] {{0, 0}, null});
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}