package day15_StringMethods;

import java.sql.SQLOutput;

public class StringMethods1 {
    public static void main(String[] args) {
        String str2 = "Cybertek";
        str2 = str2+""+ "School";
        String str3= "Hello Batch 20, Have a Wonderful day";
        System.out.println(str2);


        char ch2 = str2.charAt(str2.length()-1);
        System.out.println(ch2);
        System.out.println(str2.length());

        //========".substring()"==============================
        System.out.println(str2.substring(0, str2.length()));


        //=========".indexOf"======================
        System.out.println(str3.indexOf("W")); // Will return index of  letter "W";

        //=========".charAt"======================
        System.out.println(str3.charAt(19)); //Will return value at index 19;

        //=========".replace, replaceFirst"======================

        System.out.println(str3.replace("a", "b")); // Will replace all the matching strings;
        System.out.println(str3.replaceFirst("e", "H")); //Will replace first matching string;



    }
}
