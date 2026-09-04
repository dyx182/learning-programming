package org.example.algorithms.day_1;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /**
     * Задача 3 — Two Sum.
     * Верни индексы двух чисел, которые в сумме дают target
     * (такая пара гарантированно одна). Пример:
     * twoSum([2, 7, 11, 15], 9) -> [0, 1].
     *
     * Реши двумя способами:
     * 1) вложенный цикл — O(n^2);
     * 2) один проход с HashMap — O(n).
     */
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static int[] twoSumWithHashMap(int[] nums, int target) {
        Map<Integer, Integer> memory = new HashMap<>();
        int searchNum;

        for (int i = 0; i < nums.length; i++) {
            searchNum = target - nums[i];
            if (!memory.containsKey(searchNum)) {
                memory.put(nums[i], i);
            } else {
                return new int[] {memory.get(searchNum), i};
            }
        }
        return null;
    }
}
