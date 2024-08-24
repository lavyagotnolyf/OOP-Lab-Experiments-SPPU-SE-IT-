/*
============================================================================
 Name : Generating Payslip Of Employee
 Author : Lavya Jain
 Description : OOP Lab Assignment No. 3
============================================================================
*/
//Problem Statement:-
/*Implement a program to handle Arithmetic exception, Array Index Out Of Bounds.
The user enters two numbers Num1 and Num2. The division of Num1 and Num2 is displayed. If
Num1 and Num2 were not integers, the program would throw a Number Format Exception. If
Num2 were zero, the program would throw an Arithmetic Exception. Display the exception.*/
import java.util.Scanner;
class Exception
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        try
        {
            //prompts the user to enter two integers
            int num1,num2;
            String input1,input2;
            System.out.print("Enter the First Number:");
            input1=sc.next();
            System.out.print("Enter the Second Number:");
            input2=sc.next();

            num1=Integer.parseInt(input1);
            num2=Integer.parseInt(input2);
            
            int result=(num1/num2);
            System.out.println("Result of division is:"+result);
        }

        catch(ArithmeticException e)
        {
            System.out.println("System Throws Arithmetic Exception");

        }
        catch(NumberFormatException e)
        {
            System.out.println("System Throws Number Format Exception");

        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("System Throws ArrayIndexOutOfBounds Exception");
        }
        finally
        {
            sc.close();
        }
    }
}
/*Output->
Enter the First Number:12
Enter the Second Number:11
Result of division is: 1

 */