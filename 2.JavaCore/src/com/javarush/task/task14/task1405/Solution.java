package com.javarush.task.task14.task1405;

/* 
Пора покушать
*/

public class Solution {
    public static void main(String[] args) {
        Food food = new Food();
        Selectable selectable = new Food();

        callFoodMethods(food);
        callSelectableMethods(selectable);
    }

    public static void callFoodMethods(Food food) {
        //тут добавьте вызов методов для переменной food
        food.onEat();
        food.onSelect();
    }

    public static void callSelectableMethods(Selectable selectable) {
        //тут добавьте вызов методов для переменной selectable
        selectable.onSelect();
    }

    interface Selectable {
        public default void onSelect() {
            System.out.println("The food was selected");
        }
    }

    static class Food implements Selectable {
        public void onEat() {
            System.out.println("The food was eaten");
        }
    }
}
//1405
//Вы решили задачу лучше, чем 3% учеников.
// Вам удалось ее решить с 4 попытки.
// Среднее количество попыток для этой задачи 1.56.
// Всего эту задачу решили 43363 учеников.