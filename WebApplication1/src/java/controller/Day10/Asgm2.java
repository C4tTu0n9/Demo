/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day10;

import controller.Day9.*;
import controller.Day8.*;
import controller.Day7.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm2 {

    public static int stringConstruction(String s) {
        // Write your code here
        if (s.isEmpty()) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        int count = 0;
        int[] chars = new int[26];
        for (int i = 0; i < s.length(); i++) {
            chars[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (chars[i] != 0) {
                count++;
            }
        }
        return count;
    }

}
