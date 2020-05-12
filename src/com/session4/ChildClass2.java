package com.session4;

public class ChildClass2 extends SuperClass         //Inheriting SuperClass
{       //29. ChildClass1 & ChildClass2 are inheritating same SuperClass--> Heirarchical Inheritance

    void Car(String type,int wheels, String colour, Auxillary aux1,Auxillary aux2)  //Accessing object into method
    {
        System.out.println("Type of vehicle is: "+type);
        System.out.println("Number of Wheels are: "+wheels);
        System.out.println("Colour of Vehicle is: "+colour);

        System.out.println("Length of vehicle is: "+aux1.length);
        System.out.println("Width of vehicle is: "+aux1.width);
        System.out.println("Ground Tolerance is: "+aux2.groundTolerance);
        System.out.println("Cost of vehicle is: "+aux2.cost);
    }

    public static void main(String[] args)
    {
        Auxillary aux1=new Auxillary(100, 400);
        Auxillary aux2=new Auxillary(18.2,750000);
        ChildClass2 ch2=new ChildClass2();
        ch2.Car("Car",4,"Magenta",aux1,aux2);   //33.Inheritance with objects as parameters

    }
}
