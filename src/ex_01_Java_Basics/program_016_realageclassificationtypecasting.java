package ex_01_Java_Basics;

public class program_016_realageclassificationtypecasting
{
    public static void main(String[] args)
    {
        String user_input = args[0];
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        int age = Integer.parseInt(user_input);
        System.out.println(age);

        String result = age<18? "minor" :(age<60)? "Adult" : "senior citizen";
        System.out.println(result);
    }
}
