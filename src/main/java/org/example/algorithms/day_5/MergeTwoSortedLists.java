package org.example.algorithms.day_5;

public class MergeTwoSortedLists {

    /**
     * Задача — Merge Two Sorted Lists.
     *
     * Даны головы (ListNode) двух отсортированных связных списков list1 и list2.
     * Слей их в один отсортированный список, переставляя существующие узлы
     * (не создавая новые). Верни голову объединённого списка.
     *
     * Списки ниже показаны как последовательности значений для краткости
     * (например, [1,2,4] означает 1 -> 2 -> 4).
     *
     * Все тест-кейсы (вход -> ожидание):
     * - [1,2,4] + [1,3,4] -> [1,1,2,3,4,4]
     * - []       + []     -> []
     * - []       + [0]    -> [0]
     * - [1,2,4]  + []     -> [1,2,4]
     * - [2,3]    + [1,5]  -> [1,2,3,5]
     */
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                current.next = list1;
                current = current.next;
                list1 = list1.next;
            } else {
                current.next = list2;
                current = current.next;
                list2 = list2.next;
            }
        }

        if (list1 == null) {
            current.next = list2;
        } else {
            current.next = list1;
        }
        return dummyHead.next;
    }
}
