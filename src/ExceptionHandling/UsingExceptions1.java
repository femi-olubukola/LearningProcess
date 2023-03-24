package ExceptionHandling;


public class UsingExceptions1 {

    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception exception) { // catch exception thrown in method1
            System.err.printf("%s%n%n", exception.getMessage());

            exception.printStackTrace();

            // obtain the stack-trace information
            StackTraceElement[] traceElements = exception.getStackTrace();

            System.out.printf("%nStack trace from getStackTrace:%n");
            System.out.println("Class\t\tFile\t\t\tLine\tMethod");

            // loop through traceElements to get exception description
            for (StackTraceElement element : traceElements) {

                System.out.printf("%s\t", element.getClassName());
                System.out.printf("%s\t", element.getFileName());
                System.out.printf("%s\t", element.getLineNumber());
                System.out.printf("%s%n", element.getMethodName());
            }
        }

    }
}
