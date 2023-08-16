/*  You are standing in queue to buy the latest Batman movie ticket. You noticed the queue looked like and singly LinkedList. 
    Each person has some amount of money with them, you are bored, and you want to find the amount of money the person is standing at the 'Kth' of the queue from the back.
*/

import java.util.*;
import java.io.*;

/*************************
 * Following is the linked list node class
 * class Node {
 * 
 * int data;
 * Node next;
 * 
 * Node(int val) {
 * this.data = val;
 * next = null;
 * }
 * }
 * 
 ***************/

public class Solution {
    public static int kthMoney(Node head, int k) {
        // Write your code here.
        Node fast = head;
        Node slow = head;

        // Move the fast pointer k nodes ahead
        for (int i = 0; i < k; i++) {
            if (fast == null) {
                return -1; // List has less than k nodes
            }
            fast = fast.next;
        }

        // Move both pointers until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        return slow.data;
    }
}