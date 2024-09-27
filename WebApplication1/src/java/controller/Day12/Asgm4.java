/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day12;


/**
 *
 * @author tuong
 */
public class Asgm4 {

    public static boolean isPowerOfFour(int n) {
        if (n == 1) {
            return true;
        }
        if (n == 0) {
            return false;
        }
        return isPowerOfFour(n / 4) && n % 4 == 0;
    }

}
