package com.example.alex.game;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by APoddubenskiy on 2/21/2017.
 */
public class GameManager {
    private MainCircle mainCircle;

    private CanvasView canvasView;
    private static int width;
    private static int height;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainView();
    }

    public void onDraw() {
        canvasView.drawCircle(mainCircle);
    }

    private void initMainView() {
        mainCircle = new MainCircle(width / 2, height / 2);
    }

    public void onTouchEvent(int x, int y) {
        mainCircle.moveMainCircleWhenTouchAt(x, y);
    }

    public static int getWidth() {
        return width;
    }

    public static int getHeight() {
        return height;
    }
}
