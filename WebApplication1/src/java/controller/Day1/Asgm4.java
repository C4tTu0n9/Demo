/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm4 {

    public static List<String> myPascalTriangle(int n) {
        List<String> rs = new ArrayList<>();
        String rem = "";
        int[][] arr = new int[n][n];
        arr[0][0] = 1;
        for (int i = 0; i < n; i++) {
            rem="";
            for (int j = 0; j < i + 1; j++) {
                arr[i][j] = factorial(i) / (factorial(j) * factorial(i - j));
                System.out.print(arr[i][j] + " ");
                rem += arr[i][j]+" ";
            }
            rs.add(rem);
            System.out.println();
        }
        return rs;
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
