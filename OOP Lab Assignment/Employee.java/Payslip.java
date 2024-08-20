/*
============================================================================
 Name : Generating Payslip Of Employee
 Author : Lavya Jain
 Description : OOP Lab Assignment No. 3
============================================================================
*/
//Problem Statement:-
/*Design and develop inheritance for a given case study, identify objects and relationships and
implement inheritance wherever applicable. Employee class with Emp_name, Emp_id, Address,
Mail_id, and Mobile_no as members. Inherit the classes, Programmer, Team Lead, Assistant
Project Manager and Project Manager from employee class. Add Basic Pay (BP) as the member
of all the inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1%
of BP for staff club fund. Generate pay slips for the employees with their gross and net salary.*/

import java.util.Scanner;

class Employee
{
    Scanner sc=new Scanner(System.in);
    String Emp_name,Address,Mail_id;
    long Mobile_no;
    int Emp_id;
    public
    double BP,NP,GP;

    Employee()
    {
    System.out.print("Enter Employee's Name:");
    Emp_name=sc.nextLine();
    System.out.print("Enter Employee's id:");
    Emp_id=sc.nextInt();
    System.out.print("Enter Employee's Residential Address:");
    Address=sc.next();
    System.out.print("Enter Employee's mail id:");
    Mail_id=sc.next();
    System.out.print("Enter Employee's Mobile number:");
    Mobile_no=sc.nextLong();
    if(String.valueOf(Mobile_no).length()!=10)
    {
        System.out.println("Enter Valid Mobile Number!");
        System.exit(0);
    }
    }

    void display() 
    {
        System.out.println("Employee's Name:" +Emp_name);
        System.out.println("Employee's id:"+Emp_id);
        System.out.println("Employee's Residential Address:"+Address);
        System.out.println("Employee's Mail id:"+Mail_id);
        System.out.println("Employee's Mobile number:"+Mobile_no);
        System.out.println("Basic Pay:"+BP);
        System.out.println("Dearness Allowance:"+.97*BP);
        System.out.println("House Rent Allowance:"+.1*BP);
        System.out.println("Provident Fund:"+.12*BP);
        System.out.println("Staff Club Fund:"+.001*BP);
        GP=BP+(.97*BP)+(.1*BP)+(.12*BP);
        NP=BP+(.97*BP)+(.1*BP)-(.001*BP);
        System.out.println("Net Pay:"+NP);
        System.out.println("Gross Pay:"+GP);
    }
}

class Programmer extends Employee
{
    Scanner sc=new Scanner(System.in);
    Programmer()
    {
    super();
    System.out.print("Enter Basic Pay of the Programmer:");
    BP=sc.nextDouble();
    System.out.println();
    }
void display()
{
    System.out.println("=============================="+"\n"+"Programmer Pay Slip"+"\n"+"=============================="+"\n");
    super.display();
}
}
class TeamLead extends Employee
{
    Scanner sc=new Scanner(System.in);
    TeamLead()
    {
    super();
    System.out.print("Enter Basic Pay of the Team Lead:");
    BP=sc.nextDouble();
    System.out.println();
    }
void display()
{
    System.out.println("=============================="+"\n"+"Team Lead Pay Slip"+"\n"+"=============================="+"\n");
    super.display();
}
}
class AssistantProjectManager extends Employee
{
    Scanner sc=new Scanner(System.in);
    AssistantProjectManager()
    {
    super();
    System.out.print("Enter Basic Pay of the Assistant Project Manager:");
    BP=sc.nextDouble();
    System.out.println();
    }

void display()
{
    System.out.println("=============================="+"\n"+" Assistant Project Manager Pay Slip"+"\n"+"=============================="+"\n");
    super.display();
}
}
class ProjectManager extends Employee
{
    Scanner sc=new Scanner(System.in);
    ProjectManager()
    {
    super();
    System.out.print("Enter Basic Pay of the Project Manager:");
    BP=sc.nextDouble();
    System.out.println();
    }

void display()
{
    System.out.println("=============================="+"\n"+" Project Manager Pay Slip"+"\n"+"=============================="+"\n");
    super.display();
}
}

/*=====================================Class Payslip==================================*/

public class Payslip
{
     public static void main (String args[])
{

     Scanner input=new Scanner(System.in);
     String pos;
     System .out.print("Enter Your Designation:");
     pos=input.nextLine();
     
      if (pos.equalsIgnoreCase("Programmer"))
      {
        Programmer obj1=new Programmer();
        obj1.display();
      }
      else if (pos.equalsIgnoreCase("TeamLead"))
      {
        TeamLead obj2=new TeamLead();
        obj2.display();
      }
      else if (pos.equalsIgnoreCase("ProjectManager"))
     {  
        ProjectManager obj3=new ProjectManager();
        obj3.display();
     }
      else if( pos.equalsIgnoreCase("AssistantProjectManager"))
     {
        AssistantProjectManager obj4=new AssistantProjectManager();
        obj4.display();
     }
      else 
     {
        System.out.println("Enter Valid Designation!!");
     }
     
        input.close();
}
}
/*Output->
Enter Your Designation:Programmer
Enter Employee's Name:Lavya
Enter Employee's id:123
Enter Employee's Residential Address:Pune
Enter Employee's mail id:lavya@gmail.com
Enter Employee's Mobile number:8218657765
Enter Basic Pay of the Programmer:10000

==============================
Programmer Pay Slip
==============================

Employee's Name:Lavya
Employee's id:123
Employee's Residential Address:Pune
Employee's Mail id:lavya@gmail.com
Employee's Mobile number:8218657765
Basic Pay:10000.0
Dearness Allowance:9700.0
House Rent Allowance:1000.0
Provident Fund:1200.0
Staff Club Fund:10.0
Net Pay:20690.0
Gross Pay:21900.0
=============================
Enter Your Designation:teamlead
Enter Employee's Name:lavya
Enter Employee's id:123
Enter Employee's Residential Address:Pune
Enter Employee's mail id:lavya@gmail.com
Enter Employee's Mobile number:8218998987
Enter Basic Pay of the Team Lead:10000

==============================
Team Lead Pay Slip
==============================

Employee's Name:lavya
Employee's id:123
Employee's Residential Address:Pune
Employee's Mail id:lavya@gmail.com
Employee's Mobile number:8218998987
Basic Pay:10000.0
Dearness Allowance:9700.0
House Rent Allowance:1000.0
Provident Fund:1200.0
Staff Club Fund:10.0
Net Pay:20690.0
Gross Pay:21900.0
===============================
Enter Your Designation:projectmanager
Enter Employee's Name:lavya
Enter Employee's id:123
Enter Employee's Residential Address:Pune
Enter Employee's mail id:lavya@gmail.com
Enter Employee's Mobile number:8218567765
Enter Basic Pay of the Project Manager:10000

==============================
 Project Manager Pay Slip
==============================

Employee's Name:lavya
Employee's id:123
Employee's Residential Address:Pune
Employee's Mail id:lavya@gmail.com
Employee's Mobile number:8218567765
Basic Pay:10000.0
Dearness Allowance:9700.0
House Rent Allowance:1000.0
Provident Fund:1200.0
Staff Club Fund:10.0
Net Pay:20690.0
Gross Pay:21900.0
==============================
Enter Your Designation:assistantprojectmanager
Enter Employee's Name:lavya
Enter Employee's id:123
Enter Employee's Residential Address:Pune
Enter Employee's mail id:lavya@gmail.com
Enter Employee's Mobile number:8786542348
Enter Basic Pay of the Assistant Project Manager:10000

==============================
 Assistant Project Manager Pay Slip
==============================

Employee's Name:lavya
Employee's id:123
Employee's Residential Address:Pune
Employee's Mail id:lavya@gmail.com
Employee's Mobile number:8786542348
Basic Pay:10000.0
Dearness Allowance:9700.0
House Rent Allowance:1000.0
Provident Fund:1200.0
Staff Club Fund:10.0
Net Pay:20690.0
Gross Pay:21900.0
============================*/