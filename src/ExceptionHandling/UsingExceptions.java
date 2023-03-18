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
}
