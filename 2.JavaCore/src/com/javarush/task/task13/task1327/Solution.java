package com.javarush.task.task13.task1327;

import java.util.ArrayList;
import java.util.List;

/* 
Репка
*/

public class Solution {
    public static void main(String[] args) {
        List<Person> plot = new ArrayList<Person>();
        plot.add(new Person("Репка", "Репку"));
        plot.add(new Person("Дедка", "Дедку"));
        plot.add(new Person("Бабка", "Бабку"));
        plot.add(new Person("Внучка", "Внучку"));
        RepkaStory.tell(plot);
    }
}
//1327
//Вы решили задачу лучше, чем 50% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 2.36.
// Всего эту задачу решили 39321 учеников.