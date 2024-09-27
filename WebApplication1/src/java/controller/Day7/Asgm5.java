/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day7;

import controller.Day6.*;
import jakarta.servlet.http.HttpSession;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author tuong
 */
public class Asgm5 {

    public static String myChoice(String str, int choice, String ops) {
        String rs = "";
        switch (choice) {
            case 1:
                rs = myAppend(str, ops);
                break;
            case 2:
                rs = myDelete(str, ops);
                break;
            case 3:
                String print = myPrint(ops);
                return print;
            case 4:
                rs = myUndo();
                break;
            case 5:
                myStack.removeAll(myStack);
                break;
            default:
                return "Invalid operation";

        }
        return rs;
    }

    static Stack<String> myStack = new Stack<>();

    private static String myUndo() {
        if (myStack.isEmpty()) {
            return "Nothing to undo";
        }
        myStack.pop();
        return myStack.isEmpty() ? "" : myStack.peek();
    }

    private static String myPrint(String ops) {
        if (myStack.isEmpty()) {
            return "String is empty";
        }
        String str = myStack.peek();
        if (Integer.parseInt(ops) < 0 || Integer.parseInt(ops) >= str.length() + 1) {
            return "Nothing to print";
        }
        return str.charAt(Integer.parseInt(ops) - 1) + "";
    }

    private static String myDelete(String str, String ops) {
        char[] c = str.toCharArray();
        StringBuilder rs = new StringBuilder();
        for (int j = 0; j < c.length - Integer.parseInt(ops); j++) {
            rs.append(c[j]);
        }
        myStack.push(rs.toString());
        return myStack.peek();
    }

    private static String myAppend(String str, String ops) {
        String ppush = myStack.isEmpty() ? ops : (myStack.peek() + ops);
        myStack.push(ppush);
        return myStack.peek();
    }

}
