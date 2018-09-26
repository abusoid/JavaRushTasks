package com.javarush.task.task14.task1419;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);

        }

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


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            reader.close();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            String s = null;
            s = reader.readLine();
        } catch (Exception e) {
            exceptions.add(e);
        }

        try
        {
            int[] ints = new int[0];
            System.out.println(ints[1]);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            exceptions.add(e);
        }

        try
        {
            Integer integer = (Integer)(new Object());
        } catch (ClassCastException e)
        {
            exceptions.add(e);
        }

        try
        {
            int[] ints = new int[-1];
        } catch (NegativeArraySizeException e)
        {
            exceptions.add(e);
        }

        try
        {
            String s = null;
            s.length();
        } catch (NullPointerException e)
        {
            exceptions.add(e);
        }

        try
        {
            System.out.println(Integer.parseInt("null"));
        } catch (NumberFormatException e)
        {
            exceptions.add(e);
        }

        try
        {
            Class<?> aClass = Class.forName("");
        } catch (ClassNotFoundException e)
        {
            exceptions.add(e);
        }


        try
        {
            FileInputStream fl = new FileInputStream("C:\\TEST.txt");
        } catch (FileNotFoundException e)
        {
            exceptions.add(e);
        }





            //напишите тут ваш код


    }

}