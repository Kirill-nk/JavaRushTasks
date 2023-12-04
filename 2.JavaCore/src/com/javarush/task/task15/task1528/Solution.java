package com.javarush.task.task15.task1528;

/* 
ООП. Hryvnia — тоже деньги
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Hryvnia().getAmount());
    }

    public static abstract class Money {
        abstract Money getMoney();

        public Object getAmount() {
            return this;
        }
    }

    //add your code below - добавь код ниже
    public static class Hryvnia extends Money {
        private double amount = 123d;

        public Hryvnia getMoney() {
            return this;
        }

        @Override
        public Object getAmount() {
//            Object amount = super.getAmount();
            return amount;
        }
    }
}
//1528
//Вы решили задачу лучше, чем 2% учеников.
//Вам удалось ее решить с 4 попытки.
//Среднее количество попыток для этой задачи 1.4.
//Всего эту задачу решили 35210 учеников.