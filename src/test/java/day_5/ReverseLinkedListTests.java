package day_5;

import org.example.algorithms.day_5.ListNode;
import org.example.algorithms.day_5.ReverseLinkedList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedListTests {

    private static ListNode list(int... vals) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for (int v : vals) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    private static int[] toArray(ListNode head) {
        List<Integer> values = new ArrayList<>();
        while (head != null) {
            values.add(head.val);
            head = head.next;
        }
        return values.stream().mapToInt(Integer::intValue).toArray();
    }

    @Test
    public void classic() {
        ListNode result = ReverseLinkedList.reverseList(list(1, 2, 3, 4, 5));
        Assertions.assertArrayEquals(new int[]{5, 4, 3, 2, 1}, toArray(result));
    }

    @Test
    public void twoNodes() {
        ListNode result = ReverseLinkedList.reverseList(list(1, 2));
        Assertions.assertArrayEquals(new int[]{2, 1}, toArray(result));
    }

    @Test
    public void singleNode() {
        ListNode result = ReverseLinkedList.reverseList(list(1));
        Assertions.assertArrayEquals(new int[]{1}, toArray(result));
    }

    @Test
    public void emptyList() {
        Assertions.assertNull(ReverseLinkedList.reverseList(list()));
    }
}
