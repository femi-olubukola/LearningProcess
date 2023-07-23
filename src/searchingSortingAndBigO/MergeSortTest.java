package searchingSortingAndBigO;

// Sorting an array with merge sort.

public class MergeSortTest {

    // calls recursive split method to begin merge sorting
    public static void mergeSort(int[] data) {

        sortArray(data, 0, data.length - 1); // sort entire array
        } // end method sort

    // splits array, sorts subarrays and merges subarrays into sorted array
    private static void sortArray(int[] data, int low, int high) {
        // test base case; size of array equals 1
        if ((high - low) >= 1) // if not base case
            {
            int middle1 = (low + high) / 2; // calculate middle of array
            int middle2 = middle1 + 1; // calculate next element over

            // output split step
            System.out.printf("split: %s%n",
                    subarrayString(data, low, high));
            System.out.printf(" %s%n",
                    subarrayString(data, low, middle1));
            System.out.printf(" %s%n%n",
                    subarrayString(data, middle2, high));

            // split array in half; sort each half (recursive calls)
            sortArray(data, low, middle1); // first half of array
            sortArray(data, middle2, high); // second half of array

            // merge two sorted arrays after split calls return
            merge (data, low, middle1, middle2, high);
            } // end if
    } // end method sortArray
}
