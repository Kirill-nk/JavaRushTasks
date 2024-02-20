package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {

    //напишите тут ваш код


    @Override
    public void initialize() {
        setScreenSize(10, 7);
        showGrid(true);
        for (int i = 0; i < 10; i++) {
            setCellColor(i, 0, Color.RED);
            setCellColor(i, 1, Color.ORANGE);
            setCellColor(i, 2, Color.YELLOW);
            setCellColor(i, 3, Color.GREEN);
            setCellColor(i, 4, Color.BLUE);
            setCellColor(i, 5, Color.INDIGO);
            setCellColor(i, 6, Color.VIOLET);
        }
    }
}

//game05
//Вы решили задачу лучше, чем 26% учеников.
// Вам удалось ее решить с 1 попытки.
// Среднее количество попыток для этой задачи 1.58.
// Всего эту задачу решили 6912 учеников.