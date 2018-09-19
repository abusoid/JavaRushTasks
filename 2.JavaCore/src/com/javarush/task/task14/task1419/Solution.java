package com.javarush.task.task14.task1419;

import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        /*initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);

        }*/
        System.out.println((3 * 0.6 - 2 * (-0.24))/(2 * 0.6 + 3 * (-0.24)));
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String a = "";
            a.charAt(10);
        } catch (IndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            int i = 1;
            int b = i / 0;
        } catch (ArithmeticException e) {
        exceptions.add(e);
        }









        //напишите тут ваш код

    }
}
