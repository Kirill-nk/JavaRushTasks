package com.javarush.task.pro.task18.task1813;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/* 
Будущее за электрокарами
*/

public class Solution {

    public static void main(String[] args) {
        var cars = new ArrayList<Car>();
        Collections.addAll(cars,
                new Car("Range Rover", false),
                new Car("Model S", true),
                new Car("Navigator", false),
                new Car("Model 3", true),
                new Car("Camaro", false),
                new Car("Escalade", false),
                new Car("Mustang", false),
                new Car("Model X", true),
                new Car("X5", false),
                new Car("Model Y", true));

        var carStream = onlyElectricCars(cars);
        carStream.forEach(System.out::println);
    }

    public static Stream<Car> onlyElectricCars(ArrayList<Car> cars) {
        //напишите тут ваш код
        return cars.stream().filter(s1 -> s1.isElectric());
    }
}
//1813
//Вы решили задачу лучше, чем 8% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.17.
//Всего эту задачу решили 9711 учеников.