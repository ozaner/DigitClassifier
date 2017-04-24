package hansha.android.digitclassifier.view;

import java.util.ArrayList;
import java.util.List;

public class DrawModel {

    public static class LineElement {
        public float x;
        public float y;

        private LineElement(float x, float y) {
            this.x = x;
            this.y = y;
        }
    }

    public static class Line {
        private List<LineElement> elements = new ArrayList<>();

        private Line(){}

        private void addElement(LineElement element) {
            elements.add(element);
        }

        public int getElementSize() {
            return elements.size();
        }

        public LineElement getElement(int index) {
            return elements.get(index);
        }
    }

    private Line mCurrentLine;

    private int mWidth;  // pixel width = 28
    private int mHeight; // pixel height = 28

    private List<Line> mLines = new ArrayList<>();

    public DrawModel(int width, int height) {
        this.mWidth = width;
        this.mHeight = height;
    }

    public int getWidth() {
        return mWidth;
    }

    public int getHeight() {
        return mHeight;
    }

    public void startLine(float x, float y) {
        mCurrentLine = new Line();
        mCurrentLine.addElement(new LineElement(x, y));
        mLines.add(mCurrentLine);
    }

    public void endLine() {
        mCurrentLine = null;
    }

    public void addLineElement(float x, float y) {
        if (mCurrentLine != null) {
            mCurrentLine.addElement(new LineElement(x, y));
        }
    }

    public int getLineSize() {
        return mLines.size();
    }

    public Line getLine(int index) {
        return mLines.get(index);
    }

    public void clear() {
        mLines.clear();
    }
}
