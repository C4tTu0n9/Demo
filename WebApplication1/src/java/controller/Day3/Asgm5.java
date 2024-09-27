/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm5 {

    public static List<Integer> solve(List<Integer> a) {
        int people = 0;
        List<Integer> sum = new ArrayList<>();

        for (int group : a) {
            people += group;
            sum.add(people);
        }

        // gcd cua prefixS
        int gcd = sum.get(0);
        for (int i = 1; i < sum.size(); i++) {
            gcd = getGCD(gcd, sum.get(i));
        }

        // divisors cua totalP
        List<Integer> divs = getDivisors(people);

        // Loc values
        List<Integer> validCapacities = new ArrayList<>();
        for (int div : divs) {
            if (div >= gcd && isValidCapacity(a, div)) {
                validCapacities.add(div);
            }
        }

        return validCapacities;
    }

    private static int getGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getGCD(b, a % b);
    }

    private static List<Integer> getDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisors.add(i);
                if (i != n / i) {
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }

    private static boolean isValidCapacity(List<Integer> groups, int capacity) {
        int currentLoad = 0;
        for (int group : groups) {
            if (currentLoad + group > capacity) {
                if (currentLoad != capacity) {
                    return false;
                }
                currentLoad = 0;
            }
            currentLoad += group;
        }
        return currentLoad == capacity;
    }
}
