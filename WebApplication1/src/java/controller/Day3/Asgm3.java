/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm3 {

    public static List<String> myPrintt(int num) {
        List<String> rs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            rs.add(num + " x " + (i+1) + " = " + num * (i+1));
        }
        return rs;
    }
}
