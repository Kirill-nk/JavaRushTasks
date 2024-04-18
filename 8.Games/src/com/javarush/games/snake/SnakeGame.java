package com.javarush.games.snake;

import com.javarush.engine.cell.*;

public class SnakeGame extends Game {

    public static final int WIDTH = 15;
    public static final int HEIGHT = 15;

    @Override
    public void initialize() {
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    private void createGame() {
        drawScene();
    }

    private void drawScene() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                setCellColor(x, y, Color.DARKTURQUOISE);
            }
        }
    }
}
//Игра змейка (5/20)
//Вы решили задачу лучше, чем 21% учеников. Вам удалось ее решить с 2 попытки. Среднее количество попыток для этой задачи 2.4. Всего эту задачу решили 6425 учеников.