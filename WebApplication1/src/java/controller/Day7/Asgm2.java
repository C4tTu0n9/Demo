/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day7;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author tuong
 */
public class Asgm2 {

    public static int hourglassSum(List<List<Integer>> arr) {
        // 1 2 3 4 5
        // 2 3 4 5 6
        // 4 5 6 7 8
        int i = 0, j = 0;
        int sum = 0;
        int cur = -2147483648;
        List<List<Integer>> ls = new ArrayList<>();
        while (i < arr.size() - 2) {
            sum = 0;
            sum += arr.get(i).get(j);
            sum += arr.get(i).get(j + 1);
            sum += arr.get(i).get(j + 2);
            sum += arr.get(i + 1).get(j + 1);
            sum += arr.get(i + 2).get(j);
            sum += arr.get(i + 2).get(j + 1);
            sum += arr.get(i + 2).get(j + 2);
            cur = Math.max(cur, sum);
            if (j == arr.get(0).size() - 3) {
                i++;
                j = 0;
            } else {
                j++;
            }
        }
        return cur;
    }

}
