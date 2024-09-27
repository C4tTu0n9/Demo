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
public class Asgm3 {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int count = 0;
        int max = 0;
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                max = candles.get(i);
                count = 1;
            } else if (candles.get(i) == max) {
                count++;
            } else {
                continue;
            }
        }
        return count;
    }

}
