package ex_01_Java_Basics;

import java.util.Scanner;

public class program025_edgecasearithmatics
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "enter the value of a");
        int b = readInt(scanner, "enter the value of b");
       /* String c = readstring(scanner , "enter the name of employee");*/


        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_division = division(a,b);
        int result_multiplication = multiplication(a,b);
        int result_modulus = modulus(a,b);



        System.out.println("sum value is " + result_sum);
        System.out.println("sub value is " + result_sub);
        System.out.println("division value is " + result_division);
        System.out.println("multiplication value is " + result_multiplication);
        System.out.println("modulus value is " + result_modulus);

    }

      static int readInt(Scanner scanner , String prompt)
      {
          System.out.println(prompt);
          if(scanner.hasNextInt())
          {
            return scanner.nextInt();
         }else
          {
              System.out.println("enter the int only");
              System.exit(0);
              return 0;
          }


      }
    static int sum(int a , int b)
    {
        return a+b;
    }

    static int sub(int a , int b)
    {
        return a-b;
    }

    static int division(int a , int b)
    {
        if(b==0)
        {
            throw new ArithmeticException("DIVISION NOT ALLOWED WITH ZER0");
        }
        return a/b;
    }

    static int multiplication(int a , int b)
    {

        return a*b;
    }

    static int modulus(int a , int b)
    {
        return a%b;
    }


}
