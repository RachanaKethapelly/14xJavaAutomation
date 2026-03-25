package ex_01_Java_Basics;

public class program022_userdefinedfunctions
{
    public static void main(String[] args)
    {

        // 1.Without Parameters and Without Return Type
        // 2.Without Parameters but With Return Type
        // 3.With Parameters and Without Return Type
        // 4.With Parameters and With Return Type

        // 1.Without Parameters and Without Return Type
        wop_wor();

        // 2.Without Parameters but With Return Type
        String msg = wop_wr();
        System.out.println(msg);

        // 3.With Parameters and Without Return Type
        wp_wor("rachana", 7,(byte)5 , true , 'r' , 3.14f , 7999l , 26 , 77000);

        // 4.With Parameters and With Return Type
        int sum = wp_wr(3 , 7);
        System.out.println(sum);


    }

    // 1.Without Parameters and Without Return Type
    static void wop_wor()
    {
        System.out.println("This function is Without Parameters and Without Return Type");
    }

    // 2.Without Parameters but With Return Type
    static String wop_wr()
    {
       return "Iamrachana";
    }

    // 3.With Parameters and Without Return Type
    static void wp_wor(String name, int a , byte b , boolean c , char d , float f , long l , int age , double salary)
    {
        System.out.println("my name is -->" + name + " \n int a value = " + a + " \n byte b value = " + b + " \n boolean c value = " + c + " \n char d value = " + d + " \n float f value = " + f + " \n long l value " + l + " \n age = " + age + " \n salary = " + salary);
    }

    // 4.With Parameters and With Return Type
    static int wp_wr(int a , int b)
    {
       return a+b;
    }

}
