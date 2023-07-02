package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        grades.put("Александр Сергеевич", 4.9);
        grades.put("Сергей Александрович", 3.9);
        grades.put("Василий Сергеевич", 4.7);
        grades.put("Александр Степанович", 4.3);
        grades.put("Стапан Алекссевич", 4.5);


    }
}
