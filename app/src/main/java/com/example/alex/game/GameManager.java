package com.example.alex.game;

import android.graphics.Canvas;
import android.graphics.Paint;

/**
 * Created by APoddubenskiy on 2/21/2017.
 */
public class GameManager {
    private MainCircle mainCircle;
    private Paint paint;

    public GameManager() {
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
        mainCircle = new MainCircle(200, 500);
    }
}
