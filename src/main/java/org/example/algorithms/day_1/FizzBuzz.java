package org.example.algorithms.day_1;

public class FizzBuzz {

    /**
     * Задача 1 — FizzBuzz.
     * Верни:
     * - "Fizz" если n делится на 3;
     * - "Buzz" если n делится на 5;
     * - "FizzBuzz" если n делится на 3 и на 5 (т.е. на 15);
     * - иначе строковое представление самого числа.
     */

    public static String fizzBuzz(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz";
        } else if (n % 3 == 0) {
            return "Fizz";
        } else if (n % 5 == 0) {
            return "Buzz";
        } else {
            return String.valueOf(n);
        }
    }
}
