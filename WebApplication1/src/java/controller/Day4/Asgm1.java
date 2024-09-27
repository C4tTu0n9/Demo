/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day4;

/**
 *
 * @author tuong
 */
public class Asgm1 {

    public static int camelcase(String s) {
        // Write your code here
        if (s.isEmpty()) {
            return 0;
        }
        int begin = 1;
        int end = s.length() - 1;
        int count = 1;
        while (begin <= end) {
            if (begin == end) {
                if (isUpperCase(s.charAt(begin))) {
                    count++;
                    break;
                }
            }
            if (isUpperCase(s.charAt(begin++))) {
                count++;
            }
            if (isUpperCase(s.charAt(end--))) {
                count++;
            }
        }
        return count;
    }

    public static boolean isUpperCase(char s) {
        return (s >= 'A' && s <= 'Z');
    }
}
