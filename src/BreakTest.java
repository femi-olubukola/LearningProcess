// break statement exiting a for statement.

public class BreakTest {

    public static void main(String[] args) {

        int count; // control variable also used after loop terminates

        for (count = 1; count <= 10; count++){ // loops 10 times

            if (count == 5){
                break; // terminates loop if count is 5
            }

            System.out.print(count + " ");
        }

        System.out.println(" ");
        System.out.println("Broke out of loop at count " + count);
    }
} // end class BreakTest
