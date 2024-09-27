/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day12;

import java.util.LinkedList;


/**
 *
 * @author tuong
 */
public class Asgm3 {

    public static int lastRemaining(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        n = n % 2 == 0 ? n : (n - 1);
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 2; i <= n; i += 2) {
            list.add(i);
        }
        int i = list.size() - 1;
        boolean toLast = true;
        while (list.size() != 1) {
            if (toLast == true) {
                for (int j = list.size() - 1; j >= 0; j -= 2) {
                    list.remove(j);
                }
                toLast = false;
            }
            if (list.size() == 1) {
                break;
            }
            if (toLast == false) {
                for (int j = 0; j < list.size(); j += 2) {
                    list.remove(j);
                    j--;
                }
                toLast = true;
            }
        }
        return list.get(0);
    }
}
