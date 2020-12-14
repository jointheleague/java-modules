package _00_Intro_to_Sorting_Algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _00_SortingDemo {
    public static void main(String[] args) {
        /*
         * Bubble Sort is a simple sorting algorithm that uses 2 for loops over
         * a data structure.
         * 
         * The inner for loop compares one element to the next and swaps the
         * values until a single element is in its correctly ordered position.
         * 
         * The outer for loop runs the inner for loop for the number of
         * elements in the data structure. So if an array has 5 elements, the
         * outer for loop runs 5 times. 
         */
        
        /*
         * Sorting an array of numbers from lowest to highest (Ascending order)
         * 1, 2, 3, 4, 5, 6, ...
         */
        int[] arr = { 6, 2, 4, 5, 1, 3 };
        
        // This for loop puts every value in the correct position
        for (int i = 0; i < arr.length; i++) {
            
            // This for loop puts one value in the correct position
            for (int k = 0; k < arr.length - 1; k++) {
                
                // If the current element is bigger than the next...
                if( arr[k] > arr[ k+1 ] ) {
                    
                    // Swap elements at k and k+1
                    int temp = arr[k];
                    arr[k] = arr[ k+1 ];
                    arr[ k+1 ] = temp;
                }
            }
        }
        
        for( int i : arr ) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * Sorting an array of numbers from highest to lowest (Descending order)
         * 6, 5, 4, 3, 2, 1, ...
         */
        int[] arr2 = { 6, 2, 4, 5, 1, 3 };
        
        for (int i = 0; i < arr2.length; i++) {
            for (int k = 0; k < arr2.length - 1; k++) {
                
                // The only difference is the > changes to <
                if( arr2[k] < arr2[ k+1 ] ) {
                    int temp = arr2[k];
                    arr2[k] = arr2[ k+1 ];
                    arr2[ k+1 ] = temp;
                }
            }
        }
        
        for( int i : arr2 ) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * Sorting an array of Strings alphabetically (or lexicographically)
         * from A to Z.
         * "a", "b", "c", "d", ...
         */
        String[] arr3 = { "c", "e", "d", "f", "b", "a" };
        
        for (int i = 0; i < arr3.length; i++) {
            for (int k = 0; k < arr3.length - 1; k++) {
                
                // "a".compareTo( "b" ) => -1
                // "b".compareTo( "a" ) => 1
                // "b".compareTo( "b" ) => 0
                if( arr3[k].compareTo(arr3[ k+1 ]) > 0 ) {
                    String temp = arr3[k];
                    arr3[k] = arr3[ k+1 ];
                    arr3[ k+1 ] = temp;
                }
            }
        }
        
        for( String i : arr3 ) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * Sorting an ArrayList using the Collections class
         */
        ArrayList<Double> doubleList = new ArrayList<Double>();
        doubleList.add(5.0);
        doubleList.add(3.0);
        doubleList.add(2.0);
        doubleList.add(4.0);
        doubleList.add(0.0);
        doubleList.add(1.0);
        
        // Sort list in place
        Collections.sort(doubleList);
        
        for( Double i : doubleList ) {
            System.out.print(i + " ");
        }
        System.out.println();

        /*
         * Sorting an ArrayList alphabetically based of the LAST letter using
         * the Collections class and a new class
         */
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("xyzF");
        strList.add("zzzA");
        strList.add("zyaC");
        strList.add("bytB");
        strList.add("wqgE");
        strList.add("voiD");
        
        class MyCustomCompareClass implements Comparator<String> {
            @Override
            public int compare(String str1, String str2) {
                String lastLetter1 = str1.charAt(str1.length()-1) + "";
                String lastLetter2 = str2.charAt(str2.length()-1) + "";
                
                return lastLetter1.compareTo(lastLetter2);
            }
        }
        
        Collections.sort(strList, new MyCustomCompareClass());
        
        for( String str : strList ) {
            System.out.print(str + " ");
        }
    }
}
