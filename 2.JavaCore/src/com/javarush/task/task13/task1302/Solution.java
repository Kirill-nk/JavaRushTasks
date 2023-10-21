package com.javarush.task.task13.task1302;

/* 
Пиво-2. Возвращение
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Drink beer = new AlcoholicBeer();
        System.out.println(beer.toString());
    }

    public interface Drink {
        boolean isAlcoholic();
    }

    public static class AlcoholicBeer implements Drink {


        @Override
        public String toString() {
            if (isAlcoholic()) {
                return "Напиток алкогольный";
            } else {
                return "Напиток безалкогольный";
            }
        }

        @Override
        public boolean isAlcoholic() {
            return true;
        }
    }
}

//1302 Пиво-2. Возвращение
//Вы решили задачу лучше, чем 7% учеников. Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.45. Всего эту задачу решили 47290 учеников.