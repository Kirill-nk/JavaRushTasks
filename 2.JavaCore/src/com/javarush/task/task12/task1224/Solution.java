package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        if (o instanceof Cat) {
            return "Кот";
        }
        if (o instanceof Tiger) {
            return "Тигр";
        }
        if (o instanceof Lion) {
            return "Лев";
        }
        if (o instanceof Bull) {
            return "Бык";
        }

        return "Животное";
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}

//Вы решили задачу лучше, чем 15% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.25.
//Всего эту задачу решили 46850 учеников.