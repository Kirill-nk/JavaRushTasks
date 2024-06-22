package com.javarush.task.task17.task1704;

import java.util.ArrayList;
import java.util.List;

/* 
Синхронизированные заметки 2
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class Note {

        public final List<String> notes = new ArrayList<String>();

        public synchronized void addNote(int index, String note) {
            System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
            notes.add(index, note);
            System.out.println("Уже добавлена заметка [" + note + "]");
        }

        public synchronized void removeNote(int index) {
            System.out.println("Сейчас будет удалена заметка с позиции " + index);
            String note = notes.remove(index);
            System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
        }
    }
}

//1704. Синхронизированные заметки 2
//Вы решили задачу лучше, чем 6% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.27.
//Всего эту задачу решили 35087 учеников.