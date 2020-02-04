package org.academiadecodigo.rhashtafaris.sniperelite;

import org.academiadecodigo.rhashtafaris.sniperelite.GameObject.*;

public class Game {

    private GameObject[] gameObjects;
    private SniperRifle sniperRifle;
    private static final double GENERATE_TREE_PROBABILITY = 0.15;
    private static final double GENERATE_SOLDIER_PROBABILITY = 0.55;

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
            gameObjects[i] = (Math.random() > GENERATE_SOLDIER_PROBABILITY) ? new SoldierEnemy() : new AmouredEnemy();
        }
        return gameObjects;
    }

    public void start (int numberOfObjects) {

        this.gameObjects = createObjects(numberOfObjects);

        for (GameObject gameObject : gameObjects) {
            if (gameObject instanceof Tree) {
                System.out.println(gameObject.getMessage());
                continue;
            }
            Enemy enemy = new Enemy();
            System.out.println(gameObject.getMessage());
            this.sniperRifle.shoot(enemy);
        }
    }
}
