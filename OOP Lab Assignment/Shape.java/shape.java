/*
============================================================================
 Name : Calculation Of Area
 Author : Lavya Jain
 Description : OOP Lab Assignment No. 4
============================================================================
*/
/*Problem Statement:-
Design a base class shape with two double type values and member
functions to input the data and compute_area() for calculating area of figure. Derive two classes’
triangle and rectangle. Make compute_area() as abstract function and redefine this function in the
derived class to suit their requirements. Write a program that accepts dimensions of
triangle/rectangle and display calculated area. Implement dynamic binding for given case study.*/

import java.util.Scanner;
import java.lang.Math;
abstract class Shape
{
    Scanner sc=new Scanner(System.in);
    abstract void compute_area();
}

class Triangle extends Shape
{
    double side1,side2,side3;

    Triangle(double side1,double side2,double side3)
    {
        super();
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    void compute_area()
    {
        double s;
        s=0.5*(side1+side2+side3);
        double area=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        System.out.println("Area od Traingle:"+area);
    }

}
class Rectangle extends Shape
{
    double length,width;

    Rectangle(double length,double width)
    {
        super();
        this.length=length;
        this.width=width;
    }
    void compute_area()
    {
        double area=length*width;
        System.out.println("Area of Rectangle:"+area);
    }
}
//=============================================class shape===========================================
class shape
{
    public static void main(String args[])
    {
        Triangle t=new Triangle(12.0,13.0,14.0);
        Rectangle r=new Rectangle(9.0,8.0);
        t.compute_area();
        r.compute_area();
    }

}
/*Output->
Area od Traingle:72.30793524918272
Area of Rectangle:72.0*/