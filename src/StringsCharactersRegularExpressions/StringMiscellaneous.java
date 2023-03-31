package StringsCharactersRegularExpressions;

// This application demonstrates the length, charAt and getChars methods of the String class.

public class StringMiscellaneous {

    public static void main(String[] args) {

        String s1 = "hello there";
        char[] charArray = new char[5];

        System.out.printf("s1: %s", s1);

        // test length method
        System.out.printf("%nLength of s1: %d", s1.length());

        // loop through characters in s1 with charAt and display reversed
        System.out.printf("%nThe string reversed is: ");
    }
}
