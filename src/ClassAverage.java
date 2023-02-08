
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
