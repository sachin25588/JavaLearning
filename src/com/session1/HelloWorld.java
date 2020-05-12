package com.session1;

public class HelloWorld
{
    final int instancevarible=10;  // final instance variable--> non-changing once defined
    int instancevariable2=100;    // instance variable--> accessible in nonstatic method directly & not in static
    static int staticvariable;   // static/class variable -->  accessible by any methods

    private void PrivateNonstaticMethod()
    {
        System.out.println("private nonstatic method");
        //----------------------------------------------------------------------------------------------------------
//        instancevarible=40;       //7. final variable once defined, cannot be changed
        //----------------------------------------------------------------------------------------------------------
          instancevariable2=50;     //11. instance variable can be directly called in nonstatic method
          System.out.println("Instance variable called in nonstatic method: "+instancevariable2);
        //----------------------------------------------------------------------------------------------------------
          staticvariable=60;        //13. static/calss variable can be directly called in any method
        System.out.println("Static variable called in nonstatic method: "+ staticvariable);
    }

    static void StaticMethod()
    {
        System.out.println("Static method");
//        instancevarible+1; //8. instance variable cannot be called in static method
        //----------------------------------------------------------------------------------------------------------
//           instancevariable2=100;  //12. Instance variable cannot be called in static method
        //----------------------------------------------------------------------------------------------------------
          staticvariable=70;    //14. static variable is directly called in static method
          System.out.println("Static variable called in static method: "+ staticvariable);
    }

    public static void main(String[] args)
    {
        System.out.println("Hello World");  //1. Basic print string
        //----------------------------------------------------------------------------------------------------------
        StaticMethod();       // 2. Static method can be called within same class w/o object
        HelloWorld.StaticMethod();      // 3. static method can be called as classname.method_name
        //----------------------------------------------------------------------------------------------------------
        HelloWorld hello=new HelloWorld();  //Object-1 for class
        hello.PrivateNonstaticMethod();     // 4. private nonstatic method called in same class only using object
        System.out.println("private Instance variable is:"+hello.instancevarible); //9. instance variable using object

        //----------------------------------------------------------------------------------------------------------
       // 10. Note: Instance variable is accessible by object & nonstatic methods. It can be defined one per object
        System.out.println("Instance variable for object1: "+hello.instancevariable2);
        HelloWorld hello1=new HelloWorld(); //Object-2 for class
        hello1.instancevariable2=20;
        System.out.println("Instance variable for object2: "+hello1.instancevariable2);
        HelloWorld hello2=new HelloWorld(); //Object-3 for class
        hello2.instancevariable2=30;
        System.out.println("Instance variable for object3: "+hello2.instancevariable2);
        //----------------------------------------------------------------------------------------------------------
        //15. Primitive datatypes and type casting (Implicit/up-casting & Explicit/down-casting)
        byte b=1;
        long l=10;
        int i=100;
        char c='a';
        String s="hello";
        float f=100.5f;
        double d=150.1;
        boolean bl=true;

        System.out.println("Byte b: "+b);
        System.out.println("Long l: "+l);
        System.out.println("Integer i: "+i);
        System.out.println("Character c: "+c);
        System.out.println("String s: "+s);
        System.out.println("Float f: "+f);
        System.out.println("Double d: "+d);
        System.out.println("Boolean bl: "+bl);

        System.out.println("What will be i+s: "+ i+s);  // String+Integer+String= String
        System.out.println("What will be i+d without casting: "+ i+d);  // String+Integer+Double = String
        System.out.println("What will be b+c: "+ s+d);  // String+ String+double= String

        double x=i+d;  //type casting (integer-->double)--> upcast
        System.out.println("What will be i+d upcast: "+ x);    // Displaying double-->up-casted

        int y=i+(int)d; //type casting (double-->integer)--> downcast
        System.out.println("What will be i+d downcast: "+ y);    // Displaying integer-->down-casted (information loss)
        //----------------------------------------------------------------------------------------------------------
        //16. Type casting using Wrapper Class

        String str="27";
        String str1="23.55";
        int in=25;
        float fl=22.35f;
        double dbl=35.33f;

        System.out.println("String to Integer: "+Integer.parseInt(str));            //String-->Integer
        System.out.println("String to Integer: "+Integer.valueOf(str));             //String-->Integer

        System.out.println("Integer to String: "+Integer.toString(in));             //Integer-->String
        System.out.println("Integer to BinaryString: "+Integer.toBinaryString(in)); //Integer-->Binary String
        System.out.println("Integer to OctalString: "+Integer.toOctalString(in));   //Integer-->Octal String
        System.out.println("Integer to HexString: "+Integer.toHexString(in));       //Integer-->Hex String

        System.out.println("String to Float: "+Float.parseFloat(str1));         //String-->Float
        System.out.println("String to Float: "+Float.valueOf(str1));            //String-->Float
        System.out.println("Float to String: "+Float.toString(fl));             //Float-->String
        System.out.println("Float to BinaryString: "+Float.toHexString(fl));    //Float-->Hex String

        System.out.println("String to Double: "+Double.valueOf(str1));          //String-->Double
        System.out.println("String to Double: "+Double.parseDouble(str1));      //String-->Double
        System.out.println("Double to String: "+Double.toString(dbl));          //Double-->String
        System.out.println("Double to HexString: "+Double.toHexString(dbl));    //Double-->Hex String
        //----------------------------------------------------------------------------------------------------------
        //17. using ternary operator

        int e=10;
        int g=21;
        boolean ter=e>g?true:false;     //using ternary operator
        System.out.println("let, e=20 & g=21 then, if e>g ?: "+ter);
        //----------------------------------------------------------------------------------------------------------
        //18. using Switch- Case statements

        switch (e)
        {
            case 10:System.out.println("Value of e is 10"); break;
            case 20:System.out.println("Value of e is 20"); break;
            case 30:System.out.println("Value of e is 30"); break;
            default:System.out.println("Value is neither of 10,20,30");
        }
        //----------------------------------------------------------------------------------------------------------
        //19. for-each loop

        int[] arr={10,20,30,40};
        int j=0;
        for(int ele: arr)   // for each element (ele) in array (arr)
        {
            System.out.println("arr["+j+"]:"+ele);
            j++;
        }

        //----------------------------------------------------------------------------------------------------------
        //20. break & continue statements

        for(int k=10;k>0;k--)
        {
           if(k==7)
           {
               System.out.println("Breaking rest of iteration");
               break;               //break statement discontinues remaining iteration of for loop when condition met
           }
            System.out.println("Decrementing up to 7: "+k);
        }

        for(int n=10;n>0;n--)
        {
            if(n==7)
            {
                System.out.println("Skipping 7, skipping current iteration");
                continue;               // continue statement skips current iteration when condition met
            }
            System.out.println("Decrementing up to 7: "+n);
        }

    }
}
