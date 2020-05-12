package com.session3;

public class Calculator
{
    //-------------------------------------------------------------------------------------------------------------
    /* 26. Constructors (invoked by JVM only) --> Parameterised & Non-Parameterised
           default constructor assigns val=0 by default if no value assigned
           constructor overloading--> same name of constructor but different types/number of arguments(parameters)*/

   int val,addition;
    Calculator()        //Non-parameterised constructor
    {
        val=100;        //declaring variables only (not methods)
    }

    Calculator(int val) //Parameterised constructor-->Constructor overloading
    {
        this.val=val;     //this keyword--> used to assign value of variable that have same name as instance variable
    }

    //----------------------------------------------------------------------------------------------------------
    //27. constructor chaining--> calling one constructor from another constructor--> using this,super keywords

    Calculator(int val1, int val2)
    {
        this(10,20,30);  //this() --> used to call constructor within constructor
        addition=val1+val2;
    }
    Calculator(int val3,int val4,int val5)
    {
        addition=val3+val4+val5;
        System.out.println("Addition of three variables through chaining is: "+addition);
    }
    public static void main(String[] args)
    {
        Calculator normalCal=new Calculator();
        Calculator scientificCal=new Calculator(200);
        Calculator chainCal=new Calculator(30,40);
        System.out.println("Printing value of variable in constructor-normal Calculator: "+normalCal.val);
        System.out.println("Printing value of variable in constructor-scientific Calculator: "+scientificCal.val);
        System.out.println("Printing base constructor addition with two parameters: "+chainCal.addition);

    }
}
