package org.example.algorithms.day_1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {

    /**
     * Задача 2 — Anagram.
     * Верни true, если две строки — анаграммы (одинаковый набор букв с одинаковым
     * количеством, порядок не важен). Пример: "listen"/"silent" -> true,
     * "hello"/"world" -> false.
     *
     * Реши двумя способами:
     * 1) сортировка массива символов;
     * 2) подсчёт частот букв через int[26] или Map<Character, Integer>.
     */
    public static boolean isAnagram(String a, String b) {
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();

        if (arrA.length != arrB.length) {
            return false;
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);

        for (int i = 0; i < arrA.length; i++) {
            if(arrA[i] != arrB[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagramWithMap(String a, String b) {
        char[] arrA = a.toCharArray();
        char[] arrB = b.toCharArray();
        Map<Character, Integer> counts = new HashMap<>();

        if(arrA.length != arrB.length) {
            return false;
        }

        for (int i = 0; i < arrA.length; i++) {
            if (!counts.containsKey(arrA[i])) {
                counts.put(arrA[i], 1);
            } else {
                counts.put(arrA[i], counts.get(arrA[i]) + 1);
            }
        }

        for (int i = 0; i < arrB.length; i++) {
            if (!counts.containsKey(arrB[i])) {
                return false;
            } else {
                counts.put(arrB[i], counts.get(arrB[i]) - 1);
            }
        }

        return counts.values().stream()
                .allMatch(n -> n == 0);
    }
}
