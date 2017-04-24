package hansha.android.digitclassifier.view;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

public class DrawRenderer {
    /**
     * Draw lines to canvas
     */
    public static void renderModel(Canvas canvas, DrawModel model,
                                   Paint paint, int startLineIndex) {
        paint.setAntiAlias(true);

        int lineSize = model.getLineSize();
        for (int i = startLineIndex; i < lineSize; ++i) {
            DrawModel.Line line = model.getLine(i);
            paint.setColor(Color.BLACK);
            int elementSize = line.getElementSize();
            if (elementSize < 1) {
                continue;
            }
            DrawModel.LineElement element = line.getElement(0);
            float previousX = element.x;
            float previousY = element.y;

            for (int j = 0; j < elementSize; ++j) {
                element = line.getElement(j);
                float x = element.x;
                float y = element.y;
                canvas.drawLine(previousX, previousY, x, y, paint);
                previousX = x;
                previousY = y;
            }
        }
    }
}

