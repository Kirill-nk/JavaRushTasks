package com.javarush.task.task13.task1317;

/* 
The weather is fine
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather{
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

        public Today() {
        }

        @Override
        public String getWeatherType() {
            return type;
        }
    }
}

//1317
//Вы решили задачу лучше, чем 0% учеников.
//Вам удалось ее решить с 15 попытки.
//Среднее количество попыток для этой задачи 1.41.
//Всего эту задачу решили 45233 учеников.
