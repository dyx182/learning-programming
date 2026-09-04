package day_1;

import org.example.algorithms.day_1.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {

    @Test
    public void simpleNumReturnNum() {
        Assertions.assertEquals("1", FizzBuzz.fizzBuzz(1));
    }

    @Test
    public void returnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
    }

    @Test
    public void enter15returnBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
    }

    @Test
    public void enter30returnBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
    }

    @Test
    public void enter9returnFizz() {
        Assertions.assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
    }

    @Test
    public void enter10returnFizz() {
        Assertions.assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
    }

    @Test
    public void enter0returnBuzz() {
        Assertions.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(0));
    }

    @Test
    public void simpleNumReturnNum7() {
        Assertions.assertEquals("7", FizzBuzz.fizzBuzz(7));
    }
}
