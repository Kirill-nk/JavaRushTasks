package com.javarush.task.pro.task17.task1706;

/* 
Хищники vs Травоядные
*/

public class Solution {
    public static void main(String[] args) {
        printRation(new Cow());
        printRation(new Lion());
        printRation(new Elephant());
        printRation(new Wolf());
    }

    public static void printRation(Animal animal){
        String herbivore = "Любит траву";
        String predator = "Любит мясо";

        if (animal instanceof Cow) {
            System.out.println(herbivore);
        } else if (animal instanceof Elephant) {
            System.out.println(herbivore);
        } else if (animal instanceof Lion) {
            System.out.println(predator);
        } else if (animal instanceof Wolf) {
            System.out.println(predator);
        }

    }
}
//1706
//Вы решили задачу лучше, чем 7% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.11.
// Всего эту задачу решили 8825 учеников.