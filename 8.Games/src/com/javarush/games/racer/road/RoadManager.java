package com.javarush.games.racer.road;

import com.javarush.games.racer.GameObject;
import com.javarush.games.racer.PlayerCar;
import com.javarush.games.racer.RacerGame;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.List;

public class RoadManager {
    public static final int LEFT_BORDER = RacerGame.ROADSIDE_WIDTH;
    public static final int RIGHT_BORDER = RacerGame.WIDTH - LEFT_BORDER;
    private static final int FIRST_LANE_POSITION = 16;
    private static final int FOURTH_LANE_POSITION = 44;
    private List<RoadObject> items = new ArrayList<>();

    private RoadObject createRoadObject(RoadObjectType type, int x, int y) {
        if (type == RoadObjectType.THORN) {
            return new Thorn(x, y);
        } else {
            return null;
        }
    }

    private void addRoadObject(RoadObjectType type, Game game) {
        int x = game.getRandomNumber(FIRST_LANE_POSITION, FOURTH_LANE_POSITION);
        int y = -1 * RoadObject.getHeight(type);
        RoadObject newObject = createRoadObject(type, x, y);
        if (newObject != null) {
            items.add(newObject);
        }
    }

    public void draw(Game game) {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).draw(game);
        }
    }

    public void move(int boost) {
        for (int i = 0; i < items.size(); i++) {
            RoadObject obj = items.get(i);
            obj.move(boost + obj.speed);
        }
        deletePassedItems();
    }

    private boolean isThornExists() {
        for (int i = 0; i < items.size(); i++) {
            RoadObject item = items.get(i);
            if (item instanceof Thorn) {
                return true;
            }
        }
        return false;
    }

    private void generateThorn(Game game) {
        int value = game.getRandomNumber(100);
        if (value < 10 && !isThornExists()) {
            addRoadObject(RoadObjectType.THORN, game);
        }
    }

    public void generateNewRoadObjects(Game game) {
        generateThorn(game);
    }

    private void deletePassedItems() {
        for (int i = items.size() - 1; i >= 0; i--) {
            RoadObject object = items.get(i);
            if (object.y >= RacerGame.HEIGHT) {
                items.remove(i);
            }
        }
    }

    public boolean checkCrush(PlayerCar playerCar) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).isCollision(playerCar)) {
                return true;
            }
        }
        return false;
    }
}
