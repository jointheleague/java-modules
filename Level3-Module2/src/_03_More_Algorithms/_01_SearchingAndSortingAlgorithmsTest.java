package _03_More_Algorithms;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class _01_SearchingAndSortingAlgorithmsTest {
    /*
     * Create the methods in the Algorithm class so that it will make the following
     * tests pass. When you get a green bar, uncomment the next test until you have
     * solved them all. Expand your vocabulary while you're at it.
     */

    // 1. Create a method that will find and return the first index of a broken egg
//    @Test
//    public void testSearch() {
//        List<String> eggs = Arrays.asList(new String[] { "whole", "whole", "whole", "whole",
//                "cracked", "whole", "whole", "whole", "cracked", "whole", "whole", "whole" });
//        assertEquals(4, Algorithms.findBrokenEgg(eggs));
//    }

    // 2. Count how many oysters contain pearls
//    @Test
//    public void testSearchAndAccumulate() throws Exception {
//        List<Boolean> oysters = Arrays
//                .asList(new Boolean[] { false, false, true, false, false, false, false, false,
//                        false, false, false, false, false, false, false, false, false, false,
//                        false, false, false, false, false, true });
//        assertEquals(2, Algorithms.countPearls(oysters));
//    }

    // 3. Create a method that will return the height of the tallest person. */
//    @Test
//    public void testFindMaxiumum() throws Exception {
//        List<Double> peeps = Arrays
//                .asList(new Double[] { 5.7, 6.2, 3.4, 6.2, 5.0, 5.5, 4.7, 6.2, 3.4, 4.2,
//                        5.0, 4.5, 5.1, 6.6 });
//        assertEquals(6.6, Algorithms.findTallest(peeps), 0.0);
//    }

    // 4. Create a method that will find the longest word.
//    @Test
//    public void testFindMaxiumumString() throws Exception {
//        List<String> words = Arrays.asList(new String[] { "accoutrements", "acumen", "anomalistic", "auspicious",
//                "bellwether", "callipygian", "circumlocution", "concupiscent", "conviviality", "coruscant",
//                "cuddlesome", "cupidity", "cynosure", "ebullient", "equanimity", "excogitate", "gasconading",
//                "idiosyncratic", "luminescent", "magnanimous", "nidificate", "osculator", "parsimonious", "penultimate",
//                "perfidiousness", "perspicacious", "proficuous", "remunerative", "saxicolous", "sesquipedalian",
//                "superabundant", "unencumbered", "unparagoned", "usufruct", });
//        assertEquals("circumlocution", Algorithms.findLongestWord(words));
//    }

    // 5. The Morse code for SOS is "... --- ..."
    // Create a method that can tell if SOS is contained in a message.
//    @Test
//    public void testFindString() throws Exception {
//        List<String> message1 = Arrays.asList(".... . .-. .-. --- / ... --- ... / -.-- .- .-.. .-.. ...".split(" / "));
//        assertEquals(true, Algorithms.containsSOS(message1));
//        List<String> message2 = Arrays.asList(
//                ".-- .. - .... / - .... . / .-.. .. --. .... - ... / --- ..- - --..-- / .. - .----. ... / .-.. . ... ... / -.. .- -. --. . .-. --- ..- ... / .... . .-. . / .-- . / .- .-. . / -. --- .-- ? / . -. - . .-. - .- .. -. / ..- ... / .. / ..-. . . .-.. / ... - ..- .--. .. -.. / .- -. -.. / -.-. --- -. - .- --. .. --- ..- ... / .... . .-. . / .-- . / .- .-. . / -. --- .-- ? / . -. - . .-. - .- .. -. / ..- ... / .- / -- ..- .-.. .- - - --- --..-- / .- -. / .- .-.. -... .. -. --- --..-- / .- / -- --- ... --.- ..- .. - --- --..-- / -- -.-- / .-.. .. -... .. -.. --- / -.-- . .- .... --..-- / .... . -.-- / -.-- . .- ...."
//                        .split("/"));
//        assertEquals(false, Algorithms.containsSOS(message2));
//    }

    // 6. Write a Morse code translator to read the messages. Just kidding!

    // 7. Sort the exam results from lowest to highest.
//    @Test
//    public void testSort() throws Exception {
//        List<Double> results = Arrays.asList(
//                new Double[] { 60.3, 60.2, 80.4, 67.2, 95.0, 85.5, 40.7, 68.2, 38.4, 94.2, 85.0, 84.5, 50.1, 66.6 });
//        assertEquals(38.4, Algorithms.sortScores(results).get(0), 0.0);
//        assertEquals(40.7, Algorithms.sortScores(results).get(1), 0.0);
//        assertEquals(95.0, Algorithms.sortScores(results).get(13), 0.0);
//    }

    // 8. Sort the DNA sequences by length from shortest to longest.
//    @Test
//    public void testSortStringLength() throws Exception {
//        List<String> unsortedSequences = Arrays.asList(new String[] { "ATAGCTGATCGTAGCTACGTACGATCG", "CATCGTACATGC",
//                "TATGTGT", "GCTGATCGTGACTGTAC", "ACTGT" });
//        List<String> sortedSequences = Arrays.asList(new String[] { "ACTGT", "TATGTGT", "CATCGTACATGC",
//                "GCTGATCGTGACTGTAC", "ATAGCTGATCGTAGCTACGTACGATCG" });
//        assertEquals(sortedSequences, Algorithms.sortDNA(unsortedSequences));
//    }

    // 9. Sort the words in alphabetical order. Your teacher may need to explain
    // compareTo.
//    @Test
//    public void testSortStringContents() throws Exception {
//        List<String> words = Arrays
//                .asList(new String[] { "aby", "dap", "alt", "alb", "ama", "ard", "ana", "ala", "awn", "dah", "bar",
//                        "bee", "bel", "bot", "bis", "cep", "alk", "cog", "col", "cwm", "dag", "ait", "dal", "daw" });
//        assertEquals("aby", Algorithms.sortWords(words).get(0));
//        assertEquals("bar", Algorithms.sortWords(words).get(10));
//        assertEquals("daw", Algorithms.sortWords(words).get(words.size() - 1));
//    }
}
