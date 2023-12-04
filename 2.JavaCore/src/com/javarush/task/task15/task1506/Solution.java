package com.javarush.task.task15.task1506;

/* 
Что-то лишнее
*/

public class Solution {
    public static void main(String[] args) {
        print((short) 1); //Почему Шорт падает сразу в максималку double?
        print((Number) 1);
        print(1);
        print((Integer) 1);
        print((int) 1);
    }

    public static void print(Integer i) {   //4
        System.out.println("Это Integer");  //4
    }                                       //4

//    public static void print(int i) {
//        System.out.println("Это Integer");
//    }

//    public static void print(Short i) {
//        System.out.println("Это Object");
//    }

    public static void print(Object i) {  //2
        System.out.println("Это Object"); //2
    }                                     //2

    public static void print(double i) {  //1,5
        System.out.println("Это double");  //1,5
    }                                       //1,5

    public static void print(Double i) {
        System.out.println("Это double");
    }

//    public static void print(float i) {      //3
//        System.out.println("Это Double");    //3
//    }                                        //3
}
//1506
//Вы решили задачу лучше, чем 13% учеников.
// Вам удалось ее решить с 2 попытки.
// Среднее количество попыток для этой задачи 1.64.
// Всего эту задачу решили 40996 учеников.