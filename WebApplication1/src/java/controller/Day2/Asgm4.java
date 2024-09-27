/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm4 {

    private static final long MOD = (long) (Math.pow(10, 9) + 7);

    public static long summingSeries(long n) {
        long result = n % MOD;
        result = (result * result) % MOD;
        return result;
    }
}
