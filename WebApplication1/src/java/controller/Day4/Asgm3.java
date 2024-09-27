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
public class Asgm3 {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        }
        if (a.equalsIgnoreCase(b)) {
            return true;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();
        int[] count = new int[26];
        for (char c : a.toCharArray()) {
            count[c - 'a']++;
        }
        for (char c : b.toCharArray()) {
            count[c - 'a']--;
        }
        for (int i : count) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
