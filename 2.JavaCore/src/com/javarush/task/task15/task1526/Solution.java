package com.javarush.task.task15.task1526;

/* 
Дебаг, дебаг, и еще раз дебаг
*/

public class Solution {
    public static void main(String[] args) {
        new B(6);
    }

    public static class A {
        private int f1 = 7;

        public A(int f1) {
            this.f1 = f1;
            initialize();
        }

        private void initialize() {
            System.out.println(f1);
        }
    }

    public static class B extends A {
        protected int f1 = 3;

        public B(int f1) {
            super(f1);
            this.f1 += f1;
            initialize();
        }

        protected void initialize() {
            System.out.println(f1);
        }
    }
}

//1526. Дебаг, дебаг, и еще раз дебаг
//Вы решили задачу лучше, чем 17% учеников. Вам удалось ее решить с 1 попытки. Среднее количество попыток для этой задачи 1.28. Всего эту задачу решили 36106 учеников