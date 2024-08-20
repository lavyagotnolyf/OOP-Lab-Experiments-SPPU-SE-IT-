/*
============================================================================
 Name : Implementing Interface
 Author : Lavya Jain
 Description : OOP Lab Assignment No. 5
============================================================================
*/
/*Problem Statement:
Design and develop a context for given case study and implement an interface for Vehicles
Consider the example of vehicles like bicycle, car, and bike. All Vehicles have common
functionalities such as Gear Change, Speed up and apply breaks . Make an interface and put all
these common functionalities. Bicycle, Bike, Car classes should be implemented for all these
functionalities in their own class in their own way.*/
import java.util.Scanner;
interface Vehicle
{
    Scanner sc=new Scanner(System.in);
    void details();
    void gear_change(int new_gear);
    void speed_up(int increment);
    void apply_brakes(int decrement);

class Bicycle implements Vehicle
{
    private int gear=0;
    int speed;
   
    public void details()
    {
        System.out.print("Enter Current Speed in Km/hr:");
        speed=sc.nextInt();
    }
   
    public void gear_change(int new_gear)
    {
        this.gear=new_gear;
        System.out.println("Bicyle's New Gear Changed to "+gear);
    }
   
    public void speed_up(int increment)
    {
        this.speed+=increment;
        System.out.println("Bicyle's New Speed Changed to "+speed);
    }
   
    public void apply_brakes(int decrement)
    {
        this.speed-=decrement;
        System.out.println("Bicyle's New Speed Changed to "+speed);
    }
}

class Bike implements Vehicle
{
    private int gear=0;
    int speed;
    public void details()
    {
        System.out.print("Enter Current Speed in Km/hr:");
        speed=sc.nextInt();
    }
     
    public void gear_change(int new_gear)
    {
        this.gear=new_gear;
        System.out.println("Bike's Gear Changed to "+gear);
    }
   
    public void speed_up(int increment)
    {
        this.speed+=increment;
        System.out.println("Bike's Speed Changed to "+speed);
    }
   
    public void apply_brakes(int decrement)
    {
        this.speed-=decrement;
        System.out.println("Bike Speed Changed to "+speed);
       
    }
}

class Car implements Vehicle
{
    private int gear=0;
    int speed;
    public void details()
    {
        System.out.print("Enter Current Speed in Km/hr:");
        speed=sc.nextInt();
    }
   
    public void gear_change(int new_gear)
    {
        this.gear=new_gear;
        System.out.println("Car's gear changed to "+gear);
    }
   
    public void speed_up(int increment)
    {
        this.speed+=increment;
        System.out.println("Car's speed changed to "+speed);
    }
   
    public void apply_brakes(int decrement)
    {
        this.speed-=decrement;
        System.out.println("Car's speed changed to "+speed); 
    }
}
//==========================Main method=================================
 public static void main(String args[])
    {
        int choice;
        do
        {
        System.out.println("1.Bicycle");
        System.out.println("2.Bike");
        System.out.println("3.Car");
        System.out.print("Enter your choice from the folowing:");
        choice=sc.nextInt();

        switch(choice)
        {
        case 1:
        Vehicle Bicycle=new Bicycle();
        Bicycle.details();
        Bicycle.gear_change(3);
        Bicycle.speed_up(30);
        Bicycle.apply_brakes(35);
        System.out.println();
        break;

        case 2:
        Vehicle Bike=new Bike();
        Bike.details();
        Bike.gear_change(4);
        Bike.speed_up(50);
        Bike.apply_brakes(10);
        System.out.println();
        break;

        case 3:
        Vehicle Car=new Car();
        Car.details();
        Car.gear_change(4);
        Car.speed_up(25);
        Car.apply_brakes(20);
        System.out.println();
        break;

        default:
        System.out.println("Enter Valid Choice.Please Try Again.");
        }
    }while(true);
    }
}
/*Output->
1.Bicycle
2.Bike
3.Car
Enter your choice from the folowing:1
Enter Current Speed in Km/hr:40
Bicyle's New Gear Changed to 3
Bicyle's New Speed Changed to 70
Bicyle's New Speed Changed to 35

1.Bicycle
2.Bike
3.Car
Enter your choice from the folowing:2
Enter Current Speed in Km/hr:55
Bike's Gear Changed to 4
Bike's Speed Changed to 105
Bike Speed Changed to 95

1.Bicycle
2.Bike
3.Car
Enter your choice from the folowing:3
Enter Current Speed in Km/hr:60
Car's gear changed to 4
Car's speed changed to 85
Car's speed changed to 65
 */