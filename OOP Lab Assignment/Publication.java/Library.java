/*
============================================================================
 Name : Sale Of Publication
 Author : Lavya Jain
 Description : OOP Lab Assignment No. 2
============================================================================
*/
/*Problem Statement:-
Identify commonalities and differences between Publication, Book and Magazine classes.
Title, Price, Copies are common instance variables and saleCopy() is common method. The
differences are, Book class has data member author and orderCopies(). Magazine Class has
orderQty, Currentissue(), receivessue(). Write a program to find how many copies of the given
books are ordered and display total sale of publication.*/

import java.util.*;

class publication
{
    public
    int om;
    int ob;
    String title;   
    double price;
    int copies;
    void details()
    {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter Title:");
    title=sc.nextLine();
    System.out.print("Enter Price:"+"₹");
    price=sc.nextDouble();
    System.out.print("Enter copies published:");
    copies=sc.nextInt();  
    }
    
    void saleCopy(int number)
    {
        int n=number;
        if (n <= copies )
        {
            double cost=n*price;
            System.out.println("===============================");
            System.out.println("Total Cost of the copies:"+cost);
            System.out.println("Sale of the publication is:"+n);
            System.out.println("===============================");
        }
        else 
        {
            System.out.println("===============================");
            System.out.println("Insufficient Stock!!");
            System.out.println("===============================");
        }
    }
     
    void display()
    {
        System.out.println("Title:"+title+"\n"+"Price:"+price+"\n"+"Copies Published:"+copies);
        System.out.println("===============================");
    }

}

class book extends publication
{
    String writer;
    int a;
    Scanner sc=new Scanner (System.in);
    void author()
    {
        System.out.print("Name of the author:");
        writer =sc.next();
    }
    
    int orderCopies()
    {
        System.out.print("Order Copies are:");
        a=sc.nextInt();
        return a;
    }
}
class magazine extends publication
{
    Scanner sc=new Scanner (System.in);
    int orderQty()
    {
        int b;
        System.out.print("Order Quantity is:");
        b=sc.nextInt();
        return b;
    }
    
    void currentIssue()
    {
        int c;
        System.out.print("Current Issues are:");
        c=sc.nextInt();
    }
    
    void receiveIssue()
    {
        int d;
        System.out.print("Received Issues are:");
        d=sc.nextInt();
    }
}

class Library
{
public static void main (String[] args)
{
    Scanner sc=new Scanner (System.in);
    publication obj1=new publication();
    String choice ;
    System.out.print("Enter Your Choice:");
    choice=sc.nextLine();
    choice=choice.toLowerCase();

    if (choice.equals("book"))
    {
        book obj2=new book();
        obj1.details();
        obj2.author();
        int ob=obj2.orderCopies();
        obj1.saleCopy(ob); 
        obj1.display();
       
    }

    else if (choice.equals("magazine"))
    {
        magazine obj3=new magazine (); 
        obj1.details();
        obj3.currentIssue();
        obj3.receiveIssue(); 
        int om=obj3.orderQty();
        obj1.saleCopy(om);
        obj1.display();
    }    
    else
    {
        System.out.println("Enter Valid Choice");
        System.exit(0);
    }
    sc.close();
}
}
/*Output->
 Enter Your Choice:Book
Enter Title:The Divine Comedy
Enter Price:₹129
Enter copies published:800
Name of the author:Demian
Order Copies are:799
===============================
Total Cost of the copies:103071.0
Sale of the publication is:799
===============================
Title:The Divine Comedy
Price:129.0
Copies Published:800
===============================


Enter Your Choice:Magazine
Enter Title:Forbes
Enter Price:₹152
Enter copies published:101
Current Issues are:50
Received Issues are:30
Order Quantity is:100
===============================
Total Cost of the copies:15200.0
Sale of the publication is:100
===============================
Title:Forbes
Price:152.0
Copies Published:101
===============================


Enter Your Choice:Book
Enter Title:The Divine Comedy
Enter Price:₹149
Enter copies published:500
Name of the author:Demian
Order Copies are:501
===============================
Insufficient Stock!!
===============================
Title:The Divine Comedy
Price:149.0
Copies Published:500
===============================*/

