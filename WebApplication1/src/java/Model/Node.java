/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author tuong
 */
public class Node {

    public Node left;
    public Node right;
    public int data;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
