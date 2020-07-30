package Day24_Array_Utility;

import java.util.Arrays;

public class Array_Split_Method {
    public static void main(String[] args) {

        String words = "I Love Programming Language";
        String[] arr1 =words.split(" "); // Splitting by space
        System.out.println(Arrays.toString(arr1));

        for(int i=arr1.length-1; i>=0; i--){
            System.out.print(arr1[i]+" ");
        }
        System.out.println("=====================================");

        //=========CONVERTING TO STRING ARRAY==============
        String s = "Java";
        char[] ch = s.toCharArray();//converting to CharArray
        String[] str1 = s.split(""); //convert string to StringArray
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(str1));

    }
}
