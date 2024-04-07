package com.javarush.task.task13.task1320;

/*
Neo
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(Matrix.NEO);
    }

    public static class Matrix {
        public static DBObject NEO = new User().initializeIdAndName(1, "Neo");

    }

    public interface DBObject {
        DBObject initializeIdAndName(long id, String name);

    }

    static class User implements DBObject{
        long id;
        String name;

        @Override
        public User initializeIdAndName(long id, String name) {
            this.id = id;
            this.name = name;
            return this;
        }

        @Override
        public String toString() {
            return String.format("The user's name is %s, id = %d", name, id);
        }
    }
}

//1320. Neo
//Вы решили задачу лучше, чем 1% учеников.
//Вам удалось ее решить с 10 попытки.
//Среднее количество попыток для этой задачи 2.22.
//Всего эту задачу решили 44528 учеников.