package com.session4;

public class Auxillary
{
    int length,width;
    double groundTolerance;
    long cost;

    public Auxillary(int width, int length)              //parameterized constructor-1
    {
        this.width=width;
        this.length=length;
    }

    public Auxillary(double groundTolerance, long cost)  //parameterized constructor-2 -->(Constructor Overloading)
    {
        this.groundTolerance=groundTolerance;
        this.cost=cost;
    }

    public Auxillary() {  }    //if user defined constructor defined JVM overwrites default constructor
                                // Hence, needs to define blank constructor
    public void invoice()
    {
        System.out.println("Model: "+"BMW");
        System.out.println("Accesories: "+7000);
        System.out.println("Principle Cost: "+750000);

    }

    public void invoice(String model,int acc, int cost)
    {
        System.out.println("Model: "+model);
        System.out.println("Accesories: "+acc);
        System.out.println("Principle Cost: "+cost);

    }

    public static void main(String[] args)
    {
        Auxillary aux3=new Auxillary();
        aux3.invoice();                                      //method-1 is here!!!
        aux3.invoice("Toyota",85000,870000); //Method overloading-->method-2 have same name as method-1
                                                            // also called Early binding/Compile time Polymorphism
    }
}
