package com.example.alex.game;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by APoddubenskiy on 2/21/2017.
 */
public class GameManager {
    private MainCircle mainCircle;
    private Paint paint;
    private CanvasView canvasView;
    private static int width;
    private static int height;

    public GameManager(CanvasView canvasView, int w, int h) {
        this.canvasView = canvasView;
        width = w;
        height = h;
        initMainView();
        initPaint();
    }

    public void onDraw(Canvas canvas) {
        canvas.drawCircle(mainCircle.getX(), mainCircle.getY(), mainCircle.getRadius(), paint);
    }

    private void initPaint() {
        paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    private void initMainView() {
        mainCircle = new MainCircle(width / 2, height / 2);
    }
}
