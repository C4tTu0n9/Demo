/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day9;

import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author tuong
 */
public class Asgm5 {

    static ArrayList<Integer> keys = new ArrayList<>();
    static ArrayList<Integer> values = new ArrayList<>();

    public Asgm5() {
        keys = new ArrayList<>();
        values = new ArrayList<>();
    }

    public static void put(int key, int value) {
        if (keys.isEmpty()) {
            keys.add(key);
            values.add(value);
            return;
        }
        for (int i = 0; i < keys.size(); i++) {
            if (keys.get(i) == key) {
                values.set(i, value);
                return;
            }
        }
        keys.add(key);
        values.add(value);
    }

    public static List<String> get(int key) {
        List<String> list = new ArrayList<>();
        list.add("key: " + (key+1) + " value: " + values.get(key));
        return list;
    }

    public static void remove(int key) {
        values.remove(key);
    }

    public static List<String> myList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < keys.size(); i++) {
            list.add("key: " + keys.get(i) + " value: " + values.get(i));
        }
        return list;
    }

}
