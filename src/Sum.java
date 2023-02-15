// Summing integers with the for statement.

// a for statement to sum the even integers from 2 to 20 and store
// the result in an int variable called total.

public class Sum {

    public static void main(String[] args) {

        int total = 0;

        // total even integers from 2 through 20
        for (int number = 2; number <= 20; number += 2){
            total += number;

        }

        System.out.println("Sum is " + total);
    }
}
