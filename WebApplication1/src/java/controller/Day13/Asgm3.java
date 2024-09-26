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
public class Asgm3 {
    public static Node lca(Node root, int v1, int v2) {
        // Write your code here.
        while (root != null) {
            if ((root.data > v1 && root.data < v2) || (root.data > v2 && root.data < v1)
                    || root.data == v1 || root.data == v2) {
                return root;
            } else if (root.data > v1) {
                return lca(root.left, v1, v2);
            } else {
                return lca(root.right, v1, v2);
            }
        }
        return root;
    }
}
