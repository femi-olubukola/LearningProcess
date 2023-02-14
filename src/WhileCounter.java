// An application which uses a loop to display the numbers from 1 through 10.

public class WhileCounter {

    public static void main(String[] args) {

        int counter = 1; // declare and initialize control variable

        while (counter <= 10) // loop continuation-condition
        {
            System.out.print( counter + " " );
            ++counter; // increment control variable
        }

        System.out.println();
    }
}
