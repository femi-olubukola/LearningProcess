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

    // helper method to swap values in two elements
    private static void swap(int[] data, int first, int second){
        int temporary = data[first]; // store first in temporary
        data[first] = data[second]; // replace first with second
        data[second] = temporary; // put temporary in second
    }

    // print a pass of the algorithm
    private static void printPass(int[] data, int pass, int index){}
}
