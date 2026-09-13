package org.example.algorithms.day_5;

public class ReverseLinkedList {

    /**
     * Задача — Reverse Linked List.
     *
     * Дана голова (ListNode) односвязного списка. Разверни список и верни голову
     * развёрнутого списка. Работай с существующими узлами (не создавая новые).
     *
     * Списки ниже показаны как последовательности значений для краткости.
     *
     * ЧЕМУ УЧИТ ЭТА ЗАДАЧА:
     * Тема — работа со ссылками (указателями) в односвязном списке.
     * Ключевой приём — три указателя prev / current / next: идя по списку,
     * ты разворачиваешь каждую ссылку `next` на предыдущий узел, но не теряешь
     * следующий узел (для этого нужен `next`). Это базовый навык для любых
     * операций со связными списками.
     *
     * ГДЕ ИСКАТЬ ТЕОРИЮ: «reverse linked list», «prev current next pointer»,
     * «связный список разворот», «итеративный подход vs рекурсия».
     *
     * ПОДСКАЗКА (не решение):
     * 1) Заведи `prev = null` (развёрнутая часть) и иди по списку через `current`.
     * 2) На каждом шаге: сначала сохрани `next = current.next` (иначе потеряешь
     *    продолжение списка), затем разверни ссылку `current.next = prev`,
     *    потом сдвинь `prev = current` и `current = next`.
     * 3) Когда `current == null` — ты прошёл весь список, голова результата = `prev`.
     * 4) Подумай, что вернуть для пустого списка и списка из одного узла.
     *
     * Все тест-кейсы (вход -> ожидание):
     * - [1,2,3,4,5] -> [5,4,3,2,1]
     * - [1,2]       -> [2,1]
     * - [1]         -> [1]
     * - []          -> []
     */
    public static ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next;
        int count = 1;

        do {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
                count++;
        } while (current != null);
        return prev;
    }
}
