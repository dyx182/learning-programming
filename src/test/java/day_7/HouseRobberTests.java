package day_7;

import org.example.algorithms.day_7.HouseRobber;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HouseRobberTests {

    @Test
    public void classic() {
        Assertions.assertEquals(4, HouseRobber.rob(new int[]{1, 2, 3, 1}));
    }

    @Test
    public void differentGap() {
        Assertions.assertEquals(12, HouseRobber.rob(new int[]{2, 7, 9, 3, 1}));
    }

    @Test
    public void twoByTwo() {
        Assertions.assertEquals(4, HouseRobber.rob(new int[]{2, 1, 1, 2}));
    }

    @Test
    public void skipMiddle() {
        Assertions.assertEquals(16, HouseRobber.rob(new int[]{5, 3, 4, 11, 2}));
    }

    @Test
    public void singleHouse() {
        Assertions.assertEquals(1, HouseRobber.rob(new int[]{1}));
    }

    @Test
    public void empty() {
        Assertions.assertEquals(0, HouseRobber.rob(new int[]{}));
    }

    @Test
    public void zeroHouse() {
        Assertions.assertEquals(0, HouseRobber.rob(new int[]{0}));
    }
}
