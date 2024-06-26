package com.javarush.task.task17.task1708;

import java.util.ArrayList;
import java.util.List;

/* 
Заметки для всех
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public volatile List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}

//1708. Заметки для всех.
// Задача успешно прошла тестирование!
//Вы решили задачу лучше, чем 4% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.06. Всего эту задачу решили 34842 учеников.