package com.session4;

public class ChildClass1 extends SuperClass
{           //30. ChildClass inhers SuperClass, SuperClass inherits SupermostClass--> Multilevel Inheritance

    void Bike(String type,int wheels, String colour)
    {
        System.out.println("Type of vehicle is: "+type);
        System.out.println("Number of Wheels are: "+wheels);
        System.out.println("Colour of Vehicle is: "+colour);
    }

    void dimensions (int length, int width)
    {
        System.out.println("Length of vehicle is: "+length);
        System.out.println("Width of vehicle is: "+width);
    }

    public static void main(String[] args)
    {
        SuperClass su=new ChildClass1();                  //31. Upcasting Child class-->Superclass
        ChildClass1 ch1=new ChildClass1();
        ch1.Bike("Bike",2, "Ash");      //Single level Inheritance
        ch1.dimensions(70,28);                //32. Method Overriding--> (over riding method of SuperClass)
                                                          //also called, Late Binding/Run-time Polymorphism
    }
}
