package com.javarush.task.task14.task1415;

import java.util.ArrayList;
import java.util.List;

/* 
Клининговый центр
*/

public class Solution {
    public static void main(String[] args) {
        List<Apartment> apartments = new ArrayList<Apartment>();
        apartments.add(new OneRoomApt());
        apartments.add(new TwoRoomApt());
        apartments.add(new ThreeRoomApt());

        cleanAllApartments(apartments);
    }

    public static void cleanAllApartments(List<Apartment> apartments) {
        //написать тут вашу реализацию пунктов 1-4
        for(Apartment str : apartments){
            if(str instanceof OneRoomApt){
                OneRoomApt one = (OneRoomApt) str;
                one.clean1Room();
            } else if (str instanceof TwoRoomApt){
                TwoRoomApt two = (TwoRoomApt) str;
                two.clean2Rooms();
            }else if( str instanceof ThreeRoomApt){
                ThreeRoomApt three = (ThreeRoomApt) str;
                three.clean3Rooms();
            }
        }
    }

    static interface Apartment {
    }

    static class OneRoomApt implements Apartment {
        void clean1Room() {
            System.out.println("1 room is cleaned");
        }
    }

    static class TwoRoomApt implements Apartment {
        void clean2Rooms() {
            System.out.println("2 rooms are cleaned");
        }
    }

    static class ThreeRoomApt implements Apartment {
        void clean3Rooms() {
            System.out.println("3 rooms are cleaned");
        }
    }
}
//1415
//Вы решили задачу лучше, чем 22% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.52.
//Всего эту задачу решили 40648 учеников.