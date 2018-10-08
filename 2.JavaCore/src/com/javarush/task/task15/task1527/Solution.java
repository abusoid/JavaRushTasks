package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String url = reader.readLine(); //считываем url
            reader.close(); //закрываем поток
            String subStr;  //объявляем переменную подстроки параметров
            String objVal = null;//объявляем переменную на случай, если будет объект obj
            ArrayList<String> parametrs = new ArrayList<>();//лист параметров
            subStr = url.substring(url.indexOf("?") + 1); //Урезаем строку до начала параметров

            for (String elements : subStr.split("&")) { //Делим все параметры на отдельные элементы
                parametrs.add(elements);
            }

            for (int i = 0; i < parametrs.size(); i++) {//Проходим весь лист параметров

                if (parametrs.get(i).contains("obj")) {//Если есть параметр obj сохраняем его в отдельную переменную
                    objVal = parametrs.get(i);
                }

                if (parametrs.get(i).contains("=")) {//Убираем из параметров их значения и оставляем только названия
                    parametrs.set(i, parametrs.get(i).substring(0, parametrs.get(i).indexOf("=")));
                }

                System.out.print(parametrs.get(i) + " ");//Выводим список параметров
            }

            System.out.println();//Переходим на следующую строчку

            for (int i = 0; i < parametrs.size(); i++) {//Пробуем перевести параметр obj к Double

                if (parametrs.get(i).contains("obj")) {//Проверка наличия параметра obj
                    objVal = objVal.substring(objVal.indexOf("=") + 1, objVal.length());//Урезаем название параметра оставляя только значение
                    try {
                        alert(Double.parseDouble(objVal));//попытка перевести в double
                        continue;
                    } catch (Exception e) {
                        e.getMessage();
                    }
                    alert(objVal);//вывод obj
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
