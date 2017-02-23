package com.example.alex.game;

/**
 * Created by APoddubenskiy on 2/20/2017.
 */
public class MainCircle extends SimpleCircle {

    public static final int RADIUS = 50;
    public static final int MAIN_SPEED = 30;

    public MainCircle(int x, int y) {
        super(x, y, RADIUS);
    }

    public void moveMainCircleWhenTouchAt(int x1, int y1) {
        int dx = (x1 - x) * MAIN_SPEED / GameManager.getWidth();
        int dy = (y1 - y) * MAIN_SPEED / GameManager.getHeight();
        x += dx;
        y += dy;
    }
}
