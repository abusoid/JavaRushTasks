package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String fileName = br.readLine();
            br.close();

        ArrayList<Integer> array = new ArrayList<>();
        BufferedReader fileReader = new BufferedReader((new InputStreamReader(new FileInputStream(fileName))));
        while (fileReader.ready()) {
            array.add(Integer.parseInt(fileReader.readLine()));
        }
        fileReader.close();
        Collections.sort(array);

        for (int i = 0; i < array.size(); i++) {
            if ((array.get(i)%2) == 0) {
                System.out.println(array.get(i));
            }
        }
    }
}
