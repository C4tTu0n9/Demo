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
public class Asgm1 {

    public static int height(Node root) {
        // Write your code here.
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        int a = height(root.left) + 1;
        int b = height(root.right) + 1;
        return Math.max(a, b);
    }
}
