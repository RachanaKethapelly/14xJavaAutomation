package ex_01_Java_Basics;

public class string_buitinfunctions
{
    public static void main(String[] args)
    {
        String myname = "RACHANA";

        // **1. String Creation and Length**
        System.out.println("\n");
        String firstheading = " 1.String Creation and Length: " ;
        System.out.println(firstheading.toUpperCase()+ "\n");
        System.out.println( " The length of the string is: " + myname.length());  // Returns the length of the string.
        System.out.println(" The string is empty: " + myname.isEmpty()); // Returns true if string is empty (`""` ).
        System.out.println(" The string is blank: " + myname.isBlank()); // Returns true if string is blank(`""` ).
        System.out.println(" The character at index 6 is: " + myname.charAt(6)); //Returns character at specified index.
        System.out.println(" The string object reference is: " + myname.chars()); //It returns an IntStream (a stream of numbers) , It’s just the object reference of the stream
        System.out.print(" The actual characters are: ");
        myname.chars().forEach(c -> System.out.print((char) c + ""));// To actually see characters or values, you must process the stream:
        System.out.println();
        System.out.print(" The ASCII values of characters are: " );
        myname.chars().forEach(c -> System.out.print( c + " ")); // Print Unicode values

        // **2. String Comparison**
        System.out.println("\n");
        String secondtheading = " 2.String Comparison: " ;
        System.out.println(secondtheading.toUpperCase()+ "\n");
        System.out.println(" The string comparison: " + myname.equals("rachana"));
        System.out.println(" The string comparison: " + myname.equals(myname.toUpperCase()));
        System.out.println(" The string comparison: " + myname.equalsIgnoreCase("rachana")); //ignores whether it is uppercase or lower case
        System.out.println(" Lexicographically compares two strings: " + myname.compareTo("rachana"));
        System.out.println(" Lexicographically compares two strings: " + myname.compareToIgnoreCase("rachana")); //ignores whether it is uppercase or lower case

        //**3. Searching and Indexing**
        System.out.println("\n");
        String thirdtheading = " 3.Searching and Indexing: " ;
        System.out.println(thirdtheading.toUpperCase()+ "\n");
        System.out.println(myname.indexOf('R')); //Returns index of first occurrence of character/chars.
        System.out.println(myname.indexOf('A',0));
        System.out.println(myname.indexOf('C',0,3));
        System.out.println(myname.lastIndexOf('A')); //Returns index of last occurrence.
        System.out.println(myname.contains("rac"));
        System.out.println(myname.startsWith("RAC"));
        System.out.println(myname.endsWith("na"));

        //**4. Substring and Manipulation**
        System.out.println("\n");
        String fourthheading = " 4.Substring and Manipulation: " ;
        System.out.println(fourthheading.toUpperCase()+ "\n");


    }
}
