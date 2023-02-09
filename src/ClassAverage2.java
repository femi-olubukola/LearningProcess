
// Formulating Algorithms: Sentinel-Controlled
//        Repetition

// PROBLEM STATEMENT

//  Develop a class-averaging program that processes grades for an arbitrary number of
//        students each time it’s run.

//  Developing the Pseudocode Algorithm with TOP-DOWN, STEPWISE REFINEMENT:
//        The Top and First Refinement

// TOP—a single statement that conveys the overall
//        function of the program:

//                                 Determine the class average for the quiz

// FIRST REFINEMENT:

//        Initialize variables
//        Input, sum and count the quiz grades
//        Calculate and print the class average

// BREAKING DOWN REFINEMENT STATEMENTS (proceeding to the second refinement)

// Initialize variables :::  -Initialize total to zero
//                           -Initialize counter to zero

// Input, sum and count the quiz grades :::  -Prompt the user to enter the first grade
//                                           -Input the first grade (possibly the sentinel)
//                                           -While the user has not yet entered the sentinel
//                                              -Add this grade into the running total
//                                              -Add one to the grade counter
//                                              -Prompt the user to enter the next grade
//                                              -Input the next grade (possibly the sentinel)

// Calculate and print the class average ::: -If the counter is not equal to zero
//                                              -Set the average to the total divided by the counter
//                                              -Print the average
//                                           -else
//                                              -Print “No grades were entered”

// COMPLETE REFINEMENT

//            Initialize total to zero
//            Initialize counter to zero
//
//            Prompt the user to enter the first grade
//            Input the first grade (possibly the sentinel)
//
//            While the user has not yet entered the sentinel
//                Add this grade into the running total
//                Add one to the grade counter
//                Prompt the user to enter the next grade
//                Input the next grade (possibly the sentinel)
//
//            If the counter is not equal to zero
//                Set the average to the total divided by the counter
//                Print the average
//            else
//                Print “No grades were entered”





import java.util.Scanner;

// Solving the class-average problem using sentinel-controlled repetition.
public class ClassAverage2 {

    public static void main(String[] args) {

        // create Scanner to obtain input from command window
        Scanner input = new Scanner(System.in);

        // initialization phase
        int total = 0;
        int gradeCounter = 0;

        // processing phase
        // prompt for input and read grade from user
        System.out.print("Enter grade or -1 to quit: ");
        int grade = input.nextInt();

        // loop until sentinel value read from user
        while (grade != -1) {
            total = total + grade; // add grade to total
            gradeCounter = gradeCounter + 1; // increment counter

            // prompt for input and read next grade from user
            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }

        // termination phase
        // if user entered at least one grade...
        if (gradeCounter != 0) {

            // use number with decimal point to calculate average of grades
            double average = (double) total / gradeCounter;

            // display total and average (with two digits of precision)
            System.out.printf("%nTotal of the %d grades entered is %d%n",
                    gradeCounter, total);
            System.out.printf("Class average is %.2f%n", average);
        }
        // no grades were entered, so output appropriate message
        else
            System.out.println("No grades were entered");
    }

}
