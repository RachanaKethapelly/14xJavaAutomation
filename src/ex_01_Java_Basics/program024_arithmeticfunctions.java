package ex_01_Java_Basics;

import java.util.Scanner;

public class program024_arithmeticfunctions
{
    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value of a");
        int a = scanner.nextInt();
        System.out.println("enter the value of b");
        int b = scanner.nextInt();

        int result_sum = sum(a,b);
        int result_sub = sub(a,b);
        int result_multiplication = multiplication(a,b);
        int result_division = division(a,b);

        System.out.println("sum is " + result_sum);
        System.out.println("sub is " + result_sub);
        System.out.println("multiplication is " + result_multiplication);
        System.out.println("division is " + result_division);


    }

    static int sum(int a, int b)
    {
        return a+b;
    }
    static int sub(int a, int b)
    {
        return a-b;
    }

    static int multiplication(int a, int b)
    {
        return a*b;
    }
    static int division(int a, int b)
    {
        return a/b;
    }
}
