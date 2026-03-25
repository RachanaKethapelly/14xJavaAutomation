package ex_01_Java_Basics;

public class program020_functionswithreturntypes
{
    public static void main(String[] args)
    {
        non_return_type_function(); // not return type function

        int value =  return_type_function(); // return type function for int
        System.out.println("int return type = " + value);

      String name =   return_type_functions(); // return type function for string
        System.out.println("string return type = " + name);

       boolean term =  return_type_booleanfunction();  // return type function for boolean
        System.out.println("boolean return type = " + term);

      float decimalvalues =  return_type_floatfunction();  // return type function for float
        System.out.println("float return type = " + decimalvalues);

      byte values =   return_type_bytefunction()  ;    // return type function for byte
        System.out.println("byte return type = " + values);

      long digits =   return_type_longfunction();      // return type function for long
        System.out.println("long return type = " + digits);

      char alphabets = return_type_charfunction();
        System.out.println("char return type = " + alphabets);

       char[] arrayvalue =  return_type_charfunctions();
        System.out.println("chararray return type = " + arrayvalue);

    }


    static void non_return_type_function()
    {
        System.out.println("Hi, it is a non return type function");
    }

    // Return Type - which return a data type (int, String, char, boolean, float)

    static int return_type_function()
    {
        return 709199;
       // System.out.println("Hi, I will return the function");
    }

    static String return_type_functions()
    {
     System.out.println("Hi, I will return the function");
     return "rachana";
    }

    static boolean return_type_booleanfunction()
    {
        return true;
    }

    static float return_type_floatfunction()
    {
        return 3.14f;
    }

    static byte return_type_bytefunction()
    {
        return 7;
    }

    static long return_type_longfunction()
    {
        return 7999l;
    }

    static char return_type_charfunction()
    {
        return 'r';

    }

    static char[] return_type_charfunctions()
    {
        return new char[]{'r', 'a', 'c', 'h', 'a', 'n', 'a'};

    }

}

