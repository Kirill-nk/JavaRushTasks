package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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

    public static CanFly result;

    public static void reset() {
        //add your code here - добавьте код тут
        Scanner input = new Scanner(System.in);
        String parametr = input.nextLine();
        if (parametr.equals("helicopter")) {
            result = new Helicopter();
        } else if (parametr.equals("plane")) {
            result = new Plane(0);
        }
    }
}

//1529. Осваивание статического блока
//Вы решили задачу лучше, чем 2% учеников.
//Вам удалось ее решить с 10 попытки.
//Среднее количество попыток для этой задачи 2.18.
//Всего эту задачу решили 36298 учеников.