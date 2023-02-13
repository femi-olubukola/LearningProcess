
// 4.17
// PROBLEM STATEMENT
// (Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
//        kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
//        a Java application that will input the miles driven and gallons used (both as integers) for each trip.
//        The program should calculate and display the miles per gallon obtained for each trip and print the
//        combined miles per gallon obtained for all trips up to this point. All averaging calculations should
//        produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
//        data from the user.

// Pseudocode
//            Develop a mileage averaging program that processes miles driven and gallons used of a trip each time it runs

// first refinement
//        initialize variables
//        input, sum and count miles per gallon
//        calculate and print the average miles per gallon for all trips

// second refinement

//        initialize milesDriven
//        initialize gallonsUsed
//        initialize totalMilesDriven to zero
//        initialize totalGallonsUsed to zero

//        prompt the user to enter miles driven or the sentinel value
//        Input the first miles (possibly the sentinel)

//            while the user has not entered the sentinel
//                add miles driven to total miles driven
//                prompt user to enter gallons used
//                input the gallons used
//                add gallons used to total gallons used
//                set double type to average miles per gallon
//                print average miles per gallon for each trip
//
//            set double type to total average combined miles per gallon
//            print total average combined miles per gallon


import java.util.Scanner;

public class GasMileage {
    public static void main(String[] args) {

        int milesDriven;
        int gallonsUsed;
        int totalMilesDriven = 0;
        int totalGallonsUsed = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("enter miles driven or -1 to terminate: ");
        milesDriven = input.nextInt();

        while (milesDriven != -1) {

            totalMilesDriven = totalMilesDriven + milesDriven;

            System.out.println("enter gallons used: ");
            gallonsUsed = input.nextInt();
            totalGallonsUsed = totalGallonsUsed + gallonsUsed;

            double milesPerGallon = (double) milesDriven/gallonsUsed;
            System.out.println("average for this one trip: " + milesPerGallon);

            System.out.println("enter miles driven or -1 to terminate: ");
            milesDriven = input.nextInt();
        }

        double combinedMilesPerGallon = (double) totalMilesDriven / (double) totalGallonsUsed;
        System.out.println("combined miles per gallon (overall): " + combinedMilesPerGallon);


    }
}
