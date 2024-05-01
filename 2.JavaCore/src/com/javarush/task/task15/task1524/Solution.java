package com.javarush.task.task15.task1524;

/* 
Порядок загрузки переменных
*/

public class Solution {
    static {
        init();
    }

    public static void init() {
        System.out.println("static void init()");
    }

    static {
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        System.out.println("public static void main");
        Solution s = new Solution();
    }

    {
        System.out.println("Non-static block");
        printAllFields(this);
    }

    public static void printAllFields(Solution obj) {
        System.out.println("static void printAllFields");
        System.out.println(obj.i);
        System.out.println(obj.name);
    }

    public int i = 6;

    public Solution() {
        System.out.println("Solution constructor");
        printAllFields(this);
    }

    public String name = "First name";
}

//1524. Порядок загрузки переменных
//Вы решили задачу лучше, чем 4% учеников. Вам удалось ее решить с 2 попытки. Среднее количество попыток для этой задачи 1.22. Всего эту задачу решили 36189 учеников.