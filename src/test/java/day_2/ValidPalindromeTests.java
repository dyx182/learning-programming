package day_2;

import org.example.algorithms.day_2.ValidPalindrome;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidPalindromeTests {

    @Test
    public void firstTest() {
        Assertions.assertTrue(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void secondTest() {
        Assertions.assertFalse(ValidPalindrome.isPalindrome("race a car"));
    }

    @Test
    public void thirdTest() {
        Assertions.assertTrue(ValidPalindrome.isPalindrome("aA"));
    }

    @Test
    public void fourTest() {
        Assertions.assertTrue(ValidPalindrome.isPalindrome(""));
    }

    @Test
    public void fiveTest() {
        Assertions.assertTrue(ValidPalindrome.isPalindrome("  "));
    }

    @Test
    public void sixTest() {
        Assertions.assertFalse(ValidPalindrome.isPalindrome("0P"));
    }

    @Test
    public void sevenTest() {
        Assertions.assertTrue(ValidPalindrome.isPalindrome("ab_a"));
    }

    @Test
    public void eightTest() {
        Assertions.assertFalse(ValidPalindrome.isPalindrome("hello"));
    }
}
