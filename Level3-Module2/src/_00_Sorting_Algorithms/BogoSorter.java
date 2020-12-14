package _00_Sorting_Algorithms;

import java.util.Random;

public class BogoSorter extends Sorter {
	public BogoSorter() {
		type = "Bogo";
	}
	
	/*
	 * Bogo sort is a joke sorting algorithm. It is considered the most
	 * inefficient sorting algorithm while still maintaining the possibility
	 * of eventually sorting data.
	 * 
	 * It works by following these steps:
	 * STEP 1. Is the array in order?
	 * if yes, finished; if no, go to step 2.
	 * STEP 2. Take two random elements in the array and swap them.
	 * STEP 3. Go back to step 1.
	 */
	
	// 1. Complete the sort method using the Bogo sort algorithm. 
	@Override
	void sort(int[] array, SortingVisualizer display) {

	}
}
