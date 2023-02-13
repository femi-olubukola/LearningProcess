//4.21 (Find the Largest Number) The process of finding the largest value is used frequently in computer applications. 
//        For example, a program that determines the winner of a sales contest would input
//        the number of units sold by each salesperson. The salesperson who sells the most units wins the contest. 
//        Write a pseudocode program, then a Java application that inputs a series of 10 integers and determines 
//        and prints the largest integer. Your program should use at least the following three variables:
//        a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been
//        input and to determine when all 10 numbers have been processed).
//        b) number: The integer most recently input by the user.
//        c) largest: The largest number found so far.


// pseudocode

//        initialize counter to 1
//        initialize number
//        initialize largest number
//
//        prompt user to enter number of units sold by each person
//        save input as largest number
//
//            while counter is less or equal to 9
//                add one to counter
//                prompt user to enter another unit
//                save input as number
//
//            if number is greater than largest number
//                assign largest number to number
//
//        Print largest number

import java.util.Scanner;

public class FindTheLargestNumber {
    public static void main(String[] args) {
        
        int counter = 1;
        int number;
        int largest;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of units sold by each person: ");
        largest = input.nextInt();
        
        while (counter <= 9) {
            counter = counter + 1;
            System.out.println("Enter number of units sold by each person: ");
            number = input.nextInt();

            if (number > largest) {
                largest = number;
            }

        }

        System.out.println(largest + " is the largest number found so far");

    }
}
