/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm3 {

    public static String solve(int n) {
        // Write your code here
        int c = 1;
        while (true) {
            String str = Integer.toBinaryString(c);
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    b.append("9");
                } else {
                    b.append("0");
                }
            }
            long res = Long.parseLong(b.toString());
            if (res % n == 0) {
                return b.toString();
            } else {
                c++;
            }
        }
    }
}
