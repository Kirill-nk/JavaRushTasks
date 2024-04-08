package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.BELARUS);
        hen.getCountOfEggsPerMonth();
    }

    static class HenFactory {

        static Hen getHen(String country) {
            Hen hen = null;
            switch (country) {
                case Country.BELARUS: hen = new BelarusianHen();
                break;
                case Country.UKRAINE: hen = new UkrainianHen();
                break;
                case Country.MOLDOVA: hen = new MoldovanHen();
                break;
                case Country.RUSSIA: hen = new RussianHen();
                break;
            }

            return hen;
        }
    }
}
//1408. Куриная фабрика
//Вы решили задачу лучше, чем 6% учеников.
// Вам удалось ее решить с 10 попытки.
// Среднее количество попыток для этой задачи 4.11.
// Всего эту задачу решили 42036 учеников.