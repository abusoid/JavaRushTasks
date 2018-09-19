package com.javarush.task.task13.task1319;

import java.io.*;
import java.util.ArrayList;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String fileName = br.readLine();

        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));

        String text = "";
        while (!"exit".equals(text)) {
            text = br.readLine();
            bw.write(text);
            bw.newLine();


        }
        br.close();
        bw.close();


    }
}
