package com.javarush.task.task13.task1318;

import java.io.*;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName = br.readLine();
        br.close();

        InputStream inStream = new FileInputStream(fileName);

        char[] data = new char[inStream.available()];

        int i = 0;

        while (inStream.available() > 0)
        {
           data[i] = (char) inStream.read();
           i++;
        }

        inStream.close();

        System.out.println(data);




    }
}