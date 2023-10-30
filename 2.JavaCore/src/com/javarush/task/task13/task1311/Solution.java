package com.javarush.task.task13.task1311;

/* 
Нанимаем переводчика
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        EnglishTranslator englishTranslator = new EnglishTranslator();

        System.out.println(englishTranslator.translate());
//        DeutscheTranslator deutscheTranslator = new DeutscheTranslator();
//        System.out.println(deutscheTranslator.translate());
    }


    public static abstract class Translator {
        public abstract String getLanguage();

        public String translate() {
            return "Я переводчик с " + getLanguage();
        }
    }

    public static class EnglishTranslator extends Translator {

        @Override
        public String getLanguage() {
            return "английского";
        }
    }

//    public static class DeutscheTranslator extends Translator {
//        @Override
//        public String getLanguage() {
//            return "немецкого";
//        }
//    }


}
//1311
//Вы решили задачу лучше, чем 4% учеников.
//Вам удалось ее решить с 3 попытки.
//Среднее количество попыток для этой задачи 1.44.
//Всего эту задачу решили 46679 учеников.