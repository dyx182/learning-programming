package day_1;

import org.example.algorithms.day_1.TwoSum;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumTests {

    @Test
    public void firstTest() {
        Assertions.assertArrayEquals(new int[] {0, 1}, TwoSum.twoSum(new int[]{2,7,11,15}, 9));
        Assertions.assertArrayEquals(new int[] {0, 1}, TwoSum.twoSumWithHashMap(new int[]{2,7,11,15}, 9));
    }

    @Test
    public void secondTest() {
        Assertions.assertArrayEquals(new int[] {1, 2}, TwoSum.twoSum(new int[]{3,2,4}, 6));
        Assertions.assertArrayEquals(new int[] {1, 2}, TwoSum.twoSumWithHashMap(new int[]{3,2,4}, 6));
    }

    @Test
    public void thirdTest() {
        Assertions.assertArrayEquals(new int[] {0, 1}, TwoSum.twoSum(new int[]{3,3}, 6));
        Assertions.assertArrayEquals(new int[] {0, 1}, TwoSum.twoSumWithHashMap(new int[]{3,3}, 6));
    }

    @Test
    public void fourTest() {
        Assertions.assertArrayEquals(new int[] {0, 2}, TwoSum.twoSum(new int[]{-3,4,3,90}, 0));
        Assertions.assertArrayEquals(new int[] {0, 2}, TwoSum.twoSumWithHashMap(new int[]{-3,4,3,90}, 0));
    }

    @Test
    public void fiveTest() {
        Assertions.assertArrayEquals(new int[] {0, 3}, TwoSum.twoSum(new int[]{5,1,2,6}, 11));
        Assertions.assertArrayEquals(new int[] {0, 3}, TwoSum.twoSumWithHashMap(new int[]{5,1,2,6}, 11));
    }
}
