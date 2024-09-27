/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm4 {

    interface PerformOperation {

        boolean check(int a);
    }

    static class MyMath {

        public static boolean checker(PerformOperation p, int num) {
            return p.check(num);
        }

        // Write your code here
        public PerformOperation isOdd() {
            return n -> n % 2 != 0;
        }

        public PerformOperation isPrime() {
            return n -> {
                if (n < 2) {
                    return false;
                }
                for (int i = 2; i <= Math.sqrt(n); i++) {
                    if (n % i == 0) {
                        return false;
                    }
                }
                return true;
            };
        }

        public PerformOperation isPalindrome() {
            return n -> {
                String str = Integer.toString(n);
                return str.contentEquals(new StringBuilder(str).reverse());
            };
        }
    }
    static boolean ret = false;

    public static String myCheck(int ch, int n2) {

        MyMath ob = new MyMath();
        PerformOperation op;
        boolean ret = false;
        String ans = null;
        if (ch == 1) {
            op = ob.isOdd();
            ret = ob.checker(op, n2);
            ans = (ret) ? "ODD" : "EVEN";
        } else if (ch == 2) {
            op = ob.isPrime();
            ret = ob.checker(op, n2);
            ans = (ret) ? "PRIME" : "COMPOSITE";
        } else if (ch == 3) {
            op = ob.isPalindrome();
            ret = ob.checker(op, n2);
            ans = (ret) ? "PALINDROME" : "NOT PALINDROME";
        }
        return ans;
    }
}
