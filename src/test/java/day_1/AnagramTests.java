package day_1;

import org.example.algorithms.day_1.Anagram;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnagramTests {

    @Test
    public void classicTest() {

        Assertions.assertTrue(Anagram.isAnagram("listen","silent"));
        Assertions.assertTrue(Anagram.isAnagramWithMap("listen","silent"));
    }

    @Test
    public void differentSetOfLettersTest() {
        Assertions.assertFalse(Anagram.isAnagram("hello","world"));
        Assertions.assertFalse(Anagram.isAnagramWithMap("hello","world"));
    }

    @Test
    public void toManyDuplicateLetters() {
        Assertions.assertTrue(Anagram.isAnagram("anagram","nagaram"));
        Assertions.assertTrue(Anagram.isAnagramWithMap("anagram","nagaram"));
    }

    @Test
    public void oneLetter() {
        Assertions.assertTrue(Anagram.isAnagram("a","a"));
        Assertions.assertTrue(Anagram.isAnagramWithMap("a","a"));
    }

    @Test
    public void nullString() {
        Assertions.assertTrue(Anagram.isAnagram("",""));
        Assertions.assertTrue(Anagram.isAnagramWithMap("",""));
    }

    @Test
    public void willBeReturnTrue() {
        Assertions.assertTrue(Anagram.isAnagram("aba","aab"));
        Assertions.assertTrue(Anagram.isAnagramWithMap("aba","aab"));
    }

    @Test
    public void willBeReturnFalse() {
        Assertions.assertFalse(Anagram.isAnagram("abc","abcd"));
        Assertions.assertFalse(Anagram.isAnagramWithMap("abc","abcd"));
    }

    @Test
    public void stringIsNotAnagram() {
        Assertions.assertFalse(Anagram.isAnagram("Apple","apple"));
        Assertions.assertFalse(Anagram.isAnagramWithMap("Apple","apple"));
    }
}
