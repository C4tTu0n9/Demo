/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day8;

import controller.Day7.*;
import controller.Day6.*;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author tuong
 */
public class Asgm5 {

    public static int commonChild(String s1, String s2) {
        // Write your code here
        Map<Integer, ArrayList<Integer>> map = new HashMap<>(s1.length());
        Map<Integer, int[]> res = new HashMap<>(s1.length());
        boolean ld = false;
        int[] a = new int[2];
        a[0] = 0;
        a[1] = -1;
        res.put(1, a);
        int maxNum = 1;
        for (int i = 0; i < s1.length(); i++) {
            if (!map.containsKey((int) s1.charAt(i))) {
                map.put((int) s1.charAt(i), new ArrayList<>());
            }
            map.get((int) s1.charAt(i)).add(i);
        }
        for (int i = 0; i < s2.length(); i++) {
            if (map.containsKey((int) s2.charAt(i))) {
                for (int j = maxNum; j > 0; j--) {
                    int val = res.get(j)[1];
                    int pre = res.get(j)[0];
                    for (int tmp : map.get((int) s2.charAt(i))) {
                        if (tmp > val) {
                            int[] b = new int[2];
                            b[0] = val;
                            b[1] = tmp;
                            if (ld == false) {
                                ld = true;
                                res.put(maxNum, b);
                            } else {
                                if (j == maxNum) {
                                    res.put(j + 1, b);
                                    maxNum++;
                                } else {
                                    if (res.get(j + 1)[1] > tmp) {
                                        res.put(j + 1, b);
                                    }
                                }
                            }
                            break;
                        } else {
                            if (tmp > pre && tmp < res.get(j)[1]) {
                                res.get(j)[1] = tmp;
                            }
                        }
                    }
                }
            }
        }
        if (ld == false) {
            maxNum--;
        }
        return maxNum;
    }

}
