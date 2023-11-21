package com.javarush.task.task15.task1514;

interface BetaList {
    int getValue(int index);
    void setValue(int index, int value);
    int getSize();
    void setSize(int newSize);
}

class BetaSaveManager {
    public static void saveList(BetaList list) {
        //Какой-то код по сохранению объекта
        //типа BetaList в файл на диске
    }
}