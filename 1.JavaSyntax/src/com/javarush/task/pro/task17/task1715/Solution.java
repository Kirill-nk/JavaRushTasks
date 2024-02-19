package com.javarush.task.pro.task17.task1715;

import java.util.ArrayList;
import java.util.List;

/* 
Вилларибо и Виллабаджо.
*/

public class Solution {
    static List<MusicalInstrument> orchestra = new ArrayList<>();

    public static void main(String[] args) {
        createKeyboardOrchestra();
        createStringedOrchestra();
        playOrchestra();
    }

    public static void createKeyboardOrchestra() {
        //напишите тут ваш код
        orchestra.add(new Organ());
        orchestra.add(new Piano());
        orchestra.add(new Piano());
        orchestra.add(new Piano());

    }

    public static void createStringedOrchestra() {
        //напишите тут ваш код
        orchestra.add(new Violin());
        orchestra.add(new Violin());
        orchestra.add(new Guitar());
    }

    public static void playOrchestra() {
        //напишите тут ваш код
        for (int i = 0; i < orchestra.size(); i++) {
            MusicalInstrument instrument = orchestra.get(i);
            instrument.play();
        }
    }
}
//1715
//Вы решили задачу лучше, чем 2% учеников.
// Вам удалось ее решить с 4 попытки.
// Среднее количество попыток для этой задачи 1.36.
// Всего эту задачу решили 9856 учеников.