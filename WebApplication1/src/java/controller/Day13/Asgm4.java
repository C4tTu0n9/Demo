/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day13;

import Model.Node;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm4 {

    static void traverse(Node root, List<String> a1, String s) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            a1.add(s + root.data);
            return;
        }
        traverse(root.left, a1, s + root.data + "->");
        traverse(root.right, a1, s + root.data + "->");
    }

    public static List<String> binaryTreePaths(Node root) {
        List<String> a1 = new ArrayList<>();
        traverse(root, a1, "");
        return a1;
    }
}
