package com.javarush.task.pro.task10.task1002;
/*
Построим новый жилой комплекс JavaRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILD = "Небоскреб построен.";
    public static final int SKYSCRAPER_WAS_BUILD_FLOORS_COUNT = 50;
    public static final String SKYSCRAPER_WAS_BUILD_DEVELOPER = "Небоскреб построен. Застройщик - ";



    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper();
        Skyscraper skyscraperSkyline = new Skyscraper();
        System.out.println(Skyscraper.SKYSCRAPER_WAS_BUILD);
        System.out.println("Небоскреб построен. Количество этажей - " + Skyscraper.SKYSCRAPER_WAS_BUILD_FLOORS_COUNT + "50");
        System.out.println(Skyscraper.SKYSCRAPER_WAS_BUILD_DEVELOPER + "JavaRushDevelopment");
    }
}

