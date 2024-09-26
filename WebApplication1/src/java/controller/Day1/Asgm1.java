/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Day1;

import java.util.Scanner;

/**
 *
 * @author tuong
 */
public class Asgm1 {

    public static double result(int[][] arr, int limit) {
        double sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[0][i] * Math.pow(limit, arr[1][i] + 1) / (arr[1][i] + 1);
        }
        return sum;
    }

    public static double volume(int[][] arr, int limit) {
        double sum = 0;
        for (int i = 0; i < arr[0].length; i++) {
            sum += arr[0][i] * arr[0][i] * Math.pow(limit, 2 * arr[1][i] + 1) / (2 * arr[1][i] + 1);
        }
        return Math.PI * sum;
    }

    public static double V(int[][] arr) {
        return volume(arr, arr[2][0]) - volume(arr, arr[2][1]);
    }

    public static double A(int[][] arr) {
        return result(arr, arr[2][0]) - result(arr, arr[2][1]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Coefficients: ");
        String[] coefficientsStr = scanner.nextLine().split(" ");
        int[] coefficients = new int[coefficientsStr.length];
        for (int i = 0; i < coefficientsStr.length; i++) {
            coefficients[i] = Integer.parseInt(coefficientsStr[i]);
        }

        System.out.println("Exponents: ");
        String[] exponentsStr = scanner.nextLine().split(" ");
        int[] exponents = new int[exponentsStr.length];
        for (int i = 0; i < exponentsStr.length; i++) {
            exponents[i] = Integer.parseInt(exponentsStr[i]);
        }

        System.out.println("Limits: ");
        String[] limitsStr = scanner.nextLine().split(" ");
        int[] limits = new int[limitsStr.length];
        for (int i = 0; i < limitsStr.length; i++) {
            limits[i] = Integer.parseInt(limitsStr[i]);
        }

        int[][] arr = {coefficients, exponents, limits};
        System.out.println("S: " + A(arr));
        System.out.println("V: " + V(arr));
    }

}
