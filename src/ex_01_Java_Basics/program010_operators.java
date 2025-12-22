package ex_01_Java_Basics;

public class program010_operators
{
    public static void main(String[] args)
    {
        //operator is a special symbol which is used to perform mathematical or logical operations
        int a = 10;
        int b = 20;
      //  int c = a+b;
        //Arithmetic operator addition, subtraction, division, multiplication, modulus
        System.out.println("arithmetic operations:");
        System.out.println();
        System.out.println("addition = " + (a+b) );
        System.out.println( "subtraction=" + (a-b));
        System.out.println("division=" + (a/b));
        System.out.println("modulus=" + (a%b)); // modulus
        System.out.println("multiplication=" + (a*b)) ;
        System.out.println();

        //Unary operator ++ , --

        int a2 = 10;
        int a1 = 110;
        System.out.println("unary operations:");
        System.out.println();
        System.out.println("post increment =" + a2++); // a++ is post increment
        System.out.println("post decrement =" + a1--); // a-- post decrement
        System.out.println(a2);
        System.out.println("pre increment =" + ++a2); // ++a pre increment
        System.out.println("pre deccrement =" + --a1); // --a pre decrement
        System.out.println();

      // Assignment operator ( += , -=, *= , /=, %=,  =)

        int b1 = 10; //assigning rhv to lhv
        int b2 = 20;

      //  b1+=b2(b1 = b1+b2 ) , b1-=b2(b1=b1-b2), b2*=b1(b2=b2*b1) b1/=b2(b1=b1/b2) , b1%=b2(b1 = b1%b2)
        System.out.println("assignment operator");
        System.out.println();
        System.out.println(b1+=b2);
        System.out.println( b1-=b2);
        System.out.println(b2*=b1);
        System.out.println(b1/=b2);
        System.out.println(b1%=b2);
        System.out.println();

        //relational operator

        int c1 = 7;
        int c2 = 17;
        System.out.println("relational operator");
        System.out.println();
        System.out.println(c1<c2); // < less than
        System.out.println(c1>c2); // > greater than
        System.out.println(c1<=c2); // <= less than equal to
        System.out.println(c1>=c2); // >= grater than equal to
        System.out.println(c1==c2); // == equal to
        System.out.println(c1!=c2); // != not equal to
        System.out.println();

        //logical operator

        boolean d1 = true;
        boolean d2 = false;
        System.out.println("Logical operator:");
        System.out.println();
        System.out.println(!d1); // not operator

         boolean e1 = d1||d2;      // or operator
        System.out.println(e1);
        boolean e2 = d1 && d2;     // and operator
        System.out.println(e2);
        System.out.println();


        //Bitwise &(AND), |(OR), ^(XOR)

        int f1 = 7;
        int f2 = 17 , g1, g2, g3;
        g1=f1|f2;
        g2=f1&f2;
        g3=f1^f2;
        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);

        //Shift operator >> , <<

        int h1 = 5, h2= 2 ;
        System.out.println(h1>>h2);
        System.out.println(h1<<h2);
    }
}
