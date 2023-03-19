package ExceptionHandling;
// try...catch...finally exception handling mechanism.

public class UsingExceptions {

    public static void main(String[] args) {

        try
        {
            throwException();
            }
        catch (Exception exception) // exception thrown by throwException
        {
            System.err.println("Exception handled in main");
            }

        doesNotThrowException();
    }

    // demonstrate try...catch...finally
    public static void throwException() throws Exception {
        try // throw an exception and immediately catch it
        {
            System.out.println("Method throwException");

            }
        catch (Exception exception) // catch exception thrown in try
        {
            System.err.println(
                    "Exception handled in method throwException");

            // code here would not be reached; would cause compilation errors

            }

        // code here would not be reached; would cause compilation errors
        }
}
