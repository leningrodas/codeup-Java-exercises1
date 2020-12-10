package Shapes;


import java.util.Scanner;

public class Circle {



    public Scanner sc = new Scanner(System.in);



    private double radius;



    public  Circle(double radius){
        this.radius = radius;
           }

    public void setRadius(double num){
        System.out.println("enter a new number for a new radius: ");
        this.radius = num;
    }

    public double GetRadius(){
        System.out.println("user input a radius number");
        radius = sc.nextDouble();
        return radius;
    }

    public Circle() {

    }

    public double getArea(){
       return Math.pow(radius, 2) * Math.PI;


    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }


}
