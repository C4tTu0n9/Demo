/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day13;

import Model.Node;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author tuong
 */
public class Asgm2 {

    public static List<Integer> levelOrder(Node root) {
        List<Integer> rs = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
//            Node cur = q.peek();
//            System.out.print(cur.data + " ");
//            q.remove();
            Node cur = q.poll(); // poll is peek and remove
            rs.add(cur.data);
            if (cur.left != null) {
                q.add(cur.left);
            }
            if (cur.right != null) {
                q.add(cur.right);
            }
        }
        return rs;
    }
}
