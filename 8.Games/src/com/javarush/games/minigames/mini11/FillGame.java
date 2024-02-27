package com.javarush.games.minigames.mini11;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

public class FillGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(5,5);
        fill();
    }

    public void fill() {
        for (int x = 0; x < 5; x++) {
            for (int y = 0; y < 5; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }
}
//game11
//Вы решили задачу лучше, чем 9% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.13.
//Всего эту задачу решили 6674 учеников.