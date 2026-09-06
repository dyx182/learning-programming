package day_3;

import org.example.algorithms.day_3.ValidParentheses;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ValidParenthesesTests {

    @Test
    public void simplePair() {
        Assertions.assertTrue(ValidParentheses.isValid("()"));
    }

    @Test
    public void multiplePairs() {
        Assertions.assertTrue(ValidParentheses.isValid("()[]{}"));
    }

    @Test
    public void nested() {
        Assertions.assertTrue(ValidParentheses.isValid("{[]}"));
    }

    @Test
    public void mixedThreeTypes() {
        Assertions.assertTrue(ValidParentheses.isValid("{}()[]"));
    }

    @Test
    public void mixedWithNested() {
        Assertions.assertTrue(ValidParentheses.isValid("{}([])"));
    }

    @Test
    public void mismatchedType() {
        Assertions.assertFalse(ValidParentheses.isValid("(]"));
    }

    @Test
    public void wrongOrder() {
        Assertions.assertFalse(ValidParentheses.isValid("([)]"));
    }

    @Test
    public void wrongOrder2() {
        Assertions.assertFalse(ValidParentheses.isValid("{[}]"));
    }

    @Test
    public void emptyString() {
        Assertions.assertTrue(ValidParentheses.isValid(""));
    }

    @Test
    public void onlyOpen() {
        Assertions.assertFalse(ValidParentheses.isValid("("));
    }

    @Test
    public void unbalanced() {
        Assertions.assertFalse(ValidParentheses.isValid("(()"));
    }

    @Test
    public void onlyClose() {
        Assertions.assertFalse(ValidParentheses.isValid(")"));
    }

    @Test
    public void onlySquareClose() {
        Assertions.assertFalse(ValidParentheses.isValid("]"));
    }
}
