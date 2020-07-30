package Day34_wrapper;

import java.util.Arrays;

public class Wrapper_Class_Practice {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        Integer[] arr1 = {1,2,3,4,5};

        for(Integer each:arr1){
            System.out.println(each);
        }
        System.out.println("=====================");

        //=========Double array wrapper class ========

        Double[] d1 = {1.9,2.3,3.2,43.3,23.3,42.2}; // You can only assign double nums to Double wrapper array
        for(Double each:d1){
            System.out.println(each);
        }
        System.out.println("======================");


        //=========Char array wrapper class=========

        char[] arr5 = {65,67,68,69};  // if you print this char array , it will return values of nums, not the actual nums
        System.out.println(Arrays.toString(arr5));

        //============String Array

        String[] nums1 = {"12","14","15","16"};
        double[] nums2 = new double[nums1.length];

        for(int i=0; i<=nums1.length-1;i++) {
            nums2[i] = Double.parseDouble(nums1[i]);
        }
        System.out.println(Arrays.toString(nums2));
    }
}
