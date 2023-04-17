package StringsCharactersRegularExpressions;

import java.util.Scanner;

// Character static methods for testing characters and converting case.
public class StaticCharMethods {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // create scanner
        System.out.println("Enter a character and press Enter");
        String input = scanner.next();
        char c = input.charAt(0); // get input character

        // display character info
        System.out.printf("is defined: %b%n", Character.isDefined(c));
        System.out.printf("is digit: %b%n", Character.isDigit(c));
        System.out.printf("is first character in a Java identifier: %b%n",
                Character.isJavaIdentifierStart(c));

    }
}
