package day_3;

import org.example.algorithms.day_3.MoveZeroes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoveZeroesTests {

    @Test
    public void classic() {
        int[] input = {0, 1, 0, 3, 12};
        MoveZeroes.moveZeroes(input);
        Assertions.assertArrayEquals(new int[]{1, 3, 12, 0, 0}, input);
    }

    @Test
    public void manyZeros() {
        int[] input = {1, 0, 0, 2, 0, 3, 0};
        MoveZeroes.moveZeroes(input);
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0, 0}, input);
    }

    @Test
    public void zerosFirst() {
        int[] input = {0, 0, 1};
        MoveZeroes.moveZeroes(input);
        Assertions.assertArrayEquals(new int[]{1, 0, 0}, input);
    }

    @Test
    public void noZeros() {
        int[] input = {1, 2, 3};
        MoveZeroes.moveZeroes(input);
        Assertions.assertArrayEquals(new int[]{1, 2, 3}, input);
    }

    @Test
    public void onlyZeros() {
        int[] input = {0, 0, 0};
        MoveZeroes.moveZeroes(input);
        Assertions.assertArrayEquals(new int[]{0, 0, 0}, input);
    }

    @Test
    public void singleZero() {
        int[] input = {0};
        MoveZeroes.moveZeroes(input);
        Assertions.assertArrayEquals(new int[]{0}, input);
    }

    @Test
    public void empty() {
        int[] input = {};
        MoveZeroes.moveZeroes(input);
        Assertions.assertArrayEquals(new int[]{}, input);
    }
}
