package com.javarush.games.racer;

import com.javarush.engine.cell.*;

public class RacerGame extends Game {
    public static final int WIDTH = 64;
    public static final int HEIGHT = 64;
    public static final int CENTER_X = WIDTH / 2;
    public static final int ROADSIDE_WIDTH = 14;
    private PlayerCar player;

    private RoadMarking roadMarking;

    @Override
    public void initialize() {
        super.initialize();
        showGrid(false);
        setScreenSize(WIDTH, HEIGHT);
        createGame();
    }

    @Override
    public void setScreenSize(int width, int height) {
        super.setScreenSize(width, height);
    }

    private void createGame() {
        roadMarking = new RoadMarking();
        player = new PlayerCar();
        drawScene();
        setTurnTimer(40);
    }

    private void drawScene() {
        drawField();
        roadMarking.draw(this);
        player.draw(this);
    }

    @Override
    public void setCellColor(int x, int y, Color color) {
        if (x < 0 || x >= WIDTH || y < 0 || y >= HEIGHT) {
            return;
        } else {
            super.setCellColor(x, y, color);
        }
    }

    private void drawField() {
        for (int x = 0; x < WIDTH; x++) {
            for (int y = 0; y < HEIGHT; y++) {
                if (x == CENTER_X) {
                    setCellColor(x, y, Color.WHITE);
                } else if (x >= ROADSIDE_WIDTH && x < WIDTH - ROADSIDE_WIDTH) {
                    setCellColor(x, y, Color.DIMGREY);
                } else {
                    setCellColor(x, y, Color.GREEN);
                }
            }
        }
    }

    private void moveAll() {
        roadMarking.move(player.speed);
        player.move();
    }

    @Override
    public void onTurn(int step) {
        moveAll();
        drawScene();
    }

    @Override
    public void onKeyPress(Key key){
        if (key == Key.LEFT) {
            player.setDirection(Direction.LEFT);
        }
        if (key == Key.RIGHT) {
            player.setDirection(Direction.RIGHT);
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if (key == Key.RIGHT && player.getDirection() == Direction.RIGHT) {
            player.setDirection(Direction.NONE);
        }
        if (key == Key.LEFT && player.getDirection() == Direction.LEFT) {
            player.setDirection(Direction.NONE);
        }
    }
}