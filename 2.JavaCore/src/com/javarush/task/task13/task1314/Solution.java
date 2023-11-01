package com.javarush.task.task13.task1314;

import java.awt.*;

/* 
Большая лисица — это такая лисица
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        Fox bigFox = new BigFox() {
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

    public static abstract class Fox implements Animal {
        public String getName(){
            return "Fox";
        }
    }

    public static abstract class BigFox extends Fox {
        public Color Color() {
            return Color.GRAY;
        }
    }

}

//1314
//Вы решили задачу лучше, чем 17% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.48.
//Всего эту задачу решили 46368 учеников.