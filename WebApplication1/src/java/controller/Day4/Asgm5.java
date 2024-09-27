/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day4;

import java.math.BigInteger;

/**
 *
 * @author tuong
 */
public class Asgm5 {

    public static String solve(String A) {
        BigInteger nPrim = new BigInteger(A);
        //certainly cang cao thi do chinh xac cang lon, runtime cang lau
        boolean check = nPrim.isProbablePrime(10);
        return check?"prime":"not prime";
    }
}
