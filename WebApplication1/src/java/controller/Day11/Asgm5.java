/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day11;

import model.DoublyLinkedListNode;

/**
 *
 * @author tuong
 */
public class Asgm5 {

    public static DoublyLinkedListNode reverse(DoublyLinkedListNode llist) {
        // Write your code here
        //1 - 2 - 3 - 4
        if (llist == null) {
            return null;
        }
        DoublyLinkedListNode rem = llist.prev;
        llist.prev = llist.next;
        llist.next = rem;
        if (llist.prev == null) {
            return llist;
        }
        return reverse(llist.prev);
    }

}
