package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        //Add your code here - добавь код тут
        TestThread thread = new TestThread();
        thread.start();
        thread.interrupt();
    }

    //Add your code below - добавь код ниже

    public static class TestThread extends Thread {
        public void run() {

        }
    }
}

//1618. Снова interrupt
//Вы решили задачу лучше, чем 28% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.53.
//Всего эту задачу решили 37522 учеников.