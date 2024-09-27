/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day4;

import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm2 {

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < ar.size(); i++) {
            sum += ar.get(i);
        }
        return sum;
    }
}
