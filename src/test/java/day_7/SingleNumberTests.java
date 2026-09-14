package day_7;

import org.example.algorithms.day_7.SingleNumber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleNumberTests {

    @Test
    public void classic() {
        Assertions.assertEquals(1, SingleNumber.singleNumber(new int[]{2, 2, 1}));
    }

    @Test
    public void singleInMiddle() {
        Assertions.assertEquals(4, SingleNumber.singleNumber(new int[]{4, 1, 2, 1, 2}));
    }

    @Test
    public void singleElement() {
        Assertions.assertEquals(1, SingleNumber.singleNumber(new int[]{1}));
    }

    @Test
    public void singleZero() {
        Assertions.assertEquals(0, SingleNumber.singleNumber(new int[]{0}));
    }
}
