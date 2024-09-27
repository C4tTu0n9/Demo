/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day5;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm5 {

    public static String bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        String rs = "";
        int sum = 0;
        for (int i = 0; i < bill.size(); i++) {
            if (i == k) {
                continue;
            }
            sum += bill.get(i);
        }
        if (sum / 2 != b) {
            rs = b - sum / 2 + "";
        } else {
            rs = "Bon Appetit";
        }
        return rs;
    }

}
