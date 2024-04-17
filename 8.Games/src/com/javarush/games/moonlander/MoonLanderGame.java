package com.javarush.games.moonlander;

import com.javarush.engine.cell.*;

public class MoonLanderGame extends Game {
    public static final int WIDTH=64;
    public static final int HEIGHT=64;

    @Override
    public void initialize() {
        setScreenSize(WIDTH,HEIGHT);
    }
}

//Игра Moon Lander (1/23)
//Вы решили задачу лучше, чем 34% учеников. Вам удалось ее решить с 1 попытки. Среднее количество попыток для этой задачи 1.79. Всего эту задачу решили 3160 учеников.