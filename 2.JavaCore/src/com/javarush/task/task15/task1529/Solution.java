package com.javarush.task.task15.task1529;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }
    
    static {
        //add your code here - добавьте код тут
        reset();
    }

    public static Flyable result;

    public static void reset() {
        //add your code here - добавьте код тут
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            String type = br.readLine();
            if (type.equals("helicopter")) {
                result = new Helicopter();
            }
            if (type.equals("plane")) {
                int passengers = Integer.parseInt(br.readLine());
                result = new Plane(passengers);
            }
            br.close();
        }catch (IOException e) {
            e.getMessage();
        }

    }
}
