package day_4;

import org.example.algorithms.day_4.TwoSumII;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TwoSumIITests {

    @Test
    public void classic() {
        Assertions.assertArrayEquals(new int[]{1, 2}, TwoSumII.twoSum(new int[]{2, 7, 11, 15}, 9));
    }

    @Test
    public void notFirstElement() {
        Assertions.assertArrayEquals(new int[]{1, 3}, TwoSumII.twoSum(new int[]{2, 3, 4}, 6));
    }

    @Test
    public void negativeNumbers() {
        Assertions.assertArrayEquals(new int[]{1, 2}, TwoSumII.twoSum(new int[]{-1, 0}, -1));
    }

    @Test
    public void laterPair() {
        Assertions.assertArrayEquals(new int[]{2, 3}, TwoSumII.twoSum(new int[]{5, 25, 75}, 100));
    }
}
