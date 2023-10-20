package com.javarush.task.task13.task1301;

/* 
Пиво
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    public interface Drinker {
        void askForMore(String message);

        void sayThankYou();

        boolean isReadyToGoHome();
    }

    public interface Alcoholic extends Drinker {
        boolean READY_TO_GO_HOME = false;

        void sleepOnTheFloor();
    }

    public static abstract class BeerLover implements Alcoholic {

        @Override
        public void askForMore(String message) {

        }

        @Override
        public void sleepOnTheFloor() {
            System.out.println(READY_TO_GO_HOME);
        }

        @Override
        public void sayThankYou() {
        }

        @Override
        public boolean isReadyToGoHome() {
            return READY_TO_GO_HOME;
        }
    }

}

//Вы решили задачу лучше, чем 1% учеников.
//Вам удалось ее решить с 13 попытки.
// Среднее количество попыток для этой задачи 1.79.
// Всего эту задачу решили 47427 учеников.