package com.javarush.task.task13.task1325;

import java.awt.*;

/* 
Компиляция программы
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new Fox() {
            @Override
            public Color getColor() {
                return null;
            }
        };
        System.out.println(bigFox.getName());
        System.out.println(bigFox.getColor());
    }

    public interface Animal {
        Color getColor();
    }

    public abstract static class Fox implements Animal {
        public String getName() {
            return "Fox";
        }
    }

    public abstract static class BigFox extends Fox {
    }
}
//1325
//Вы решили задачу лучше, чем 38% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.93.
// Всего эту задачу решили 43194 учеников.