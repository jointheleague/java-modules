package _00_Sorting_Algorithms;

public class SelectionSorter extends Sorter {
    public SelectionSorter() {
        type = "Selection";
    }

    /*
     * Selection Sort is similar to Bubble Sort.
     * The algorithm divides the input list into two parts:
     * a sorted sublist of items which is built up from left to right at the
     * front (left) of the list and a sublist of the remaining unsorted items
     * that occupy the rest of the list.
     * 
     * https://en.wikipedia.org/wiki/Selection_sort
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
        // 1. make a for loop to iterate through all but the last
        //    element of the array
        for( int i = 0; i < array.length - 1; i++ ) {

            // 2. create an integer called index and set it equal to i
            int index = i;

            // 3. make another for loop that starts at i + 1 and
            //    goes through the entire array
            for( int k = i + 1; k < array.length; k++ ) {

                // 4. if the array element at k is less than the
                //    element at index, then set index equal to k
                if( array[k] < array[index] ) {
                    index = k;
                }
            }
            
            // 5. swap the array element at index with the array element at i
            int temp = array[i];
            array[i] = array[index];
            array[index] = temp;
            
            display.updateDisplay();
        }
    }
}
