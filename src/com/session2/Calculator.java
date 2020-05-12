package com.session2;

public class Calculator
{
    //----------------------------------------------------------------------------------------------------------
    //21. Creating public nonstatic method with arguments (num1, num2)
    public int addition(int num1, int num2)
    {
        int result=num1+num2;
        return result;
    }
    //----------------------------------------------------------------------------------------------------------
    //22. Method with same name but different arguments (type/number of parameters)--> Method overloading
    public int addition(int num1, int num2, int num3)   //Public Nonstatic-->accessible to all project
    {
        int result=num1+num2+num3;
        return result;
    }
    private float addition(int num1, int num2, float num3)  //Private Nonstatic-->accessible only within class
    {
        float result=num1+num2+num3;
        return result;
    }
    protected static float addition(int num1, float num2)      //protected Static-->accessible only within package
    {
        float result=num1+num2;
        return result;
    }

    public static void main(String[] args)
    {
        Calculator cal=new Calculator();
        int num1=10;
        int num2=20;
        int num3=30;
        float num4=40.50f;
        int add=cal.addition(num1,num2);
        System.out.println("Addition of two numbers is: "+add);
        int add1=cal.addition(num1,num2,num3); //Method overloading with same type and different number of arguments
        System.out.println("Addition with overloaded method (same data type): "+add1);
        float add2=cal.addition(num1,num3,num4); //Method overloading with different type and different number of args
        System.out.println("Addition with overloaded method (different data type): "+add2);
        float add3=addition(num1,num4); ////Method (static) overloading with different type and different number of args
        System.out.println("Addition with overloaded static method (different data type): "+add3);

        //----------------------------------------------------------------------------------------------------------
        //23.Single dimension & Multi-dimension arrays (Array of arrays)

       int arr[]={1,2,3,4,5};                   //single dimension array
       int arr1[][]={{1,2,7},{3,4},{5,6}};      //Multi dimension array

       System.out.println("Single dimension array value at index 3: "+arr[3]);     //Element in 1D array
       System.out.println("size of single dimension array is: "+arr.length);       //size of 1D array
       for(int a:arr)                                                              //printing 1D array
       {
           System.out.println("printing 1D array: "+a);
       }

       System.out.println("Multi-dimension array value at index [1][1]: "+arr1[1][1]); //Element in 2D array
       System.out.println("Size of multi dimension array is: "+arr1.length);       //size of 2D array
       System.out.println("size of second array in multidimensional array is: "+arr1[1].length);//size of array of array
       for(int [] a:arr1)                                                           //printing 2D array
       {
           System.out.print("printing 2D array: ");
           for(int b:a)
           {
               System.out.print(b+" ");
           }
           System.out.println();
       }

     //----------------------------------------------------------------------------------------------------------
     //24. String operations (String value on String pool in Heap memory, Reference stored on stack)

        String str =new String("Software Testing");  // String using String object stored in stack
        String str1="Software Testing";                     // String using literals
        int i=100;

        String str2=str.concat(" Tutorial");  //This concatenation does not affect str (Immutable-->Security,Sync,Cache)
        System.out.println("Printing String str: "+str);
        System.out.println("Printing Concatenated str: "+str2);

        System.out.println("Length of string str: "+str.length());
        System.out.println("Substring of String str: "+ str.substring(0,8));
        System.out.println("Comparing str & str2: "+str.compareTo(str2));
        System.out.println("Converting str into upper case: "+str.toUpperCase());
        System.out.println("Converting str into lower case: "+str.toLowerCase());
        System.out.println("Character at index 3 in str: "+str.charAt(3));
        System.out.println("Replacing character at index 10: "+str.replace("T","t"));
        System.out.println("Replacing substring in str: "+str.replace("Testing","Learning"));
        System.out.println("If str starts with 'S'?: "+str.startsWith("S"));
        System.out.println("If str ends with 'S'?: "+str.endsWith("S"));
        System.out.println("Converting integer into String: "+String.valueOf(i));

        //----------------------------------------------------------------------------------------------------------
        //25. Using String Buffer Class (Good for multithreading -->Read & Write operations are synchronized (one at a time)

        StringBuffer st=new StringBuffer("Software Testing");       //object of stringBuffer
        System.out.println("String using string buffer is: "+st);

        System.out.println("Appending in String: "+st.append(" Tutorial"));     //appending at the end like concat
        System.out.println("Inserting new Character/String in String: "+st.insert(0,"This is ")); //insert at
        System.out.println("Deleting character/string from given string: "+st.delete(0,8)); //delete specific set of char
        System.out.println("Replacing substring with new: "+st.replace(0,8,"Hardware")); //replace set
        System.out.println("Reversing the complete string: "+st.reverse()); //Reversing string character-wise
        System.out.println("Capacity of string: "+st.capacity()); //Indicate capacity of stringBuffer declared in Bytes

        //----------------------------------------------------------------------------------------------------------
        //25. Using String Builder Class (Multi thread operation-->Non-Synchronized, Mutable String, faster but not safe)
        // Faster than String buffer

        StringBuilder stb=new StringBuilder("Software Testing");
        System.out.println("String using string builder: "+stb);
        System.out.println("Appending string into stb: "+stb.append(" Tutorial"));
        System.out.println("Deleting string from stb: "+stb.delete(16,25));
        System.out.println("Inserting new string into stb: "+stb.insert(0,"This is "));
        System.out.println("Reversing String stb: "+stb.reverse());
    }
}
