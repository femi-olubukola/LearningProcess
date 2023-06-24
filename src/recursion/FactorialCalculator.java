package recursion;

public class FactorialCalculator {

    // recursive method factorial (assumes its parameter is >= 0)
    public static long factorial(long number)
    {
        if (number <= 1) // test for base case
            return 1; // base cases: 0! = 1 and 1! = 1
        else // recursion step
            return number * factorial(number - 1);
    }
}
