// Craps class simulates the dice game craps.

import java.security.SecureRandom;

public class Craps {

    // create secure random number generator for use in method rollDice
    public static final SecureRandom randomNumbers = new SecureRandom();

    // enum type with constants that represent the game status
    private enum STATUS {CONTINUE, WON, LOST};

    // constants that represent common rolls of the dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // plays one game of craps
    public static void main(String[] args) {

        int myPoint = 0; // point if no win or loss on first roll
        STATUS gameStatus;  // can contain CONTINUE, WON or LOST

        int sumOfDice = rollDice(); // first roll of the dice

        // determine game status and point based on first roll
        switch (sumOfDice) {

            case SEVEN:  // win with 7 on first roll
            case YO_LEVEN: // win with 11 on first roll
                gameStatus = STATUS.WON;
                break;

            case SNAKE_EYES: // lose with 2 on first roll
            case BOX_CARS:  // lose with 3 on first roll
            case TREY:  // lose with 12 on first roll
                gameStatus = STATUS.LOST;
                break;

            default: // did not win or lose, so remember point
                gameStatus = STATUS.CONTINUE; // the game is not over
                myPoint = sumOfDice; // remember the point
                System.out.printf("Point is %d%n", myPoint);
                break;
        }

        // while game is not complete
        while (gameStatus == STATUS.CONTINUE) {

            sumOfDice = rollDice(); // roll dice again

            // determine game status
            if (sumOfDice == myPoint) // win by making point
                gameStatus = STATUS.WON;
            else
                if (sumOfDice == SEVEN) // loose by rolling 7 before point
                    gameStatus = STATUS.LOST;
        }

        // display won or lost message
        if (gameStatus == STATUS.WON)
            System.out.println("Player Wins");
        else
            System.out.println("Player Loses");
    }

    // roll dice, calculate sum and display results
    public static int rollDice() {

        int die1 = 1 + randomNumbers.nextInt(6); // first die roll (shifting value 1 and scaling factor 6)
        int die2 = 1 + randomNumbers.nextInt(6); // second die roll

        int sum = die1 + die2;

        // display results of this roll
        System.out.printf("Player rolled %d + %d = %d%n",
                die1, die2, sum);

        return sum;
    }

} // end class Craps
