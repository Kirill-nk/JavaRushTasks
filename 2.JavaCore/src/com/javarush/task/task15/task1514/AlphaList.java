package com.javarush.task.task15.task1514;

public interface AlphaList {
    void add(int value);
    void insert(int index, int value);
    int get(int index);
    void set(int index, int value);
    int count();
    void remove(int index);
}