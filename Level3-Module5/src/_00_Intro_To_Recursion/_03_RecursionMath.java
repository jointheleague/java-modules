package _00_Intro_To_Recursion;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.Test;

public class _03_RecursionMath {

    public static int recursiveMultiplication(int number, int times) {
        // If times is 1 
            // Return number 

        // Else return number + recursionMultiplication(number, times-1)

        return 0;
    }

    // Try this one on your own! 
    // Hint: if numberToDevideBy is bigger than number, you can't divide anymore
    public static int recursiveDivision(int number, int numberToDevideBy) {
        
        return 0;
    }

    // Try this one on your own!
    public static int recursivePower(int number, int power) {
        
        return 0;
    }

    @Test
    public void testMultiplication() {
        assertEquals(12, recursiveMultiplication(3, 4));
        
        // Add more JUnit tests like the one above to test your method
        
    }

    @Test
    public void testDivision() {
        // Add JUnit tests to test your method
        fail("Write some tests!");
    }

    @Test 
    public void testPower() {
        // Add JUnit tests to test your method
        fail("Write some tests!");
    }
}
