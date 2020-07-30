package Day25_Excersices;
//How to add 2 arrays into on empty array
//How to create 1 array out of 2 arrays
import java.util.Arrays;

public class CombineTwoArrays {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5};

        int size = arr1.length+arr2.length;

        int[] arr3 = new  int[size];

        int index=0;
        for (int each:arr1){
            arr3[index]=each;
            index++;
        }
        for(int each:arr2){
            arr3[index]=each;
            index++;
        }
        System.out.println(Arrays.toString(arr3));
    }

}
