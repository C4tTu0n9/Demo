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
public class Asgm2 {

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        if (head1 == null || head2 == null) {
            return head1;
        }
        SinglyLinkedListNode current = null;
        if (head1.data <= head2.data) {
            current = head1;
            head1 = head1.next;
        } else {
            current = head2;
            head2 = head2.next;
        }
        SinglyLinkedListNode myHead = current;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                current.next = head1;
                current = head1;
                head1 = head1.next;
            } else {
                current.next = head2;
                current = head2;
                head2 = head2.next;
            }
        }
        if (head1 != null) {
            current.next = head1;
        } else if (head2 != null) {
            current.next = head2;
        }

        return myHead;
    }
}
