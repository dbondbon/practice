package programmingQuestion;

import java.util.ArrayList;

/**
 * @ClassName PrintListFromTailToHead
 * @Descrcription 输入一个链表，按链表从尾到头的顺序返回一个ArrayList
 * @Author zzc
 * @Date 2019/9/13 11:45
 * @Version 1.0
 */
public class PrintListFromTailToHead {
    public static ArrayList<Integer> PrintListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        ListNode node = listNode;
        if (node == null) {
            return arrayList;
        }
        while (true) {
            arrayList.add(node.val);
            if (node.next == null) {
                break;
            }
            node = node.next;
        }
        int len = arrayList.size();
        int count = len / 2;
        int temp = 0;
        int right = len - 1;
        for (int left = 0; left < count; left++) {
            temp = arrayList.get(left);
            arrayList.set(left, arrayList.get(right));
            arrayList.set(right, temp);
            right--;
        }
        return arrayList;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        ListNode listNode4 = null;
        ArrayList<Integer> arrayList = PrintListFromTailToHead(listNode4);
        System.out.println(arrayList);
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
