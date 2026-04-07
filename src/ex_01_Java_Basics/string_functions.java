package ex_01_Java_Basics;

public class string_functions
{
    public static void main(String[] args)
    {
        //string is immutable
        String name = "rachana";
      // String secondname = "kethapelly";
       //name = name.toUpperCase();
        System.out.println(name.toUpperCase()); // Converts string to uppercase.
        System.out.println(name.toLowerCase()); //Converts string to lowercase.
        System.out.println(name.concat(" reddy")); //joins the both strings.
        System.out.println(name.charAt(5)); // it will give tha value at index 5.

        // It compares character by character , as per ASCII code "r" = 114 & "k" is 104 114-104 = 7 ,
        // here rachana comes after kethapelly according to dictionary order so, the result will be positive. if it is vice versa it will give negative value.
        //if it is same , it will give neutral value "0" . This process is called lexicographically.

        System.out.println(name.compareTo("kethapelly"));
        System.out.println(name.compareToIgnoreCase("t"));

        //

        System.out.println(name.codePointAt(4));

    }

}
