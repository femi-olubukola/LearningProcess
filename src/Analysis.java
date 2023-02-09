

// PROBLEM STATEMENT

//        A college offers a course that prepares students for the state licensing exam for real-estate
//        brokers. Last year, ten of the students who completed this course took the exam.
//        The college wants to know how well its students did on the exam. You’ve been asked to write a
//        program to summarize the results. You’ve been given a list of these 10 students. Next to
//        each name is written a 1 if the student passed the exam or a 2 if the student failed.
//        Your program should analyze the results of the exam as follows:
//        1. Input each test result (i.e., a 1 or a 2). Display the message “Enter result” on the screen
//        each time the program requests another test result.
//        2. Count the number of test results of each type.
//        3. Display a summary of the test results, indicating the number of students who passed and
//        the number who failed.
//        4. If more than eight students passed the exam, print “Bonus to instructor!”


// PSEUDOCODE; top-down, stepwise refinement (We begin with a pseudocode representation of the top)

//  Analyze exam results and decide whether a bonus should be paid

// OUR FIRST REFINEMENT

//  Initialize variables
//  Input the 10 exam results, and count passes and failures
//  Print a summary of the exam results and decide whether a bonus should be paid

// BREAKING DOWN REFINEMENT STATEMENTS

// Initialize variables :::  -Initialize passes to zero
//                           -Initialize failures to zero
//                           -Initialize student counter to one

//  Input the 10 exam results, and count passes and failures ::: -While student counter is less than or equal to 10
//                                                               -Prompt the user to enter the next exam result
//                                                               -Input the next exam result
//                                                               -If the student passed
//                                                                   -Add one to passes
//                                                                -Else
//                                                                  Add one to failures
//                                                                -Add one to student counter

//  Print a summary of the exam results and decide whether a bonus should be paid :::  -Print the number of passes
//                                                                                     -Print the number of failures
//                                                                                     -If more than eight students passed
//                                                                                     -Print “Bonus to instructor!”



// Complete SECOND REFINEMENT of PSEUDOCODE and Conversion to Class Analysis


//        Initialize passes to zero
//        Initialize failures to zero
//        Initialize student counter to one
//
//        While student counter is less than or equal to 10
//            Prompt the user to enter the next exam result
//            Input the next exam result
//
//            If the student passed
//                Add one to passes
//            Else
//                Add one to failures
//
//        Add one to student counter
//
//        Print the number of passes
//        Print the number of failures
//
//        If more than eight students passed
//            Print “Bonus to instructor!”



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
