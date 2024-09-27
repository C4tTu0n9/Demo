/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day2;

import java.util.Scanner;

/**
 *
 * @author tuong
 */
public class Asgm1 {

    public static long strangeGrid(int r, int c) {
        // Write your code here
        return 2 * (5 * (((long) r - 1) / 2)) + 2 * ((long) c - 1) + ((r + 1) % 2);
    }

}
