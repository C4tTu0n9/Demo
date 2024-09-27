/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuong
 */

public class SinglyLinkedListNode {
    public int data;
    public SinglyLinkedListNode next;
    public SinglyLinkedListNode(int data) {
        this.data = data;
    }
    public SinglyLinkedListNode(int data, SinglyLinkedListNode next) {
        this.data = data;
        this.next = next;
    }
}

