package com.xiaobai.t4;

import java.util.Stack;

/**
 * @author 江湖人称白玉汤
 * @program 剑指Offer
 * @description 逆序输出链表
 * @create 2020-04-29 18:10
 **/
public class PrintListReversing_Recursively {

    static class ListNode {
        int data;
        ListNode next;
        ListNode(int data) {
            this.data = data;
        }
    }
    public static void main(String[] args) {
        ListNode target = new ListNode(1);
        target.next = new ListNode(2);
        target.next.next = new ListNode(3);
        target.next.next.next = new ListNode(4);
        printListReversing_Recursively(target);
        printListReversing_Stack(target);
    }

    //递归方式
    public static void printListReversing_Recursively(ListNode target) {
        if (target==null) return;
        if (target.next!=null)
            printListReversing_Recursively(target.next);
        System.out.println(target.data);
    }
    //栈
    public static void printListReversing_Stack(ListNode target) {
        if (target==null) return;
        Stack<ListNode> stack = new Stack();
        ListNode tmp = target;
        while (tmp!=null) {
            stack.push(tmp);
            tmp = tmp.next;
        }
        while (!stack.empty()) {
            System.out.println(stack.pop().data);
        }
    }

}
