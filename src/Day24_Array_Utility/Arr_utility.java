package Day24_Array_Utility;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
// ============Array Methods===========
/*
Inorder to print the array into Screen you need to convert to String
1.Arrays.toString() -- convert any array to String
2.Arrays.sort(str) -------sorts the array in Accending order
3.Arrays.equals(arr1,arr2) --compare 2 arrays

 */

public class Arr_utility {
    public static void main(String[] args) {

//=========Arrays.sort============
        String[] students = {"Almaz", "Sultan", "Rakhat"};
        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
        System.out.println("====================================");

        //=====Arrays.equals=========
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        System.out.println(Arrays.equals(arr1,arr2));
        System.out.println("====================================");

        int[] arr3 = {7,8,9}; //arr3 and arr4 are not equal, to make them equal need to sort them
        int[] arr4 = {8,7,9};
        System.out.println(Arrays.equals(arr3,arr4)); // gives false before sorting
        System.out.println("====================================");

        Arrays.sort(arr4);
        System.out.println(Arrays.equals(arr3,arr4)); // gives true after sorting


    }
}