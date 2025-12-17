package ex_01_Java_Basics;

public class program007_printtablewithoutloop
{
    public static void main(String[] args)
    {
        int r = 7;
        System.out.printf("%d x %-2d =%4d\n", r , 1, r*1);
        System.out.printf("%d x %-2d =%4d\n", r , 2, r*2);
        System.out.printf("%d x %-2.0f =%4d\n", r , 3.0, r*3);
        System.out.printf("%d x %-2.0f =%4d\n", r , 4.0, r*4);
        System.out.printf("%d x %-2d =%4d\n", r , 5, r*5);
        System.out.printf("%d x %-2d =%4d\n", r , 6, r*6);
        System.out.printf("%d x %-2d =%4d\n", r , 7, r*7);
        System.out.printf("%d x %-2d =%4d\n", r , 8, r*8);
        System.out.printf("%d x %-2d =%4d\n", r , 9, r*9);
        System.out.printf("%d x %d =%4d\n", r , 10, r*10);
    }
}
