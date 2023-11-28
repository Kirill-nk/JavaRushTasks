package com.javarush.task.task15.task1502;

/* 
ООП - Наследование животных
*/

public class Solution {
    public static class Goose extends SmallAnimal {
        @Override
        public String getSize() {
            return "Гусь маленький, " + super.getSize();
        }
    }

    public static class Dragon extends BigAnimal {
        @Override
        public String getSize() {
            return "Дракон большой, " + super.getSize();
        }
    }

    public static void main(String[] args) {
        System.out.println(new Dragon().getSize());
        System.out.println(new Goose().getSize());

    }

    public static class BigAnimal {
        protected String getSize() {
            return "как динозавр";
        }
    }

    public static class SmallAnimal {
        String getSize() {
            return "как кошка";
        }
    }
}

//1502
//Вы решили задачу лучше, чем 2% учеников.
// Вам удалось ее решить с 5 попытки.
// Среднее количество попыток для этой задачи 1.63.
// Всего эту задачу решили 41721 учеников.