package Day34_wrapper;
import  Library.Util;

import java.util.Arrays;

public class Wrapper_call_Method {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        Integer[] arr2 = {5,6,7,8};

        Integer[] arr3 = Util.combine2Arrays(arr1,arr2);
        System.out.println(Arrays.toString(arr3));
        System.out.println("========================");

        Integer a = Util.maxNum(arr2);
        System.out.println(a);
    }
}
