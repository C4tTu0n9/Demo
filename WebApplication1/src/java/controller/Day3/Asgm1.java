/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day3;

/**
 *
 * @author tuong
 */
public class Asgm1 {

    public static String myCheck(int N) {
        String rs = "";
        if (N % 2 != 0 || (N % 2 == 0 && N >= 6 && N <= 20)) {
            rs = "Weird";
        } else {
            rs = "Not Weird";
        }
//        switch (N % 2) {
//            case 0:
//                switch (N / 21) {
//                    case 0:
//                        switch (N / 6) {
//                            case 0:
//                                System.out.println("Not Weird");
//                                break;
//                            default:
//                                System.out.println("Weird");
//                        }
//                        break;
//                    default:
//                        System.out.println("Not Weird");
//                }
//                break;
//            default:
//                System.out.println("Weird");
//        }
        return rs;
    }
}
