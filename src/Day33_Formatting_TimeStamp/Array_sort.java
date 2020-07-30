package Day33_Formatting_TimeStamp;

import java.util.Arrays;

public class Array_sort {
    public static void main(String[] args) {


        int[] arr = {1, 20, 13, 4, 5, 6};
        int[] newArr= new int[arr.length];
        Arrays.sort(arr);
        int k=arr.length-1;
        for(int i=0; arr.length-1>=i;i++){
            newArr[i]=arr[k];
            k--;
        }
        System.out.println(Arrays.toString(newArr));


    }
}
