package _00_Sorting_Algorithms;

public class MergeSorter extends Sorter {
    public MergeSorter() {
        type = "Merge";
    }
    
    /*
     * Since this sorting algorithm uses recursion, 
     * we'll make a helper method called mergeSort.
     * Complete the steps in the mergeSort method.
     * You can use display.updateDisplay() to show the current
     * progress on the graph.
     */
    @Override
    void sort(int[] array, SortingVisualizer display) {
        // 20. call the mergeSort method with 0 and the length of the array minus one
        mergeSort(array, 0, array.length - 1, display);
    }
    
    private void mergeSort(int[] array, int low, int high, SortingVisualizer display) {
        // 1. Create a temporary integer array that is the same length as the passed in array.
        int[] tempArr = new int[array.length];
        
        // 2. make an if statement that checks if low is less than high
        //    and put the rest of the method inside of it
        if (low < high) {
            // 3. Create an integer called middle and set it 
            //    equal to the half way point between low and high
            int middle = low + (high - low) / 2;
            
            // 4. call the mergeSort method with low and middle
            mergeSort(array, low, middle, display);
            // 5. call the mergeSort method with middle + 1 and high
            mergeSort(array, middle + 1, high, display);
            
            // 6. copy the elements from the array into the temporary array,
            //    but only the elements from low to high inclusive
            for (int i = low; i <= high; i++) {
                tempArr[i] = array[i];
            }
            
            // 7. create three integers called i, j, and k and
            //    set them equal to low, middle + 1, and low respectively
            int i = low;
            int j = middle + 1;
            int k = low;
            
            // 8. while i is less than or equal to middle
            //    and j is less than or equal to high
        // (ends after step 16)
            while (i <= middle && j <= high) {
                // 9. if temp array at i is less than or equal 
                //    to temp array at j 
                if (tempArr[i] <= tempArr[j]) {
                    // 10. set array at k equal to temp array at i
                    array[k] = tempArr[i];
                    // 11. increase i by 1
                    i++;
                // 13. else (ends after step 15)
                } else {
                    // 14. set array at k equal to temop array at j
                    array[k] = tempArr[j];
                    // 15. increase j by 1
                    j++;
                }
                // 16. increase k by 1
                k++;
                display.updateDisplay();
            }
            // 17. make a while loop that runs while i is less than or equal to middle
            while (i <= middle) {
                // 18. set array at k equal to temo array at i
                array[k] = tempArr[i];
                // 19. increase k and i by 1
                k++;
                i++;
                display.updateDisplay();
            }
        }
    }

}