// Overloaded method declarations.

public class MethodOverload {

    // test overloaded square methods
    public static void main(String[] args) {

        System.out.println("Square of integer 7 is " + square(7));
        System.out.println("Square of double 7.5 is " + square(7.5));

    }

    // square method with int argument
    public static int square(int intValue) {

        System.out.println("Called square with int argument: " +
                intValue);

        return intValue * intValue;
    }

    // square method with double argument
    public static double square(double doubleValue) {

        System.out.println("Called square with double argument: " +
                doubleValue);

        return doubleValue * doubleValue;
    }

}
