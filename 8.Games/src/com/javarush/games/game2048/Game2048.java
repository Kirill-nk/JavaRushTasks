package com.javarush.games.game2048;

import com.javarush.engine.cell.*;

import java.util.List;
import java.util.ArrayList;

public class Game2048 extends Game {
    private static final int SIDE = 4;
    private int[][] gameField = new int[SIDE][SIDE];
    private boolean isGameStopped = false;
    private int score = 0;

    @Override
    public void initialize() {
        setScreenSize(SIDE, SIDE);
        createGame();
        drawScene();
    }

    @Override
    public void setScreenSize(int width, int height) {
        super.setScreenSize(width, height);
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        super.setCellColor(x, y, color);
    }

    private void createGame() {
        gameField = new int[SIDE][SIDE];
        createNewNumber();
        createNewNumber();
        score = 0;
        setScore(score);
    }

    private void createNewNumber() {
        List<int[]> emptyCells = new ArrayList<>();
        getRandomNumber(SIDE);
        getRandomNumber(SIDE);
        getRandomNumber(10);
        getMaxTileValue();

        for (int i = 0; i < gameField.length; i++) {
            for (int j = 0; j < gameField[i].length; j++) {
                if (gameField[i][j] == 0) {
                    emptyCells.add(new int[]{i, j});
                }
                if (gameField[i][j] == 2048) {
                    win();
                }
            }
        }
        if (emptyCells.isEmpty()) return;
        int[] cell = emptyCells.get(getRandomNumber(emptyCells.size()));
        int y = cell[0];
        int x = cell[1];
        gameField[y][x] = getRandomNumber(10) < 9 ? 2 : 4;
    }

    private Color getColorByValue(int value) {
        switch (value) {
            case 0:
                return Color.WHITE;
            case 2:
                return Color.AQUA;
            case 4:
                return Color.AQUAMARINE;
            case 8:
                return Color.DARKBLUE;
            case 16:
                return Color.ALICEBLUE;
            case 32:
                return Color.DARKCYAN;
            case 64:
                return Color.DARKGOLDENROD;
            case 128:
                return Color.DARKGRAY;
            case 256:
                return Color.DARKGREEN;
            case 512:
                return Color.DARKKHAKI;
            case 1024:
                return Color.DARKMAGENTA;
            case 2048:
                return Color.DARKOLIVEGREEN;
            default:
                return Color.NONE;
        }
    }

    private void setCellColoredNumber(int x, int y, int value) {
        Color color = getColorByValue(value);
        String text = value > 0 ? "" + value : "";
        setCellValueEx(x, y, color, text);
    }

    private boolean compressRow(int[] row) {
        int[] temp = new int[SIDE];
        int insertposition = 0;
        boolean result = false;
        for (int x = 0; x < SIDE; x++) {
            if (row[x] > 0) {
                if (x != insertposition) {
                    row[insertposition] = row[x];
                    row[x] = 0;
                    result = true;
                }
                insertposition++;
            }
        }
        return result;
    }

    private boolean mergeRow(int[] row) {
        boolean result = false;
//        int mergeCount = 0;
        for (int i = 0; i < row.length - 1; i++) {
            if (row[i] != 0 && row[i] == row[i + 1]) {
                row[i] += row[i + 1];
                score += row[i];
                row[i + 1] = 0;
                result = true;
//                mergeCount++;
                setScore(score);
            }
        }
        return result;
    }

    private void drawScene() {
        for (int y = 0; y < SIDE; y++) {
            for (int x = 0; x < SIDE; x++) {
                setCellColoredNumber(x, y, gameField[y][x]);
            }
        }
        setScore(score);
        System.out.println(score);
    }

    @Override
    public void onKeyPress(Key key) {
        if (isGameStopped) {
            if (key == Key.SPACE) {
                isGameStopped = false;
                createGame();
                drawScene();
            }
            return;
        }
        if (!canUserMove()) {
            gameOver();
            return;
        }
        if (key == Key.LEFT) {
            moveLeft();
            drawScene();
        }
        if (key == Key.RIGHT) {
            moveRight();
            drawScene();
        }
        if (key == Key.UP) {
            moveUp();
            drawScene();
        }
        if (key == Key.DOWN) {
            moveDown();
            drawScene();
        }
    }

    private void moveLeft() {
        boolean moved = false;
        for (int i = 0; i < SIDE; i++) {
            boolean compressed = compressRow(gameField[i]);
            boolean merged = mergeRow(gameField[i]);
            if (merged) {
                compressRow(gameField[i]);
            }
            if (merged || compressed) {
                moved = true;
            }
        }
        if (moved) {
            createNewNumber();
        }
    }

    private void moveRight() {
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
    }

    private void moveUp() {
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
        moveLeft();
        rotateClockwise();
    }

    private void moveDown() {
        rotateClockwise();
        moveLeft();
        rotateClockwise();
        rotateClockwise();
        rotateClockwise();
    }

    private void rotateClockwise() {
        int[][] temp = new int[SIDE][SIDE];
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                temp[y][SIDE - 1 - x] = gameField[x][y];
            }
        }
        gameField = temp;
    }

    private int getMaxTileValue() {
        int result = 0;
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                if (gameField[y][x] > result) {
                    result = gameField[y][x];
                }
            }
        }
        return result;
    }

    private void win() {
        isGameStopped = true;
        showMessageDialog(Color.CHOCOLATE, "Greate!", Color.BISQUE, 3);
    }

    private boolean canUserMove() {
        boolean result = false;
        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE; y++) {
                if (gameField[y][x] == 0) {
                    result = true;
                    break;
                }
            }
            if (result) break;
        }
        if (result) {
            return true;
        }

        for (int x = 0; x < SIDE; x++) {
            for (int y = 0; y < SIDE - 1; y++) {
                if (gameField[x][y] == gameField[x][y + 1]) {
                    return true;
                }
            }
        }
        for (int x = 0; x < SIDE - 1; x++) {
            for (int y = 0; y < SIDE; y++) {
                if (gameField[x][y] == gameField[x + 1][y]) {
                    return true;
                }
            }
        }
        return false;
    }

    private void gameOver() {
        isGameStopped = true;
        showMessageDialog(Color.RED, "Конец Игры!", Color.AZURE, 52);
    }
}
