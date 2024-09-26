/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day1;

/**
 *
 * @author tuong
 */
public class Asgm2 {

    public static String a(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                result += str.charAt(i);
                continue;
            }
            if (!result.contains(str.charAt(i) + "")) {
                result += str.charAt(i);
            }

        }
        return result;
    }
}
