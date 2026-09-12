package day_4;

import org.example.algorithms.day_4.IntersectionOfTwoArrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class IntersectionOfTwoArraysTests {

    private static void assertSameSet(int[] expected, int[] actual) {
        Arrays.sort(expected);
        Arrays.sort(actual);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void classic() {
        assertSameSet(new int[]{2}, IntersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{2, 2}));
    }

    @Test
    public void duplicatesInBoth() {
        assertSameSet(new int[]{9, 4}, IntersectionOfTwoArrays.intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4}));
    }

    @Test
    public void noCommon() {
        assertSameSet(new int[]{}, IntersectionOfTwoArrays.intersection(new int[]{1, 2, 3}, new int[]{4, 5}));
    }

    @Test
    public void emptyFirst() {
        assertSameSet(new int[]{}, IntersectionOfTwoArrays.intersection(new int[]{}, new int[]{1, 2}));
    }

    @Test
    public void partialOverlap() {
        assertSameSet(new int[]{1, 2}, IntersectionOfTwoArrays.intersection(new int[]{1, 2, 2, 1}, new int[]{1, 2}));
    }
}
