package Shapes;

public class Square extends Rectangle {


    public Square(int side) {
        super(side, side);
    }



    @Override
    public int setWidth() {
         return width;
    }
    @Override
    public int setLength(){
          return length;
    }




}
