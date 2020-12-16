package Shapes;

public abstract class Quadrilateral extends Shape implements Measurable {



    protected int length;
    protected int width;
    protected int side;



    public Quadrilateral(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public abstract int setLength();

    public abstract int setWidth();



    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }


    public double getArea() {
        return length * width;
    }



}
