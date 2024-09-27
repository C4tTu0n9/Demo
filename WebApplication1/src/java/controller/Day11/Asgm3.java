/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day11;

import java.util.ArrayList;
import java.util.List;
import model.DoublyLinkedListNode;

/**
 *
 * @author tuong
 */
public class Asgm3 {

    public static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode llist, int data) {
        // Write your code here
        if (llist == null) {
            llist = new DoublyLinkedListNode(data);
            return llist;
        }
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        if (llist.data >= data) {
            newNode.next = llist;
            llist.prev = newNode;
            return newNode;
        }
        DoublyLinkedListNode current = llist;
        while (true) {
            if (current.data > data) {
                newNode.next = current;
                current.prev.next = newNode;
                newNode.prev = current.prev;
                current.prev = newNode;
                break;
            }
            if (current.next == null) {
                current.next = newNode;
                newNode.prev = current;
                break;
            }
            current = current.next;
        }
        return llist;
    }
}
