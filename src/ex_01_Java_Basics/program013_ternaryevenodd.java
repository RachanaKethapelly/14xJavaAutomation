package ex_01_Java_Basics;

public class program013_ternaryevenodd
{
    public static void main(String[] args)
    {
        int a = 10;
        String evenorodd = a%2 == 0 ? "a is even" : "a is odd";
        System.out.println(evenorodd);


        //finding max numbers

        int n1 = 2 , n2 = 9, n3 = -11;
        String maxnumber = n1>n2 ? (n2>n3? "n2 is max number": "n3 is  max") : "n2 is max";
        System.out.println(maxnumber);
    }
}
