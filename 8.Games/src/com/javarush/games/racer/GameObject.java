package com.javarush.games.racer;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.*;

public class GameObject {
    public int x;
    public int y;
    public int[][] matrix;
    public int width;
    public int height;

    public GameObject(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
        this.width = matrix[0].length;
        this.height = matrix.length;
    }

    public void draw(Game game) {
        for (int i = 0; i < matrix.length; y++) {
            for (int j = 0; j < matrix[0].length; x++) {
                game.setCellColor(x + j, y + i, Color.values()[matrix[i][j]]);
            }
        }
    }
}
