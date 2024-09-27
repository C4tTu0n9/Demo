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
public class Asgm5 {

    public static SinglyLinkedListNode swapPairs(SinglyLinkedListNode head) {
        SinglyLinkedListNode cur = head;
        while(cur != null) {
            SinglyLinkedListNode next = cur.next;
            cur.next = cur.next.next;
            next.next = cur;
            cur = next.next;
        }
        return head;
    }

}
