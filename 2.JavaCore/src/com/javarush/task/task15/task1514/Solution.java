package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
static {
    labels.put(1d, "hoo");
    labels.put(2d, "are");
    labels.put(3d, "yoy");
    labels.put(4d, "super");
    labels.put(5d, "Man");
};


    public static void main(String[] args) {
        System.out.println(labels);
    }
}
//1514
//Вы решили задачу лучше, чем 23% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.46.
//Всего эту задачу решили 40399 учеников.