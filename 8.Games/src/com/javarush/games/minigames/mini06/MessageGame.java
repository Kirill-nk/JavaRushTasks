package com.javarush.games.minigames.mini06;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Диалоговые окна
*/

public class MessageGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
    }

    @Override
    public void onMouseLeftClick(int x, int y) {
        //напишите тут ваш код
        showMessageDialog(Color.AQUAMARINE, "Вы выиграли", Color.GREEN, 20);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        //напишите тут ваш код
        showMessageDialog(Color.AQUAMARINE, "Вы проиграли", Color.RED, 20);
    }
}
//game06
//Вы решили задачу лучше, чем 25% учеников.
//Вам удалось ее решить с 1 попытки.
//Среднее количество попыток для этой задачи 1.36.
//Всего эту задачу решили 6889 учеников.