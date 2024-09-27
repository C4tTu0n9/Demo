/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day3;

/**
 *
 * @author tuong
 */
public class Asgm2 {

    public static String printArray(int a, int b, int n) {
        String rs = "";
        int s = (int) (a + Math.pow(2, 0) * b);
        for (int i = 1; i <= n; i++) {
            rs += s + " ";
            s += (int) (Math.pow(2, i) * b);
        }
        return rs;
    }
}
