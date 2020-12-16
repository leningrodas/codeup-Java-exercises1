package Shapes;

public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public int setLength() {
        return length;
    }

    @Override
    public int setWidth() {
        return width;
    }



}

