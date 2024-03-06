package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        //напишите тут ваш код
        storage.add(0, s);
    }

    public String pop() {
        //напишите тут ваш код
        return storage.remove(0);
    }

    public String peek() {
        //напишите тут ваш код
        return storage.get(0);
    }

    public boolean empty() {
        //напишите тут ваш код
        return storage.isEmpty();
    }

    public int search(String s) {
        //напишите тут ваш код
        for (int i = 0; i < storage.size(); i++) {
            if (storage.get(i).equals(s)) {
                return i;
            }
        }
        return -1;
    }
}

//1415
//Вы решили задачу лучше, чем 15% учеников.
//Вам удалось ее решить с 3 попытки.
//Среднее количество попыток для этой задачи 2.31.
//Всего эту задачу решили 12805 учеников.