/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day9;

import Model.SinglyLinkedListNode;
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

    public static String myStringQuery(List<Integer> list, int query) {
        if(query >= list.size() || query <= 0){
            return "ERROR!";
        }
        return list.get(query-1).toString();
        
    }
}
