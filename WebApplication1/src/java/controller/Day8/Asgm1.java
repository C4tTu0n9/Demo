/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day8;

import controller.Day7.*;
import controller.Day6.*;
import Model.SinglyLinkedListNode;
import controller.Day5.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tuong
 */
public class Asgm1 {

    public static String superReducedString(String s) {
        // Write your code here
        //abba
        String rs = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (i < 0) {
                i = 0;
            }
            if (s.isEmpty()) {
                break;
            }
            if (s.charAt(i) == s.charAt(i + 1)) {
                rs = "";
                rs += s.charAt(i);
                rs += (s.charAt(i + 1));
                i -= 2;
            }
            s = s.replace(rs, "");
        }
        return s.isEmpty() ? "Empty String" : s;
    }
}
