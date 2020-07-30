package Day29_Custom_Methods;

import java.util.Arrays;

public class WarmUpTasks {
    public static void main(String[] args) {
        int[] myarr = {123, 145, 2355, 3466, 333, 26, 33, 55};
       int[] myarr2 ={12,23,235,255,245};
        int[] b = combine2Arrays(myarr,myarr2);
        System.out.println(Arrays.toString(b));
    }

    //========Compare 2 numbers===========
    public static void maxNum(int num1, int num2) {
        if (num1 == num2) {
            System.out.println("They are equal");
            return;
        }
        String a = (num1 > num2) ? num1 + " is greater then " + num2 : num2 + " is greater then " + num1;
//        if(num1>num2){
//            System.out.println(num1+" is greater then "+num2);
//        }else{
//            System.out.println(num2+" is greater then "+ num1);
//        }
        System.out.println(a);
    }


    public static void printDesc(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length - 1; i >= 0; i--) {

            System.out.println(arr[i]);

        }

    }

    public static int[] combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int index=0;

        for(int each:arr1){
            arr3[index]=each;
            index++;
        }
        for (int each:arr2){
            arr3[index]=each;
            index++;
        }
        return arr3;
    }
}