/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day6;

import Model.SinglyLinkedListNode;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm4 {

    static boolean hasCycle(SinglyLinkedListNode head) {
        if (head == null) {
            return false;
        }

        SinglyLinkedListNode a = head;
        SinglyLinkedListNode b = head;

        while (b != null && b.next != null) {
            a = a.next;
            b = b.next.next;
            if (a == b) {
                return true;
            }
        }
        return false;
    }
}
