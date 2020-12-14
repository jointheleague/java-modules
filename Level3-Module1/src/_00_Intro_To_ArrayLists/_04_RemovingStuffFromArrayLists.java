package _00_Intro_To_ArrayLists;

import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class _04_RemovingStuffFromArrayLists {

    class Stuff {
        public String type;
    }
    
    class Worm extends Stuff {
        public Worm() {
            type = "worm";
        }
    }
    
    class Dirt extends Stuff {
        public Dirt() {
            type = "dirt";
        }
    }

    // 1. Write a method that removes the dirt in the yard and returns the
    //    ArrayList
    private ArrayList<Stuff> cleanOutTheYard( ArrayList<Stuff> yard ) {
        
        return yard;
    }

    @Test
    void testRemove1() {
        ArrayList<Stuff> stuffIFoundInTheYard = new ArrayList<Stuff>();
        stuffIFoundInTheYard.add(new Worm());
        stuffIFoundInTheYard.add(new Dirt());
        stuffIFoundInTheYard.add(new Dirt());
        stuffIFoundInTheYard.add(new Dirt());
        stuffIFoundInTheYard.add(new Worm());
        stuffIFoundInTheYard.add(new Dirt());
        
        // There should only be 2 worms left in the yard
        assertEquals(2, cleanOutTheYard(stuffIFoundInTheYard).size());
    }
    
    // 2. Write a method that removes the hash tag ('#') characters from the
    //    ArrayList and returns it
    private ArrayList<Character> removeHashTags(ArrayList<Character> list) {

        return list;
    }

    @Test
    void testRemove2() {
        ArrayList<Character> truth = new ArrayList<Character>();
        truth.add('c');
        truth.add('a');
        truth.add('#');
        truth.add('l');
        truth.add('#');
        truth.add('i');
        truth.add('f');
        truth.add('o');
        truth.add('#');
        truth.add('r');
        truth.add('n');
        truth.add('#');
        truth.add('i');
        truth.add('#');
        truth.add('a');
        truth.add('#');
        truth.add(' ');
        truth.add('i');
        truth.add('#');
        truth.add('s');
        truth.add('#');
        truth.add(' ');
        truth.add('w');
        truth.add('#');
        truth.add('a');
        truth.add('r');
        truth.add('#');
        truth.add('m');
        truth.add('e');
        truth.add('r');
        truth.add('#');
        char[] expectedAnswer = "california is warmer".toCharArray();
        ArrayList<Character> actualAnswer = removeHashTags(truth);
        
        assertTrue(actualAnswer.size() == expectedAnswer.length);
        
        for( int i = 0; i < expectedAnswer.length; i++ ) {
            assertEquals((int)expectedAnswer[i], (int)actualAnswer.get(i));
        }
    }
}
