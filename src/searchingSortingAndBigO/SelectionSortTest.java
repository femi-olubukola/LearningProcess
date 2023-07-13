package searchingSortingAndBigO;

public class SelectionSortTest {

    // sort array using selection sort
    public static void selectionSort(int[] data) {

        // loop over data.length - 1 elements
        for (int i = 0; i < data.length - 1; i++) {
            int smallest = i; // first index of remaining array

            // loop to find index of smallest element
            for (int index = i + 1; index < data.length; index++)
                if (data[index] < data[smallest])
                smallest = index;

            swap(data, i, smallest); // swap smallest element into position
            printPass(i + 1, smallest); // output pass of algorithm
        }
    } // end method selectionSort
}
