package searchingSortingAndBigO;

// Sequentially searching an array for an item.

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class LinearSearchTest {

    // perform a linear search on the data
    public static int linearSearch(int data[], int searchKey)
    {
        // loop through array sequentially
        for (int index = 0; index < data.length; index++)
            if (data[index] == searchKey)
                return index; // return index of integer

        return -1; // integer was not found
    } // end method linearSearch

    
}
