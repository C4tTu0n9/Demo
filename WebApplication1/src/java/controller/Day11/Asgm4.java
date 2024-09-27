/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day11;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 *
 * @author tuong
 */
public class Asgm4 {

    public static List<Integer> waiter(List<Integer> number, int q) {
        // Write your code here
        int n = 2;
        BigInteger a = new BigInteger(String.valueOf(n));
        Stack<Integer> nInArr = new Stack<>();
        Stack<Integer> nOutArr = new Stack<>();
        List<Integer> result = new ArrayList<>();
        while (q-- > 0) {
            if (a.isProbablePrime(10)) {
                nOutArr.clear();
                for (int j = number.size() - 1; j >= 0;) {
                    if (number.get(j) % a.intValue() == 0) {
                        nInArr.push(number.get(j));
                        number.remove(number.get(j));
                        if (j == number.size()) {
                            j--;
                        }
                    } else if (q != 0) {
                        nOutArr.push(number.get(j));
                        number.remove(number.get(j));
                        j--;
                    } else {
                        j--;
                    }
                }
                number.addAll(nOutArr);
                for (int i = 0; i < nInArr.size(); i++) {
                    result.add(nInArr.pop());
                    i--;
                }
            }
            n++;
            a = new BigInteger(String.valueOf(n));
        }
        result.addAll(number);
        return result;
    }

}
