package com.example.alex.game;

/**
 * Created by APoddubenskiy on 2/20/2017.
 */
public class MainCircle {

    public static final int RADIUS = 50;
    private int x;
    private int y;
    private int radius;

    public MainCircle(int x, int y) {
        this.x = x;
        this.y = y;
        this.radius = RADIUS;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getRadius() {
        return radius;
    }
}
