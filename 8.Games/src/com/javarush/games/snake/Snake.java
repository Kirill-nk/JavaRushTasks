package com.javarush.games.snake;

import com.javarush.engine.cell.*;

import java.util.ArrayList;
import java.util.List;

public class Snake {
    private List<GameObject> snakeParts = new ArrayList<>();
    private static final String HEAD_SIGN = "\uD83D\uDC7E";
    private static final String BODY_SIGN = "\u26AB";
    public boolean isAlive = true;

    public void draw(Game game) {
        for (int i = 0; i < snakeParts.size(); i++) {
            if (i==0) {
                game.setCellValue(snakeParts.get(i).x, snakeParts.get(i).y, HEAD_SIGN);
            } else {
                game.setCellValue(snakeParts.get(i).x, snakeParts.get(i).y, BODY_SIGN);
            }
        }

    }

    public Snake(int x, int y) {
        GameObject gameObject1 = new GameObject(x, y);
        GameObject gameObject2 = new GameObject(x + 1, y);
        GameObject gameObject3 = new GameObject(x + 2, y);
        snakeParts.add(0, gameObject1);
        snakeParts.add(1, gameObject2);
        snakeParts.add(2, gameObject3);
    }
}
