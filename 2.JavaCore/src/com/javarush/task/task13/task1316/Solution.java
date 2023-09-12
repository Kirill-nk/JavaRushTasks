package com.javarush.task.task13.task1316;

/* 
Некорректные строки
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
    }

    interface Button extends SimpleObject {

        final String NAME = "Submit";

//        public void onPress();
//
//        protected void onPress();

//        void onPress();

//        private void onPress();
//
//        protected String onPress(Object o);
//
        String onPress(Object o);
//
//        private String onPress(Object o);

    }
}

//1316
//Вы решили задачу лучше, чем 7% учеников.
//Вам удалось ее решить с 3 попытки.
//Среднее количество попыток для этой задачи 1.77.
//Всего эту задачу решили 45835 учеников.