/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day12;

import Model.SinglyLinkedListNode;

/**
 *
 * @author tuong
 */
public class Asgm1 {

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode llist) {
        // Write your code here
        // n 1 2 3 4 5
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode curr = llist;
        while (curr != null) {
            SinglyLinkedListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
