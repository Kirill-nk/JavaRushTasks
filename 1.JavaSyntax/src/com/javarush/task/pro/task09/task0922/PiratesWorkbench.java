package com.javarush.task.pro.task09.task0922;

/* 
Закосить под пиратов
*/

import java.util.Arrays;

public class PiratesWorkbench {

    public static String[] piratesDB = new String[]{
            "Drax",
            "Yondu Udonta",
            "Maz Kanata",
            "キャプテン・ハーロック",
            "Star-Lord",
            "Christopher Summers",
            "Крысс",
            "Весельчак У",
            "Nebula",
            "Rocket",
            "Han Solo",
            "boba Fett"
    };

    public static void main(String[] args) {
        System.out.println(Arrays.toString(piratesDB));

        corruptDB();
        addTwoNames();

        System.out.println(Arrays.toString(piratesDB));
    }

    public static void corruptDB() {
        int r = 0;
        for (int i = 0; i < piratesDB.length; i++) {
            if (piratesDB[i].contains("b") && r < 2) {
                r++;
                piratesDB[i] = piratesDB[i].replace('b', '\b');
            }

        }
    }

    public static void addTwoNames() {
        String tmp[] = new String[piratesDB.length + 2];
        System.arraycopy(piratesDB, 0, tmp, 0, piratesDB.length);
        piratesDB = tmp;
        piratesDB[piratesDB.length - 2] = "Рыжий Амиго";
        piratesDB[piratesDB.length - 1] = "Одноглазый Диего";

    }
}
