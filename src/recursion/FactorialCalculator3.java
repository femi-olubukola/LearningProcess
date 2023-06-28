package recursion;

// Iterative factorial method.

public class FactorialCalculator3 {

    // recursive declaration of method factorial
    public long factorial(long number) {
        long result = 1;

        // iterative declaration of method factorial
        for (long i = number; i >= 1; i--)
            result *= i;

        return result;
    }

}
