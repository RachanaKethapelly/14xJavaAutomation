package ex_01_Java_Basics;

import java.util.Scanner;

public class program021_scannerfunction
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scanner.nextInt();;
        System.out.println("enter the value of b");
        int b = scanner.nextInt();

        int result = sum_of_two_number(a,b);
        int result_2 = sum_of_two_number(22,35);
        int result_3 = sum_of_two_number(777,256);
        System.out.println(result);
        System.out.println(result_2);
        System.out.println(result_3);


    }

    static int sum_of_two_number(int a , int b)
    {
        return a+b;
    }

    static void sum_of_twonumber()
    {
        System.out.println("there is no return function for void");
    }

}
