package Shapes;

import util.Input;

public class CircleApp {






    public static void main(String[] args){

        Input test2 = new Input();

        double input = test2.getDouble();
//        int input = test2.getInt();
        Circle test = new Circle(input);

        System.out.println(test.getArea());

        System.out.println(test.getCircumference());

//        double numRadius = test.GetRadius();
//
//        test.setRadius(numRadius);
//
//        System.out.println(test.getArea());
//
//        System.out.println(test.getCircumference());

    }


}
