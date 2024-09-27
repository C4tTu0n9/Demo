/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day5;

import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm2 {

    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        long sum = 0;
        for (Long l : ar) {
            sum += l;
        }
        return sum;
    }

}
