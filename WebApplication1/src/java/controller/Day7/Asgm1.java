/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day7;

import controller.Day6.*;
import Model.SinglyLinkedListNode;
import controller.Day5.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author tuong
 */
public class Asgm1 {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        // Write your code here
//        for(int i = 0; i < arr.size()-1; i++){
//            int temp = arr.get(i);
//            arr.set(i, arr.get(i+1));
//            arr.set(i+1, temp);
//        }
//        return arr;

        Integer[] temp = new Integer[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            temp[(arr.size() + i - d) % arr.size()] = arr.get(i);
        }
        arr = new ArrayList<>(Arrays.asList(temp));
        return arr;
    }
}
