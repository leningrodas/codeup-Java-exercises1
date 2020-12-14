package Shapes;

public class Square extends Rectangle {

    public int side;

    public Square (int side){
        super(side, side);
    }


   public int getArea(){
    System.out.println("overwriding");
        return length* length;
}

public int getPerimeter(){
    System.out.println("overwriding");
    return 4 * length;
}

}
