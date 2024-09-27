/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm3 {

    public static int myNum(int num, int times) {
//        for (int i = 0; i < times - 1; i++) {
//            a += String.valueOf(num);
//        }

        int rs = totalInNum(num) * times;
        return result(rs);
    }

    public static int result(int num) {
        if (num / 10 == 0) {
            return num;
        }
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        if (list.size() == 1) {
            return list.get(0);
        } else {
            int sum = 0;
            for (int i = 0; i < list.size(); i++) {
                sum += list.get(i);
            }
            return result(sum);
        }
    }

    public static int totalInNum(int num) {
        if (num / 10 == 0) {
            return num;
        }
        List<Integer> list = new ArrayList<>();
        while (num > 0) {
            list.add(num % 10);
            num /= 10;
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
    }

}
