package day_5;

import org.example.algorithms.day_5.ListNode;
import org.example.algorithms.day_5.MergeTwoSortedLists;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedListsTests {

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
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list(1, 2, 4), list(1, 3, 4));
        Assertions.assertArrayEquals(new int[]{1, 1, 2, 3, 4, 4}, toArray(result));
    }

    @Test
    public void bothEmpty() {
        Assertions.assertNull(MergeTwoSortedLists.mergeTwoLists(list(), list()));
    }

    @Test
    public void oneEmptyOtherSingle() {
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list(), list(0));
        Assertions.assertArrayEquals(new int[]{0}, toArray(result));
    }

    @Test
    public void secondEmpty() {
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list(1, 2, 4), list());
        Assertions.assertArrayEquals(new int[]{1, 2, 4}, toArray(result));
    }

    @Test
    public void interleaved() {
        ListNode result = MergeTwoSortedLists.mergeTwoLists(list(2, 3), list(1, 5));
        Assertions.assertArrayEquals(new int[]{1, 2, 3, 5}, toArray(result));
    }
}
