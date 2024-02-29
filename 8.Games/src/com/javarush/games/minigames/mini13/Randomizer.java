package com.javarush.games.minigames.mini13;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

/* 
Рандомайзер
*/

public class Randomizer extends Game {
    @Override
    public void initialize() {
        setScreenSize(3, 3);
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
        setTurnTimer(1000);
    }

    @Override
    public void onTurn(int step) {
        //напишите тут ваш код
        int x = getRandomNumber(100);
        setCellNumber(1, 1, x);
    }
}
//game13
//Вы решили задачу лучше, чем 15% учеников.
//Вам удалось ее решить с 2 попытки.
//Среднее количество попыток для этой задачи 1.6.
//Всего эту задачу решили 6578 учеников.