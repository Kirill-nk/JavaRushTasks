package com.javarush.task.pro.task14.task1416;

/* 
Логирование стектрейса
*/

public class Solution {

    public static void main(String[] args) {
        try {
            dangerousMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void dangerousMethod() throws Exception {
        throw new Exception("Mu-ha-ha!");
    }
}
//1416
//Логирование стектрейса
//    В методе main перехвати исключение и выведи его стектрейс.
//Вы решили задачу лучше, чем 17% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.28.
//Всего эту задачу решили 12322 учеников.