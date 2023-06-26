package recursion;

// Recursive factorial method. (Using BigInteger)

import java.math.BigInteger;
public class FactorialCalculator2 {

    // recursive method factorial (assumes its parameter is >= 0)
    public static BigInteger factorial(BigInteger number) {
        if (number.compareTo(BigInteger.ONE) <= 0) // test base case
            return BigInteger.ONE; // base cases: 0! = 1 and 1! = 1
        else // recursion step
            return number.multiply(
                    factorial(number.subtract(BigInteger.ONE)));
    }


}
