package com.javarush.games.minigames.mini09;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Таймер
*/

public class TimerGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    @Override
    public void onTurn(int step) {
        if (step % 2 == 0) {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    setCellNumber(x, y, step);
                    setCellColor(x, y, Color.GREEN);
                }
            }

        } else {
            for (int x = 0; x < 3; x++) {
                for (int y = 0; y < 3; y++) {
                    setCellNumber(x, y, step);
                    setCellColor(x, y, Color.ORANGE);
                }
            }
        }
    }
}
//Решение валидатора:
//        setCellNumber(1, 1, step);
//        for (int x = 0; x < 3; x++) {
//              for (int y = 0; y < 3; y++) {
//        setCellColor(x, y, step % 2 == 0 ? Color.GREEN : Color.ORANGE);


//game09
//Вы решили задачу лучше, чем 46% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.84.
//Всего эту задачу решили 6592 учеников.