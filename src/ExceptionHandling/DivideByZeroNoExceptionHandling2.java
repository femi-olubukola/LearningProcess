package ExceptionHandling;
// Handling ArithmeticExceptions and InputMismatchExceptions.

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideByZeroNoExceptionHandling2 {

    // demonstrates throwing an exception when a divide-by-zero occurs
    public static int quotient(int numerator, int denominator)
            throws ArithmeticException
    {
        return numerator / denominator; // possible division by zero
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        boolean continueLoop = false;

        do {
            // read two numbers and calculate quotient
            try {
                System.out.println("Please enter an integer numerator: ");
                int numerator = input.nextInt();
                System.out.println("Please enter an integer denominator: ");
                int denominator = input.nextInt();

                int result = quotient(numerator, denominator);

                System.out.println("Result of " + numerator + " / " + denominator + " = " + result);

                continueLoop = false;
            }

            catch (InputMismatchException inputMismatchException)
            {
                System.err.printf("%nException: %s%n",
                        inputMismatchException);
                input.nextLine(); // discard input so user can try again
                System.out.printf(
                        "You must enter integers. Please try again.%n%n");
            }
            catch (ArithmeticException arithmeticException)
            {
                System.err.printf("%nException: %s%n", arithmeticException);
                System.out.printf(
                        "Zero is an invalid denominator. Please try again.%n%n");
            }
        }
        while (continueLoop);

    }
}