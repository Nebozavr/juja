package ua.com.juja.core.week02.lab22;

public class Test3 {
    public static void main(String[] args) {
        Object res = ArrayUtils.rotateClockwise(new int[][] {{0, 0}, {0}});
        if (res != null) {
            throw new AssertionError();
        }
        System.out.print("OK");
    }
}