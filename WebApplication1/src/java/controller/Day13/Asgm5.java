/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day13;

import Model.Node;

/**
 *
 * @author tuong
 */
public class Asgm5 {

    static Node first, mid, last, prev;

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        if (prev != null && root.data < prev.data) {
            if (first == null) {
                first = prev;
                mid = root;
            } else {
                last = root;
            }
        }
        prev = root;
        inorder(root.right);
    }

    public static void recoverTree(Node root) {
        first = last = mid = null;
        prev = new Node(Integer.MIN_VALUE);
        inorder(root);
        if (first != null && last != null) {
            first.data = first.data ^ last.data;
            last.data = first.data ^ last.data;
            first.data = first.data ^ last.data;
        } else if (first != null && mid != null) {
            first.data = first.data ^ mid.data;
            mid.data = first.data ^ mid.data;
            first.data = first.data ^ mid.data;
        }

    }

}
