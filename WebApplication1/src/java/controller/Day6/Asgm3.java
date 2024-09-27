/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author tuong
 */
public class Asgm3 {

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        // Write your code here
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < stringList.size(); i++) {
            map.put(stringList.get(i), map.getOrDefault(stringList.get(i), 0) + 1);
        }
        List<Integer> matchingStrings = new ArrayList<>();
        for (int i = 0; i < queries.size(); i++) {
            matchingStrings.add(map.getOrDefault(queries.get(i), 0));
        }
        return matchingStrings;
    }

}
