/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm4 {

    public static String[] staircase(int n) {
        // Write your code here
        String[] rs = new String[n];
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= n - i - 1; j--) {
                arr[i][j] = 1;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 1) {
                    rs[i] += "#";
                } else {
                    rs[i] += " ";
                }
            }
        }
        return rs;
    }

}
