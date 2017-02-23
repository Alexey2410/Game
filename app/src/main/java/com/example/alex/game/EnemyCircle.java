package com.example.alex.game;

import java.util.Random;

/**
 * Created by APoddubenskiy on 2/23/2017.
 */
public class EnemyCircle extends SimpleCircle {

    public static final int FROM_RADIUS = 10;
    public static final int TO_RADIUS = 110;

    public EnemyCircle(int x, int y, int radius) {
        super(x, y, radius);
    }

    public static EnemyCircle getRandomCircle() {
        Random random = new Random();
        int x = random.getInt(GameManager.getWidth());
        int y = random.getInt(GameManager.getHeight());
        int radius = FROM_RADIUS + random.getInt(TO_RADIUS - FROM_RADIUS);
        EnemyCircle enemyCircle = new EnemyCircle(x, y, radius);
        return enemyCircle;
    }
}
