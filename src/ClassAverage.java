
// Formulating Algorithms: Counter-Controlled
//        Repetition


// PROBLEM STATEMENT

//    A class of ten students took a quiz. The grades (integers in the range 0–100) for this
//    quiz are available to you. Determine the class average on the quiz.


// PSEUDOCODE; Pseudocode Algorithm with Counter-Controlled Repetition

//        Set total to zero
//        Set grade counter to one
//
//        While grade counter is less than or equal to ten
//          Prompt the user to enter the next grade
//          Input the next grade
//          Add the grade into the total
//          Add one to the grade counter
//
//        Set the class average to the total divided by ten
//        Print the class average


// Solving the class-average problem using counter-controlled repetition.
import java.util.Scanner;

public class ClassAverage {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double total = 0; // initialize sum of grades entered by the user
        int gradeCounter = 1;  // initialize # of grade to be entered next

        while (gradeCounter <= 10) {

            System.out.println("Enter a grade: "); // prompt
            int grade = input.nextInt(); ; // input next grade
            total = total + grade; // add grade to total
            gradeCounter = gradeCounter + 1; // increment counter by 1
        }

        // termination phase
        double average = total / 10;

        System.out.println("Total of all 10 grades is: " + total);
        System.out.println("Class average is: " + average);
    }
}
