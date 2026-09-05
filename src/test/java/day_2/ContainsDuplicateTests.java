package day_2;

import org.example.algorithms.day_2.ContainsDuplicate;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContainsDuplicateTests {

    @Test
    public void firstTest() {
        Assertions.assertTrue(ContainsDuplicate.containsDuplicateWithSet(new int[] {1,2,3,1}));
    }

    @Test
    public void secondTest() {
        Assertions.assertFalse(ContainsDuplicate.containsDuplicateWithSet(new int[] {1,2,3,4}));
    }

    @Test
    public void thirdTest() {
        Assertions.assertTrue(ContainsDuplicate.containsDuplicateWithSet(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }

    @Test
    public void fourTest() {
        Assertions.assertFalse(ContainsDuplicate.containsDuplicateWithSet(new int[] {}));
    }

    @Test
    public void fiveTest() {
        Assertions.assertFalse(ContainsDuplicate.containsDuplicateWithSet(new int[] {5}));
    }
}
