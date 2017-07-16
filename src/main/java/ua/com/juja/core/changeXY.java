package ua.com.juja.core;

public class changeXY {

    private static void assertEquals(String input, String expected) {
        String actual = change(input);
        String output = actual.equals(expected) ? "OK" : "FAIL expected: " + expected + " but was: " + input;
        System.out.println(output);
    }

    public static String change (String input){
        char[] chars = input.toCharArray();
        char[] result = new char[chars.length];

        for (int index = 0; index < chars.length; index++) {
            if (chars[index] == 'x'){
                result[index] = 'y';
            } else {
                result[index] = chars[index];
            }
        }

        return new String(result);
    }
}
