package com.itheilv.leetcode.linkedlist.easy;

import com.itheilv.leetcode.linkedlist.model.ListNode;

/**
 * @author WSQ
 * @since 2020-09-10
 * 删除链表中等于给定值 val 的所有节点。
 */
public class Solution203 {

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        head.next = removeElements(head.next, val);
        if (head.val == val) {
            return head.next;
        } else {
            return head;
        }
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(5);
        ListNode result = removeElements(listNode, 5);
        System.out.println(result);
    }
}
