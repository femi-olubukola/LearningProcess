package recursion;

// Recursive fibonacci method.

import java.math.BigInteger;

public class FibonacciCalculator {

    private static BigInteger TWO = BigInteger.valueOf(2);

    // recursive declaration of method fibonacci
    public static BigInteger fibonacci(BigInteger number) {

        if (number.equals(BigInteger.ZERO) ||
                number.equals(BigInteger.ONE)) // base cases
            return number;
        else // recursion step
            return fibonacci(number.subtract(BigInteger.ONE)).add(
                    fibonacci(number.subtract(TWO)));
    }

}
