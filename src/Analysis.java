
// Analysis of examination results using nested control statements.
import java.util.Scanner;

public class Analysis {

    public static void main(String[] args) {

        // initializing variables in declarations
        int passes = 0;
        int failures = 0;
        int studentCounter = 1;

        Scanner input = new Scanner(System.in);

        // process 10 students using counter-controlled loop
        while (studentCounter <= 10) {
            // prompt user for input and obtain value from user
            System.out.print("Enter a result(1 = fail, 2 = pass) : ");
            int result = input.nextInt();

            // if...else is nested in the while statement
            if (result == 2)
                passes = passes + 1;
            else
                failures = failures + 1;

            // increment studentCounter so loop eventually terminates
            studentCounter = studentCounter + 1;
        }

        // termination phase
        System.out.println("The number of passes: " + passes);
        System.out.println("The number of failures: " + failures);

        // determine whether more than 8 students passed
        if (passes >= 8)
            System.out.println("Bonus to instructor");
    }
}
