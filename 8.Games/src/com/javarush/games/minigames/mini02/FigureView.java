package com.javarush.games.minigames.mini02;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Отображаем корабль
*/

public class FigureView extends Game {

    public static final int[][] SHIP = new int[][]{
            {0, 0, 7, 0, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {0, 7, 7, 7, 0},
            {0, 7, 0, 7, 0},
            {7, 7, 7, 7, 7},
            {7, 0, 7, 0, 7},
    };

    //напишите тут ваш код


    @Override
    public void initialize() {
        setScreenSize(5,7);
        showShip();
    }

    public void showShip() {
        for (int i = 0; i < SHIP.length; i++) {
            for (int j = 0; j < SHIP[0].length; j++) {
                setCellColor(j, i, Color.values()[SHIP[i][j]]);
            }
        }
    }
}
//2002
/*Вы решили задачу лучше, чем 3% учеников.
Вам удалось ее решить с 3 попытки.
Среднее количество попыток для этой задачи 1.3.
Всего эту задачу решили 7539 учеников.*/