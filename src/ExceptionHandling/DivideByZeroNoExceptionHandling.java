package ExceptionHandling;
// Integer division without exception handling.

import java.util.Scanner;

public class DivideByZeroNoExceptionHandling {

    public static int quotient(int numerator, int denominator) {

        // demonstrates throwing an exception when a divide-by-zero occurs
        return numerator / denominator; // possible division by zero
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer numerator: ");
        int numerator = input.nextInt();
        System.out.println("Please enter an integer denominator: ");
        int denominator = input.nextInt();

        int result = quotient(numerator, denominator);

        System.out.println("Result of " + numerator + " / " + denominator + " = " + result);

    }
}
