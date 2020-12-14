package _00_IntroToStacks;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class _03_TestMatchingBrackets {

    @Test
    public void testMatchingBrackets() {
        assertTrue(doBracketsMatch("{}"));
        assertTrue(doBracketsMatch("{{}}"));
        assertTrue(doBracketsMatch("{}{}{{}}"));
        assertFalse(doBracketsMatch("{{}"));
        assertFalse(doBracketsMatch("}{"));
    }

    /*
     * Use a Stack to complete the method for checking if every opening bracket
     * has a matching closing bracket
     */
    private boolean doBracketsMatch(String b) {

        return false;
    }

}