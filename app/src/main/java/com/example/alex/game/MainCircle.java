package com.example.alex.game;

/**
 * Created by APoddubenskiy on 2/20/2017.
 */
public class MainCircle {

    public static final int RADIUS = 50;
    public static final int MAIN_SPEED = 30;
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

    public void moveMainCircleWhenTouchAt(int x1, int y1) {
        int dx = (x - x1) * MAIN_SPEED / GameManager.getWidth();
        int dy = (y - y1) * MAIN_SPEED / GameManager.getHeight();
        x += dx;
        y += dy;
    }
}
