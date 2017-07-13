package ua.com.juja.core.week02;

public class Quiz10 {

    public static void main(String[] args) {
        f(1);
    }

    private static void f(int n) {
        if (n < 7) {
            System.out.print(n);
            f(2 * n);
            System.out.print(n);
        }
    }
}