/*
============================================================================
 Name : Complex Numbers
 Author : Lavya Jain
 Description : OOP Lab Assignment No. 1
============================================================================
*/
//Problem Statement:-
/*Create a class called Complex for performing arithmetic on complex numbers.
Complex numbers have the form a+bi where a is real part and b is imaginary part and i=√-1.
Use floating point variables to represent the private data of the class. Provide constructor that
enable an object to be initialized when it is declared. Provide a argument constructor with default
values in case no initializers are provided. Provide public methods for addition, subtraction,
multiplication and division of complex numbers. Pass objects of Complex as parameters of the
method.*/

import java.util.Scanner;

class Complex_number
{
    float real,img;
    public Complex_number()
    {//Default Constructor
        real=0;
        img=0;
    }
    public Complex_number(float a,float b)
    {//Parameterised Constructor
        real=a;
        img=b;
    }
    public void AddNumbers(Complex_number C1,Complex_number C2)
    {//Addition Of Numbers
        float real,img;
        real=(C1.real+C2.real);
        img=(C1.img+C2.img);
        System.out.println("Addition of Complex Numbers="+(real)+"+"+(img)+"i");

    }
    public void SubNumbers(Complex_number C1,Complex_number C2)
    {//Substraction Of Numbers
        float real,img;
        real=(C1.real-C2.real);
        img=(C1.img-C2.img);
        System.out.println("Substraction of Complex Numbers="+(real)+"+"+(img)+"i");
    }
    public void MultiNumbers(Complex_number C1,Complex_number C2)
    {//Multiplication Of Numbers
        float real,img;
        real=((C1.real*C2.real)-(C1.img*C2.img));
        img=((C1.real*C2.img)+(C1.img*C2.real));
        System.out.println("Multiplication of Complex Numbers="+(real)+"+"+(img)+"i");

    } 
    public void DivNumbers(Complex_number C1,Complex_number C2) {
		//division of two complex number
		float real,img;
		real=(C1.real*C2.real+C1.img*C2.img)/(C2.real*C2.real+C2.img*C2.img);
		img=(C1.img*C2.real-C1.real*C2.img)/(C2.real*C2.real+C2.img*C2.img);
		System.out.println("Division of Complex Numbers="+(real)+"+"+(img)+"i");

	} 
}
//=============================================Class Complex===========================================

public class Complex
{
public static void main(String args[])
{
    float num1,num2;
    Scanner sc=new Scanner(System.in);
    Complex_number calc=new Complex_number();
    System.out.println("Enter the Complex Number in a+bi format->");

    System.out.print("Enter real part of the first Complex Number:");
    num1=sc.nextFloat();
    System.out.print("Enter imaginary part of the first Complex Number:");
    num2=sc.nextFloat();
    Complex_number com1=new Complex_number(num1,num2);

    System.out.print("Enter real part of the second Complex Number:");
    num1=sc.nextFloat();
    System.out.print("Enter imaginary part of the second Complex Number:");
    num2=sc.nextFloat();
    Complex_number com2=new Complex_number(num1,num2);

    System.out.println("\n");
    calc.AddNumbers(com1, com2);
    System.out.println("\n");
    calc.SubNumbers(com1, com2);
    System.out.println("\n");
    calc.MultiNumbers(com1, com2);
    System.out.println("\n");
    calc.DivNumbers(com1, com2);
    sc.close();
}
}
/*Output->
Enter the Complex Number in a+bi format->
Enter real part of the first Complex Number:1
Enter imaginary part of the first Complex Number:2
Enter real part of the second Complex Number:3
Enter imaginary part of the second Complex Number:4


Addition of Complex Numbers=4.0+6.0i


Substraction of Complex Numbers=-2.0+-2.0i


Multiplication of Complex Numbers=-5.0+10.0i


Division of Complex Numbers=0.44+0.08i */


