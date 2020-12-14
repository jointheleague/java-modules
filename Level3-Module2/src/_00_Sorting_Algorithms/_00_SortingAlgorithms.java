package _00_Sorting_Algorithms;

import javax.swing.JOptionPane;

/*
 * INSTRUCTIONS
 * Run the demo VisualSorter.jar to see the finished product. 
 * Then complete the steps in the classes in the following order:
 * BubbleSorter
 * BogoSorter
 * 
 * The classes below are for reference only. You don't have to code these.
 * These classes are here to highlight different ways to sort data.
 * Watch the data as it's sorted and then look at the code. Can you figure
 * out how the sorting is done?
 * HeapSorter
 * InsertionSorter
 * MergeSorter
 * QuickSorter
 * SelectionSorter
 */

public class _00_SortingAlgorithms {
    public static void main(String[] args) {
        String[] options = new String[] {"Bogo", "Heap", "Merge", "Quick","Insertion","Selection", "Bubble"};
        int input = JOptionPane.showOptionDialog(null, "Choose a sorting algorithm to visualize", "Sorting Algorithms", 0, 
                -1, null, options, 0);

        String choice = options[input];

        switch(choice) {
        case "Bubble":{
            new SortingVisualizer(new BubbleSorter());
            break;
        }
        case "Selection":{
            new SortingVisualizer(new SelectionSorter());
            break;
        }
        case "Insertion":{
            new SortingVisualizer(new InsertionSorter());
            break;
        }
        case "Quick":{
            new SortingVisualizer(new QuickSorter());
            break;
        }
        case "Merge":{
            new SortingVisualizer(new MergeSorter());
            break;
        }
        case "Heap":{
            new SortingVisualizer(new HeapSorter());
            break;
        }
        case "Bogo":{
            new SortingVisualizer(new BogoSorter());
            break;
        }
        default:
            JOptionPane.showMessageDialog(null, "ERROR: Unknown sorting algorithm " + choice);
            break;
        }
    }
}
