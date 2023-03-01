// Roll a six-sided die 6,000,000 times.

import java.security.SecureRandom;

public class RollDie {

    public static void main(String[] args) {

        // randomNumbers object will produce secure random numbers
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0; // count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled

        // tally counts for 6,000,000 rolls of a die
        for (int roll = 1; roll <= 6000000; roll++) {

            //  pick random integer from 1 to 6
            int face = 1 + randomNumbers.nextInt(6);
            // where 1 is the SHIFTING VALUE && 6 is the SCALING FACTOR

            // use face value 1-6 to determine which counter to increment
            switch (face) {

                case 1:
                    ++frequency1; // increment the 1s counter
                    break;

                case 2:
                    ++frequency2; // increment the 2s counter
                    break;

                case 3:
                    ++frequency3; // increment the 3s counter
                    break;

                case 4:
                    ++frequency4; // increment the 4s counter
                    break;

                case 5:
                    ++frequency5; // increment the 5s counter
                    break;

                case 6:
                    ++frequency6; // increment the 6s counter
                    break;
            }
        }

        System.out.println( "Face" + "          " + "Frequency");
        System.out.println( "1" + "             " + frequency1);
        System.out.println( "2" + "             " + frequency2);
        System.out.println( "3" + "             " + frequency3);
        System.out.println( "4" + "             " + frequency4);
        System.out.println( "5" + "             " + frequency5);
        System.out.println( "6" + "             " + frequency6);
    }
}
