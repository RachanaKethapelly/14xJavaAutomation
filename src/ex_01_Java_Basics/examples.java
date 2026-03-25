package ex_01_Java_Basics;

public class examples {
    public static void main(String[] args) {
        /*StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(" ");
        sb.append("world");
        String result = sb.toString(); // "Hello world"
        System.out.println(result);*/
/*
        int i = 5;
        int j = i++ + ++i;
        System.out.println("i: " + i + ", j: " + j);*/


        String s = "Rachana" ;
        //String r  = ""  ;
        StringBuilder stringbuilder = new StringBuilder(s);

        stringbuilder.reverse();
        String reversedstring = stringbuilder.toString();
        System.out.println(s);
        System.out.println(reversedstring);
       /* for (int i = 0; i < s.length(); i++)
        {
           r = s.charAt(i) + r;
        }
        System.out.println(r);*/
    }

}
