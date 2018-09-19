package com.javarush.task.task12.task1210;

/* 
Три метода и максимум
*/

public class Solution {
    public static void main(String[] args) {

    }

    public static int max(int a, int b) {
        int max;
        if (a >= b) {
            max = a;
        }else {
            max = b;
        }
        return max;
    }

    public static long max(long a,long b) {
        long max;
        if (a >= b) {
            max = a;
        }else {
            max = b;
        }
        return max;
    }

    public static double max(double a, double b) {
        double max;
        if (a >= b) {
            max = a;
        }else {
            max = b;
        }
        return max;
    }
}
