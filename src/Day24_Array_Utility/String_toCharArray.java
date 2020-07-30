package Day24_Array_Utility;

import java.util.Arrays;

public class String_toCharArray {
    public static void main(String[] args) {
        String str="ABCD";
        char[] ch = str.toCharArray();
        System.out.println(Arrays.toString(ch));
        System.out.println("====================================");

        // ======Create Char Array of the string and compare them========
        String str1 = "DCEBA";
        String str2 = "ADCBE";
        char[] ch1 = str1.toCharArray(); //Converting String to charArray
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1); //Sorting the Arrays
        Arrays.sort(ch2);

        System.out.println(Arrays.equals(ch1,ch2)); //Compare the 2 Arrays
        System.out.println("====================================");






    }
}
