package ex_01_Java_Basics;

public class program011_Typecasting
{
    public static void main(String[] args)
    {
       /* Typecasting is converting a value from one datatype to another and this done only between compatabile datatype.
        for ex: not integers to string but int byte and long can convert*/

        //widening casting - also called implicit casting occurs when converting a smaller  to larger datatype.

        byte b1 = 10;
        int a1 = b1; //implicit casting - widening
        System.out.println(a1);
        byte b2 = 10;
        int a2 = (int)b2; // explicit casting - widening ,  valid but not needed because JVM directly converts automatically.
        System.out.println(a2);

        //Narrowing casting - occurs when converting a larger  to smaller datatype


        int val = 300;
      //  byte b = val; //Narrowing implicit - not valid

        byte b = (byte) val; // narrowing explicit - valid
        System.out.println(b);

        //one example

        int course = 100;
        float GST = 18.45f;
        int total = course + (int)GST ; //narrowing explicit
        System.out.println(total);

        float total1= course + GST; //widening implicit
        float total2 = (float)course + GST; //widening explicit
        System.out.println(total1);
        System.out.println(total2);





    }
}
