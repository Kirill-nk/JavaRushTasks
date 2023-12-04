package com.javarush.task.task14.task1413;

public class Computer {
    private Keyboard keyboard = new Keyboard();
    private Mouse mouse = new Mouse();
    private Monitor monitor = new Monitor();

    public Computer(Keyboard keyboard) {
        this.keyboard = keyboard;
    }
}
