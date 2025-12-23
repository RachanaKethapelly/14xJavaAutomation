package ex_01_Java_Basics;

public class program014_maxnumber
{
    public static void main(String[] args)
    {

        int n1 = 2 , n2 = 9, n3 = -11;
        int maxnumber = n1>n2 ?  (n1>n3) ? n1 : n3 : (n2 > n3 ) ? n2 : n3;
        System.out.printf("max is %d" , maxnumber);
    }
}
