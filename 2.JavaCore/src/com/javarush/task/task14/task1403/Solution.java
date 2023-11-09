package com.javarush.task.task14.task1403;

/* 
Building и School
*/

public class Solution {

    private static Building shop;
    private static Building school;

    public static void main(String[] args) {
        Building school = getSchool();
        Building shop = getBuilding();

        System.out.println(school);
        System.out.println(shop);
    }

    public static Building getSchool() {
        //измените null на объект класса Building или School
        School school = new School();
        return school;
    }

    public static Building getBuilding() {
        //измените null на объект класса Building или School
        Building shop = new Building();
        return shop;
    }

    static class School extends Building {
        @Override
        public String toString() {
            return "School";
        }
    }

    static class Building /*Добавьте сюда ваш код*/ {
        @Override
        public String toString() {
            return "Building";
        }
    }

}

//1403
//Вы решили задачу лучше, чем 7% учеников.
// Вам удалось ее решить с 2 попытки.
// Среднее количество попыток для этой задачи 1.33.
// Всего эту задачу решили 44609 учеников.