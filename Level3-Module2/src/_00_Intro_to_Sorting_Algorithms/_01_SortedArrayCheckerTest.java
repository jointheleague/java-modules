package _00_Intro_to_Sorting_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/*
 * Remove the comments from the assertFalse and assertTrue methods AFTER
 * completing the methods in the Sorted Array Checker.
 */
public class _01_SortedArrayCheckerTest {

    @Test
    public void testIntArray() {
        int[] unsorted = {3, 2, 9, 3, 1, 0};
        int[] sorted = {0, 1, 2, 2, 3, 4};

//        assertFalse(_01_SortedArrayChecker.intArraySorted(unsorted));
//        assertTrue(_01_SortedArrayChecker.intArraySorted(sorted));
    }

    @Test
    public void testDoubleArray() {
        double[] unsorted = {3, 2, 9, 3, 1, 0};
        double[] sorted = {0, 1, 2, 2, 3, 4};

//        assertFalse(_01_SortedArrayChecker.doubleArraySorted(unsorted));
//        assertTrue(_01_SortedArrayChecker.doubleArraySorted(sorted));
    }

    @Test
    public void charDoubleArray() {
        char[] unsorted = {'c', 'F', 'p', 'A'};
        char[] sorted = {'a', 'b', 'c', 'd', 'e'};

//        assertFalse(_01_SortedArrayChecker.charArraySorted(unsorted));
//        assertTrue(_01_SortedArrayChecker.charArraySorted(sorted));
    }

    @Test
    public void stringDoubleArray() {
        String[] unsorted = {"carrot", "pineapple", "mango", "pear"};
        String[] sorted = {"apple", "banana", "carrot", "grape"};

//        assertFalse(_01_SortedArrayChecker.stringArraySorted(unsorted));
//        assertTrue(_01_SortedArrayChecker.stringArraySorted(sorted));
    }
}
