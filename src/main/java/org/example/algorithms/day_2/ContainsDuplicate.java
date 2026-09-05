package org.example.algorithms.day_2;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * Задача 2 — Contains Duplicate.
     *
     * Верни true, если в массиве целых чисел (int[]) любое значение встречается
     * минимум дважды, иначе false.
     *
     * Краевые случаи:
     * - пустой массив [] -> false;
     * - массив из одного элемента [5] -> false;
     * - значения НЕ отсортированы, дубликаты могут быть несмежными.
     *
     * Примеры:
     * - [1,2,3,1] -> true;
     * - [1,2,3,4] -> false;
     * - [1,1,1,3,3,4,3,2,4,2] -> true.
     */
    public static boolean containsDuplicateWithSet(int[] nums) {

        Set<Integer> noDuplicate = new HashSet<>();

        if (nums.length < 2) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            noDuplicate.add(nums[i]);
        }

        if (noDuplicate.size() != nums.length) {
            return true;
        }

        return false;
    }

    /**
     * Альтернативный подход: вложенный цикл (O(n^2)) либо сортировка + сравнение
     * соседних элементов (O(n log n)).
     */
    public static boolean containsDuplicateBruteForce(int[] nums) {
        return false;
    }
}
