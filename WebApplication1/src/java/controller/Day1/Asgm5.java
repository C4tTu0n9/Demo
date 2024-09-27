/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day1;

/**
 *
 * @author tuong
 */
public class Asgm5 {

    public static boolean isFullOfColors(String sequence) {
        int rCount = 0, gCount = 0, yCount = 0, bCount = 0;

        for (char c : sequence.toCharArray()) {
            switch (c) {
                case 'R':
                    rCount++;
                    break;
                case 'G':
                    gCount++;
                    break;
                case 'Y':
                    yCount++;
                    break;
                case 'B':
                    bCount++;
                    break;
            }

            if (Math.abs(rCount - gCount) > 1 || Math.abs(yCount - bCount) > 1) {
                return false;
            }
        }

        return rCount == gCount && yCount == bCount;
    }
}
