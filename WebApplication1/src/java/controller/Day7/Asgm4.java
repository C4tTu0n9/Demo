/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day7;

import Model.SinglyLinkedListNode;
import java.util.List;

/**
 *
 * @author tuong
 */
public class Asgm4 {

    /*
    11 2 4
    4 5 6
    10 8 -12

    11+5+ (-12) - (4+5+10)
    = 11 + 5 + (-12) - 4 - 5 - 10
    = (11-4) + (5-5) +[(-12) - 10]
    = 7 + 0 + (-22)
    = - 15
     */
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int sum1 = 0;
        int j = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(i) - arr.get(i).get(arr.get(i).size() - i - 1);
        }
        return Math.abs(sum1);
    }

}
