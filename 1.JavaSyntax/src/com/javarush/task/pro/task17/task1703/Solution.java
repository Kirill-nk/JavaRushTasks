package com.javarush.task.pro.task17.task1703;

import java.util.ArrayList;
import java.util.Collection;

/* 
Космическая одиссея ч.1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew() {
        Human human1 = new Human();
        Human human2 = new Human();
        Cat cat = new Cat();
        Dog dog = new Dog();
        astronauts.add(0, human1);
        astronauts.add(1, human2);
        astronauts.add(2, cat);
        astronauts.add(3, dog);

    }

    public static void printCrewInfo() {
        System.out.println("На борт погружены члены экипажа: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
//1703
//Вы решили задачу лучше, чем 7% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.37.
//Всего эту задачу решили 9055 учеников.