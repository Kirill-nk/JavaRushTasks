package com.javarush.task.pro.task10.task1004;

/* 
Жажда скорости
*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year = 4321;
    private final String color = "orange";

    public CarConcern(String model, int year, String color) {
        this.model = model;
        year = year;
        color = color;
    }

    public CarConcern(String model, int year) {
        this.model = model;
        year = year;
    }

    public CarConcern(String model) {
        this.model = model;
    }
}
