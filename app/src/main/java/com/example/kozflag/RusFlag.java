package com.example.kozflag;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;

public class RusFlag extends View {
    public RusFlag(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int height = getHeight() / 3;
        Paint paint = new Paint();
        paint.setColor(Color.BLUE);
        canvas.drawPaint(paint);
        paint.setColor(Color.RED);
        canvas.drawRect(0, getHeight() - height,getWidth(),getHeight(),paint);
        paint.setColor(Color.WHITE);
        canvas.drawRect(0, 0,getWidth(),height,paint);
    }
}
