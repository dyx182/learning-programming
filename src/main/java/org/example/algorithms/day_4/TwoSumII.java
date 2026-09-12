package org.example.algorithms.day_4;

import java.util.HashMap;
import java.util.Map;

public class TwoSumII {

    /**
     * Задача — Two Sum II - Input Array Is Sorted.
     * <p>
     * Дан массив numbers, отсортированный по неубыванию (индексация с 1).
     * Найди ДВА числа, которые в сумме дают target, и верни их индексы
     * [index1, index2], где index1 < index2. Решение ровно одно, один и тот же
     * элемент использовать дважды нельзя.
     * <p>
     * Все тест-кейсы (вход -> ожидание):
     * - numbers = [2,7,11,15], target = 9    -> [1,2]
     * - numbers = [2,3,4],     target = 6    -> [1,3]
     * - numbers = [-1,0],      target = -1   -> [1,2]
     * - numbers = [5,25,75],   target = 100  -> [2,3]
     */

    public static int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (numbers[left] + numbers[right] != target) {
            if (numbers[left] + numbers[right] > target) {
                right--;
            } else if (numbers[left] + numbers[right] < target) {
                left++;
            }
        }
        return new int[]{left + 1, right + 1};
    }
}
