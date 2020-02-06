package org.academiadecodigo.rhashtafaris.sniperelite;

import org.academiadecodigo.rhashtafaris.sniperelite.GameObject.*;
import org.academiadecodigo.rhashtafaris.sniperelite.org.academiadecodigo.rhashtafaris.sniperelite.barrel.Barrel;
import org.academiadecodigo.rhashtafaris.sniperelite.org.academiadecodigo.rhashtafaris.sniperelite.barrel.BarrelType;
import org.academiadecodigo.rhashtafaris.sniperelite.org.academiadecodigo.rhashtafaris.sniperelite.barrel.Destroyable;

public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private static final double GENERATE_TREE_PROBABILITY = 0.1;
    private static final double GENERATE_BARREL_PROBABILITY = 0.35;
    private static final double GENERATE_SOLDIER_PROBABILITY = 0.65;

    public Game() {
        this.sniperRifle = new SniperRifle();
    }

    public GameObject[] createObjects(int numberOfObjects) {

        GameObject[] gameObjects = new GameObject[numberOfObjects];

        for (int i = 0; i < gameObjects.length; i++) {

            if (Math.random() < GENERATE_TREE_PROBABILITY) {
                gameObjects[i] = new Tree();
                continue;
            }

            if (Math.random() < GENERATE_BARREL_PROBABILITY) {
                gameObjects[i] = new Barrel(BarrelType.getRandom());
                continue;
            }

            gameObjects[i] = (Math.random() > GENERATE_SOLDIER_PROBABILITY) ? new SoldierEnemy() : new AmouredEnemy();
        }
        return gameObjects;
    }

    public void start (int numberOfObjects) {

        this.gameObjects = createObjects(numberOfObjects);

        for (GameObject gameObject : gameObjects) {

            if (!(gameObject instanceof Destroyable)) {
                System.out.println(gameObject.getMessage());
                continue;
            }

            Destroyable destroyable = (Destroyable) gameObject;
            System.out.println(gameObject.getMessage());
            this.sniperRifle.shoot(destroyable);
        }
    }
}
