/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day10;

import Model.SinglyLinkedListNode;
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

    public static String twoStrings(String s1, String s2) {
        // Write your code here
        for(int i=0;i<26;i++) {
            if(s1.indexOf(i+'a') != -1 && s2.indexOf(i+'a') != -1) return "YES";
        }
        return "NO";
    }
}
