/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day8;

import controller.Day7.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm3 {

    public static String pangrams(String s) {
        // Write your code here
        char[] chars = new char[26];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i))) {
                chars[s.charAt(i) - 'a']++;
            } else if (Character.isUpperCase(s.charAt(i))) {
                chars[s.charAt(i) - 'A']++;
            } else if (s.charAt(i) == ' ') {
                continue;
            } else {
                return "not pangram";
            }
        }
        for (int i = 0; i < 26; i++) {
            if (chars[i] == 0) {
                return "not pangram";
            }
        }
        return "pangrams";
    }

}
