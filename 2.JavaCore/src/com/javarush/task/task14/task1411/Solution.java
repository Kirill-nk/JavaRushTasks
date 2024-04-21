package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;

        //тут цикл по чтению ключей, пункт 1
        while (true) {
            key = reader.readLine();
            if (key.equals("user")) {
                doWork(new Person.User());
            } else if (key.equals("loser")) {
                doWork(new Person.Loser());
            } else if (key.equals("coder")) {
                doWork(new Person.Coder());
            } else if (key.equals("proger")) {
                doWork(new Person.Proger());
            } else break;
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}

//1411
//Вы решили задачу лучше, чем 21% учеников.
// Вам удалось ее решить с 2 попытки.
// Среднее количество попыток для этой задачи 2.18.
// Всего эту задачу решили 40684 учеников.