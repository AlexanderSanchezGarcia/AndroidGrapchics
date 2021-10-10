package ipn.cecyt9.androidgrapchics;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.view.View;

public class MyCanvas extends View {
    public MyCanvas(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRGB(178, 241, 226);

        //Triangle
        Path pathT = new Path();
        Paint paintT = new Paint();
        pathT.moveTo(150, 50);
        pathT.lineTo(50, 200);
        pathT.lineTo(250, 200);

        paintT.setStyle(Paint.Style.FILL);
        paintT.setColor(Color.BLACK);

        canvas.drawPath(pathT, paintT);

        //Pentagon
        Path pathP = new Path();
        Paint paintP = new Paint();
        pathP.moveTo(150, 300);
        pathP.lineTo(50, 350);
        pathP.lineTo(250, 350);
        pathP.moveTo(100, 430);
        pathP.lineTo(50, 350);
        pathP.lineTo(200, 430);
        pathP.moveTo(250, 350);
        pathP.lineTo(50, 350);
        pathP.lineTo(200, 430);

        paintP.setStyle(Paint.Style.FILL);
        paintP.setColor(Color.GREEN);

        canvas.drawPath(pathP, paintP);

        //Hexagon
        Path pathH = new Path();
        Paint paintH = new Paint();
        pathH.moveTo(100, 500);
        pathH.lineTo(50, 580);
        pathH.lineTo(200, 500);
        pathH.moveTo(50, 580);
        pathH.lineTo(100, 650);
        pathH.lineTo(200, 650);
        pathH.moveTo(200, 650);
        pathH.lineTo(50, 580);
        pathH.lineTo(250, 580);
        pathH.moveTo(200, 500);
        pathH.lineTo(250, 580);
        pathH.lineTo(50, 580);


        paintH.setStyle(Paint.Style.FILL);
        paintH.setColor(Color.WHITE);

        canvas.drawPath(pathH, paintH);
    }
}
