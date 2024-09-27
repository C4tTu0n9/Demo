/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day9;

import controller.Day8.*;
import controller.Day7.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm2 {

    public static String caesarCipher(String s, int k) {
        // Write your code here
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (Character.isLowerCase(c)) {
                    c -= 'a';
                    c += k;
                    c = (char) (c % 26 + 97);
                } else if (Character.isUpperCase(c)) {
                    c -= 'A';
                    c += k;
                    c = (char) (c % 26 + 65);
                }
            }
            res.append(c);
        }
        return res.toString();
    }

}
