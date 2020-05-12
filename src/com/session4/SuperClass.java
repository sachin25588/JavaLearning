package com.session4;

public class SuperClass extends SupermostClass
{
    //28. One child class (here, SuperClass) is inheritating only one parent class (here, SupermostClass)

    String colour;
    float groundTolerance;
    int length,width;

    void dimensions (int length, int width)
    {
        this.length=length;
        this.width=width;
    }

    public SuperClass()
    {
        System.out.println(" Vehicle Specifications");
    }

}
