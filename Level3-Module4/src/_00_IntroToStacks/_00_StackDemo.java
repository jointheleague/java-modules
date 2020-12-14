package _00_IntroToStacks;

import java.util.Stack;

public class _00_StackDemo {
    public static void main(String[] args) {
        
        /*
         * A Stack...
         */
        
        /*
         * Initializing a Stack of Strings
         */
        System.out.println("Here is a Stack of Strings: \n");

        Stack<String> flavors = new Stack<String>();
        flavors.push("Strawberry");
        flavors.push("Mint");
        flavors.push("Chocolate");
        flavors.push("Apple");
        flavors.push("Vanilla");
        flavors.push("Mango");

        /*
         * Since Mango was the last one pushed, it will be the first one popped.
         * The pop() method reduces the size of the Stack by 1
         */
        System.out.println("Stack size: " + flavors.size());
        System.out.println("Popping off the top of the stack:");
        System.out.println(flavors.pop());

        /*
         * Getting the size of the Stack
         * Notice the size is smaller by 1 after the pop() method
         */
        System.out.println("Stack size: " + flavors.size());
        
        /*
         * Looping through the Stack and clearing it
         */
        System.out.println("\nPopping all the strings off the Stack:");
        for(int i = 0; i < flavors.size(); i++){
            System.out.println(flavors.pop());
        }
    }
}
