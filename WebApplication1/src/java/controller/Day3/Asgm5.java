/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm5 {

    public static String solve(String A) {
        int begin = 0;
        int end = A.length() - 1;
        boolean check2 = true;
        while (begin <= end) {
            if (A.charAt(begin) != A.charAt(end)) {
                check2 = false;
            }
            begin++;
            end--;
        }
        return check2 ? "Yes" : "No";
    }
}
