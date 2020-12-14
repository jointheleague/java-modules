package _01_The_Wave;

import static org.junit.Assert.assertArrayEquals;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/*
 * Instructions are in the other file!
 */
class _01_TheWaveTest {
    ArrayList<String> result = new ArrayList<String>();
    
    @BeforeEach
    public void setup() {
        result.clear();
    }
    
    @Test
    public void Test1() {
        ArrayList<String> result = _01_TheWave.wave("hello");
        String[] actual =  result.toArray( new String[result.size()] );
        String[] expected = new String[] { "Hello", "hEllo", "heLlo", "helLo", "hellO" };
        
        assertArrayEquals("it should return '" + Arrays.toString(expected) + "'", expected, actual);
    }
    
   @Test
    public void Test2() {
       ArrayList<String> result = _01_TheWave.wave("theleague");
       String[] actual =  result.toArray( new String[result.size()] );
       String[] expected = new String[] { "Theleague", "tHeleague", "thEleague", "theLeague", "thelEague", "theleAgue", "theleaGue", "theleagUe", "theleaguE", };
       
       assertArrayEquals("it should return '" + Arrays.toString(expected) + "'", expected, actual);
    }
    
    @Test
    public void Test3() {
        ArrayList<String> result = _01_TheWave.wave("");
        String[] actual =  result.toArray( new String[result.size()] );
        String[] expected = new String[] { };
        
        assertArrayEquals("it should return '" + Arrays.toString(expected) + "'", expected, actual);
    }
    
    @Test
    public void Test4() {
        ArrayList<String> result = _01_TheWave.wave("two words");
        String[] actual =  result.toArray( new String[result.size()] );
        String[] expected = new String[] { "Two words", "tWo words", "twO words", "two Words", "two wOrds", "two woRds", "two worDs", "two wordS" };
        
        assertArrayEquals("it should return '" + Arrays.toString(expected) + "'", expected, actual);
    }
    
    @Test
    public void Test5() {
        ArrayList<String> result = _01_TheWave.wave(" gap ");
        String[] actual =  result.toArray( new String[result.size()] );
        String[] expected = new String[] { " Gap ", " gAp ", " gaP " };
        
        assertArrayEquals("it should return '" + Arrays.toString(expected) + "'", expected, actual);
    }
}
