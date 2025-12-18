package ex_01_Java_Basics;

public class program008_constants
{
    public static void main(String[] args)
    {
        int a = 99;
        a=101;
        System.out.println(a);

        final float pi = 3.14f;
       // pi = 2.14f; we cannot assign a value to final variable pi
        //final is the keyword which make the variable constant
        System.out.println(pi);
    }
}
