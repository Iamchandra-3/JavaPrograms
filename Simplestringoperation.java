// package AP20110010739_Strings;
//import java.util.*;
public class Simplestringoperation {
    public static void main(String args[]) {
        String s1="Compiler",s2="Interpreter";
        System.out.println("0th index characters from strings :");
        System.out.println(s1.charAt(0));
        System.out.println(s2.charAt(0));
        System.out.println(" lengths of strings: ");
        System.out.println(s1.length());
        System.out.println(s2.length());
        System.out.println("Substrings from indices 2 to 7");
        System.out.println(s1.substring(2, 7));
        System.out.println(s2.substring(2, 7));
        System.out.println("Checking if \'o\' is present ot not " );
        System.out.println(s1.contains("e"));
        System.out.println(s2.contains("e"));
        System.out.println("concating strings with \'#\' : ");
        String s = String.join("#", s1,s2);
        System.out.println(s);
        System.out.println("Finding them same or not:");
        System.out.println(s1.equals(s2));
        System.out.println("findin both strings are empty or not: ");
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println("Concatenating the strings: ");
        System.out.println(s1.concat(s2));
        System.out.println("Replacing 0 letter with z:");
        System.out.println(s1.replace("o", "z"));
        System.out.println(s2.replace('o', 'z'));
        System.out.println("Prints index of \'z\' character if it is there else prints \'-1\' :");
        System.out.println(s1.indexOf("z"));
        System.out.println(s2.indexOf("z"));
        System.out.println("Prints both strings in lower case letters ans uppercase letter: ");
        System.out.println(s1.toLowerCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
   }
}