package ex_01_Java_Basics;

import java.util.Arrays;

public class program005_printmethods
{
    public static void main(String[] args)
    {
        //print : prints text without moving to a next line, stays in the same line after printing.

        System.out.print("hello\n");

        //println : prints teaxt and then moves to a next line, automatically adds line break.

        System.out.println("I");
        System.out.println("AM");
        System.out.println("RACHANA");

        //printf - Prints formatted output , Does not automatically add a new line (unless you include \n). Uses format specifiers (like C-style formatting)
        System.out.printf("I am %s\n" , "rachana");
        int age = 27;
        System.out.printf("I am %d\n" , age);
    }
}
