package com.session1;

public class AccessModifierTest
{
    public static void main(String[] args)
    {
        HelloWorld hello=new HelloWorld();
//        hello.PrivateNonstaticMethod();        //4. private method is only accessible within a class
        hello.StaticMethod();   // 5. static method call using class object (Not recommended) need extra memory
        HelloWorld.StaticMethod(); // 6. static method call using class name (recommended)

    }
}
