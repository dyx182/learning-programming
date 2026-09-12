package org.example.algorithms.day_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays {

    /**
     * Задача — Intersection of Two Arrays.
     *
     * Даны два массива nums1 и nums2. Верни массив, содержащий элементы,
     * которые встречаются в ОБОИХ массивах. Каждый элемент в результате должен
     * быть уникальным. Порядок результата не важен.
     *
     * Все тест-кейсы (вход -> ожидание, порядок не важен):
     * - nums1 = [1,2,2,1], nums2 = [2,2]       -> [2]
     * - nums1 = [4,9,5],   nums2 = [9,4,9,8,4] -> [9,4]
     * - nums1 = [1,2,3],   nums2 = [4,5]       -> []
     * - nums1 = [],        nums2 = [1,2]       -> []
     * - nums1 = [1,2,2,1], nums2 = [1,2]       -> [1,2]
     */
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> duplicate = new HashSet<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            duplicate.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            if (duplicate.contains(nums2[i])) {
                result.add(nums2[i]);
                duplicate.remove(nums2[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    };

    public static int[] intersectionSet(int[] nums1, int[] nums2) {
        Set<Integer> duplicate = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    duplicate.add(nums1[i]);
                }
            }
        }
        return duplicate.stream().mapToInt(Integer::intValue).toArray();
    }
}
